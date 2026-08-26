/*
 * Copyright 2026 Austin Lehman
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.lehman.aussomcraft.gen;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.body.Parameter;

/**
 * Argument names and documentation, read from Paper's sources jar.
 *
 * The compiled jar carries neither: Paper is not built with -parameters, so
 * reflection reports arg0 and arg1, and javadoc never survives compilation.
 * The sources jar has both.
 *
 * Types are parsed on demand and cached, because only the ones being
 * generated are ever asked for.
 *
 * @author Austin Lehman
 */
public final class Docs {

    /** What the generator needs about one method. */
    /**
     * What this generator takes from Paper's sources: parameter names, and
     * nothing else.
     *
     * The descriptions used to be read too, and were written into every
     * generated module. Paper is GPL 3.0 and this project is Apache 2.0, so
     * that put roughly three quarters of the generated content, by volume,
     * under someone else's license inside our jar. Generated modules now
     * carry a link to Paper's own documentation instead.
     *
     * The prose fields are gone rather than merely unused, so nothing can
     * put them back by accident. A parameter name is not prose: it is needed
     * to call the method and there is no other way to write it.
     */
    public static class MethodDoc {

        /** Parameter names in order, already capitalised for Aussom. */
        public final List<String> params = new ArrayList<String>();

        /**
         * Parameter type names in order, reduced to simple names.
         *
         * Only here to tell one overload from another. Two methods with the
         * same name and the same argument count are told apart by their
         * types, and this is the source's view of them.
         */
        public final List<String> paramTypes = new ArrayList<String>();
    }

    private final JarFile sources;

    /**
     * Parsed types, by class name. Null means the source was not usable.
     *
     * Every overload is kept, not one per name and argument count. Keying on
     * the count alone lost all but one of a same-arity group, which is
     * exactly the group that needs telling apart.
     */
    private final Map<String, Map<String, List<MethodDoc>>> cache =
        new HashMap<String, Map<String, List<MethodDoc>>>();

    /**
     * Opens the sources jar.
     *
     * @param SourcesJar is the paper-api sources jar.
     * @throws IOException when it cannot be read.
     */
    public Docs(String SourcesJar) throws IOException {
        this.sources = new JarFile(SourcesJar);
    }

    /**
     * The source's view of one method, matched on its signature.
     *
     * @param ClassName is the declaring class.
     * @param Method is the method name.
     * @param ParamTypes is the compiled parameter types, in order.
     * @return A MethodDoc, or null when the sources do not describe it.
     */
    public MethodDoc lookup(String ClassName, String Method, Class<?>[] ParamTypes) {
        Map<String, List<MethodDoc>> byType = this.forType(ClassName);
        if (byType == null) {
            return null;
        }
        List<MethodDoc> group = byType.get(Method + "/" + ParamTypes.length);
        if (group == null || group.isEmpty()) {
            return null;
        }
        if (group.size() == 1) {
            return group.get(0);
        }
        for (MethodDoc doc : group) {
            if (matches(doc, ParamTypes)) {
                return doc;
            }
        }
        // The source and the compiled form disagree, which happens with
        // generics the parser reports differently. Names are better than no
        // names, and the arity is right, so the first is a fair guess.
        return group.get(0);
    }

    /** Whether a parsed declaration is the one these compiled types describe. */
    private static boolean matches(MethodDoc Doc, Class<?>[] ParamTypes) {
        if (Doc.paramTypes.size() != ParamTypes.length) {
            return false;
        }
        for (int i = 0; i < ParamTypes.length; i++) {
            if (!Doc.paramTypes.get(i).equals(simpleName(ParamTypes[i]))) {
                return false;
            }
        }
        return true;
    }

    /**
     * A compiled type as the source would have written it.
     *
     * @param Type is the parameter type.
     * @return A String with its simple name, arrays kept as Name[].
     */
    public static String simpleName(Class<?> Type) {
        return Type.getSimpleName();
    }

    /**
     * A source type as the compiled form would report it.
     *
     * Generics are dropped because the compiled signature has none, varargs
     * become an array because that is what they compile to, and a qualified
     * name is reduced to its last segment.
     *
     * @param Written is the type exactly as the source wrote it.
     * @return A String with the simple name.
     */
    static String normalize(String Written) {
        String s = Written.trim();
        int lt = s.indexOf('<');
        while (lt >= 0) {
            int depth = 0;
            int i = lt;
            for (; i < s.length(); i++) {
                if (s.charAt(i) == '<') {
                    depth++;
                } else if (s.charAt(i) == '>') {
                    depth--;
                    if (depth == 0) {
                        break;
                    }
                }
            }
            if (i >= s.length()) {
                break;
            }
            s = s.substring(0, lt) + s.substring(i + 1);
            lt = s.indexOf('<');
        }
        if (s.endsWith("...")) {
            s = s.substring(0, s.length() - 3) + "[]";
        }
        int dot = s.lastIndexOf('.');
        if (dot >= 0) {
            s = s.substring(dot + 1);
        }
        return s.replace(" ", "");
    }

    private Map<String, List<MethodDoc>> forType(String ClassName) {
        if (this.cache.containsKey(ClassName)) {
            return this.cache.get(ClassName);
        }
        Map<String, List<MethodDoc>> out = this.parse(ClassName);
        this.cache.put(ClassName, out);
        return out;
    }

    private Map<String, List<MethodDoc>> parse(String ClassName) {
        JarEntry e = this.sources.getJarEntry(ClassName.replace('.', '/') + ".java");
        if (e == null) {
            return null;
        }
        CompilationUnit unit;
        try (InputStream in = this.sources.getInputStream(e)) {
            unit = StaticJavaParser.parse(in);
        } catch (Exception notParseable) {
            // A source the parser cannot read is not worth failing over; the
            // method simply gets generated without documentation.
            return null;
        }

        Map<String, List<MethodDoc>> out = new HashMap<String, List<MethodDoc>>();
        for (MethodDeclaration m : unit.findAll(MethodDeclaration.class)) {
            MethodDoc doc = new MethodDoc();
            for (Parameter p : m.getParameters()) {
                doc.params.add(capital(p.getNameAsString()));
                String written = p.getType().asString();
                if (p.isVarArgs()) {
                    written = written + "[]";
                }
                doc.paramTypes.add(normalize(written));
            }
            String key = m.getNameAsString() + "/" + m.getParameters().size();
            List<MethodDoc> group = out.get(key);
            if (group == null) {
                group = new ArrayList<MethodDoc>();
                out.put(key, group);
            }
            group.add(doc);
        }
        return out;
    }




    private static String capital(String Name) {
        if (Name == null || Name.isEmpty()) {
            return Name;
        }
        return Character.toUpperCase(Name.charAt(0)) + Name.substring(1);
    }

    /** Closes the sources jar. */
    public void close() throws IOException {
        this.sources.close();
    }
}
