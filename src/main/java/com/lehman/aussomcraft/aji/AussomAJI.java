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
 *
 * Ported from the aussom reference implementation. The only functional
 * change is that class names resolve through AjiGate.getClassLoader()
 * rather than ClassLoader.getSystemClassLoader(); inside a Paper plugin the
 * system loader cannot see org.bukkit at all. See
 * design/aussomcraft-design-1.md section 3.
 */

package com.lehman.aussomcraft.aji;

import com.aussom.Environment;
import com.aussom.ast.astClass;
import com.aussom.ast.aussomException;
import com.aussom.stdlib.ABuffer;
import com.aussom.types.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.List;

public class AussomAJI extends AussomJavaObject {

    public class GenericInvocationHandler implements InvocationHandler {
        protected Environment env;
        protected AussomAJI aji;
        protected AussomCallback callback;
        public GenericInvocationHandler(Environment Env, AussomAJI Aji, AussomCallback Callback) {
            this.env = Env;
            this.aji = Aji;
            this.callback = Callback;
        }

        @Override
        public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
            if (method.getDeclaringClass() == Object.class) {
                if ("hashCode".equals(method.getName())) {
                    return System.identityHashCode(o);
                } else if ("equals".equals(method.getName())) {
                    return o == objects[0];
                } else if ("toString".equals(method.getName())) {
                    return "AussomClosureProxy(" + this.callback.toString() + ")";
                }
            }

            AussomCallback ac = this.callback;
            AussomList args = new AussomList();

            if (objects != null) {
                for (Object obj : objects) {
                    args.add(this.aji.mapResultObject(this.env, obj));
                }
            }

            AussomType ret = ac.call(this.env, args);
            if (ret.isEx()) {
                this.env.getEngine().getLogger().err(ret.toString());
            }
            return this.aji.getClassAussomTypeValue(ret);
        }
    }

    /** True for the primitive component names listToJavaArray accepts. */
    private static boolean isPrimitiveName(String n) {
        return "double".equals(n) || "int".equals(n) || "long".equals(n)
            || "float".equals(n) || "boolean".equals(n) || "byte".equals(n)
            || "short".equals(n) || "char".equals(n);
    }

    public class ConstructorMatch {
        public Constructor<?> constructor;
        public List<Object> args = new ArrayList<>();
    }

    public AussomType invokeStatic(Environment env, ArrayList<AussomType> args) throws aussomException {
        String javaObjName = (((AussomString) args.get(0)).str());
        String javaMethodName = (((AussomString) args.get(1)).str());

        AussomList etcArgs = (AussomList) args.get(2);
        List<AussomType> constArgs = etcArgs.getValue();

        AussomType denied = null;
        if (denied == null) { denied = AjiGate.checkFlag(env, "aussom.aji.static.invoke", "aji.invokeStatic()"); }
        if (denied == null) { denied = AjiGate.checkClass(env, javaObjName, "aji.invokeStatic()"); }
        if (denied != null) { return denied; }

        try {
            Class<?> cl = Class.forName(javaObjName, true, AjiGate.getClassLoader());
            MethodMatch mm = this.getMatch(null, cl, javaMethodName, constArgs);

            if (mm.method != null) {
                // Match found, attempt to invoke.
                try {
                    mm.method.setAccessible(true);
                    Object retObj = mm.method.invoke(null, mm.args.toArray());

                    // It is alread an aussom type, no wrapping needed.
                    if (retObj instanceof AussomType)
                        return (AussomType) retObj;

                    // Not an Aussom type, map the result.
                    return this.mapResultObject(env, retObj);
                } catch (Exception e) {
                    return new AussomException("AussomJavaObject.invoke(): In Java class '" + javaMethodName + "' method invoke exception: " + AussomJavaObject.causeMessage(e));
                }
            } else {
                throw new aussomException("AussomJavaObject.newObj(): In Java class '" + javaMethodName + "' could not find a matching method '" + javaMethodName + "' for the provided arguments.");
            }
        } catch (ClassNotFoundException e) {
            throw new aussomException("aji.invokeStatic(): Java class '" + javaObjName + "' not found. Is the .jar file in the classpath?");
        }
    }

    public AussomType invokeStaticRaw(Environment env, ArrayList<AussomType> args) throws aussomException {
        String javaObjName = (((AussomString) args.get(0)).str());
        String javaMethodName = (((AussomString) args.get(1)).str());

        AussomList etcArgs = (AussomList) args.get(2);
        List<AussomType> constArgs = etcArgs.getValue();

        AussomType denied = null;
        if (denied == null) { denied = AjiGate.checkFlag(env, "aussom.aji.static.invoke", "aji.invokeStaticRaw()"); }
        if (denied == null) { denied = AjiGate.checkClass(env, javaObjName, "aji.invokeStaticRaw()"); }
        if (denied != null) { return denied; }

        try {
            Class<?> cl = Class.forName(javaObjName, true, AjiGate.getClassLoader());
            MethodMatch mm = this.getMatch(null, cl, javaMethodName, constArgs);

            if (mm.method != null) {
                // Match found, attempt to invoke.
                try {
                    mm.method.setAccessible(true);
                    Object retObj = mm.method.invoke(null, mm.args.toArray());

                    // It is alread an aussom type, no wrapping needed.
                    if (retObj instanceof AussomType)
                        return (AussomType) retObj;

                    // Not an Aussom type, wrap result object.
                    return this.wrapRawObject(env, retObj);
                } catch (Exception e) {
                    return new AussomException("AussomJavaObject.invokeStaticRaw(): In Java class '" + javaMethodName + "' method invoke exception: " + AussomJavaObject.causeMessage(e));
                }
            } else {
                throw new aussomException("AussomJavaObject.invokeStaticRaw(): In Java class '" + javaMethodName + "' could not find a matching method '" + javaMethodName + "' for the provided arguments.");
            }
        } catch (ClassNotFoundException e) {
            throw new aussomException("aji.invokeStaticRaw(): Java class '" + javaObjName + "' not found. Is the .jar file in the classpath?");
        }
    }

    public AussomType getStaticMember(Environment env, ArrayList<AussomType> args) throws aussomException {
        String javaObjName = (((AussomString) args.get(0)).str());
        String javaMemberName = (((AussomString) args.get(1)).str());

        AussomType denied = null;
        if (denied == null) { denied = AjiGate.checkFlag(env, "aussom.aji.static.getmember", "aji.getStaticMember()"); }
        if (denied == null) { denied = AjiGate.checkClass(env, javaObjName, "aji.getStaticMember()"); }
        if (denied != null) { return denied; }

        try {
            Class<?> cl = Class.forName(javaObjName, true, AjiGate.getClassLoader());
            Field field = cl.getDeclaredField(javaMemberName);
            field.setAccessible(true);
            Object robj = field.get(null);
            return this.mapResultObject(env, robj);
        } catch (ClassNotFoundException e) {
            throw new aussomException("aji.getStaticMember(): Java class '" + javaObjName + "' not found. Is the .jar file in the classpath?");
        } catch (NoSuchFieldException e) {
            throw new aussomException("aji.getStaticMember(): Java class '" + javaObjName + "' static field '" + javaMemberName + "' not found.");
        } catch (IllegalAccessException e) {
            throw new aussomException("aji.getStaticMember(): Java class '" + javaObjName + "' static field '" + javaMemberName + "' illegal access exception.");
        }
    }

    public AussomType setStaticMember(Environment env, ArrayList<AussomType> args) throws aussomException {
        String javaObjName = (((AussomString) args.get(0)).str());
        String javaMemberName = (((AussomString) args.get(1)).str());
        AussomType aval = (AussomType)args.get(2);

        AussomType denied = null;
        if (denied == null) { denied = AjiGate.checkFlag(env, "aussom.aji.static.setmember", "aji.setStaticMember()"); }
        if (denied == null) { denied = AjiGate.checkClass(env, javaObjName, "aji.setStaticMember()"); }
        if (denied != null) { return denied; }

        try {
            Class<?> cl = Class.forName(javaObjName, true, AjiGate.getClassLoader());
            Field field = cl.getDeclaredField(javaMemberName);
            field.setAccessible(true);
            Object jobj = this.getClassAussomTypeValue(aval);
            if (jobj != null || !(aval instanceof AussomNull)) {
                field.set(null, jobj);
            } else {
                // Attempt to coerce.
                CoercedValue cv = new CoercedValue();
                this.attemptCoercion(field.getType(), aval, cv);
                if (cv.val != null) {
                    field.set(null, cv.val);
                } else {
                    throw new aussomException("aji.getStaticMember(): Java class '" + javaObjName + "' field '" + javaMemberName + "' can't find suitable conversion from Aussom type '" + aval.getType().name() + "' to Java type '" + field.getType().getName() + "'.");
                }
            }
        } catch (ClassNotFoundException e) {
            throw new aussomException("aji.getStaticMember(): Java class '" + javaObjName + "' not found. Is the .jar file in the classpath?");
        } catch (NoSuchFieldException e) {
            throw new aussomException("aji.getStaticMember(): Java class '" + javaObjName + "' field '" + javaMemberName + "' not found.");
        } catch (IllegalAccessException e) {
            throw new aussomException("aji.getStaticMember(): Java class '" + javaObjName + "' field '" + javaMemberName + "' illegal access exception.");
        }
        return env.getClassInstance();
    }

    public AussomType newObj(Environment env, ArrayList<AussomType> args) throws aussomException {
        String javaObjName = (((AussomString)args.get(0)).str());

        AussomList etcArgs = (AussomList) args.get(1);
        List<AussomType> constArgs = etcArgs.getValue();

        AussomType denied = null;
        if (denied == null) { denied = AjiGate.checkFlag(env, "aussom.aji.object.create", "aji.newObj()"); }
        if (denied == null) { denied = AjiGate.checkClass(env, javaObjName, "aji.newObj()"); }
        if (denied != null) { return denied; }

        try {
            Class<?> cl = Class.forName(javaObjName, true, AjiGate.getClassLoader());
            ConstructorMatch cm = this.getConstructorMatch(cl, constArgs);
            cm.constructor.setAccessible(true);
            if (cm.constructor != null) {
                // Match found, attempt to invoke.
                try {
                    Object newObj = cm.constructor.newInstance(cm.args.toArray());
                    AussomObject ret = env.getEngine().instantiateObject("AussomJavaObject");
                    AussomJavaObject ajo = (AussomJavaObject) ret.getExternObject();
                    ajo.setName(javaObjName);
                    ajo.setObj(newObj);
                    return ret;
                } catch (Exception e) {
                    return new AussomException("aji.newObj(): In Java class '" + javaObjName + "' constructor instantiation exception: " + AussomJavaObject.causeMessage(e));
                }
            } else {
                throw new aussomException("aji.newObj(): In Java class '" + javaObjName + "' could not find a matching constructor for the provided arguments.");
            }
        } catch (ClassNotFoundException e) {
            throw new aussomException("aji.newObj(): Java class '" + javaObjName + "' not found. Is the .jar file in the classpath?");
        }
    }

    public AussomType bufferToInputStream(Environment env, ArrayList<AussomType> args) throws aussomException {
        AussomObject ao = (AussomObject) args.get(0);
        if (ao.getExternObject() instanceof ABuffer) {
            ABuffer ab = (ABuffer) ao.getExternObject();
            AussomObject newObj = env.getEngine().instantiateObject("AussomJavaObject");
            AussomJavaObject ajo = (AussomJavaObject) newObj.getExternObject();
            ajo.setObj(new ByteArrayInputStream(ab.getBuffer()));
            return newObj;
        } else {
            throw new aussomException("aji.bufferToInputStream(): Expected object of type 'Buffer' but found '" + ao.getClassDef().getName() + "'.");
        }
    }

    public AussomType inputStreamToBuffer(Environment env, ArrayList<AussomType> args) throws aussomException {
        AussomObject ao = (AussomObject) args.get(0);
        if (ao.getExternObject() instanceof AussomJavaObject) {
            AussomJavaObject ajo = (AussomJavaObject) ao.getExternObject();
            if (ajo.getObj() instanceof InputStream) {
                InputStream is = (InputStream) ajo.getObj();
                astClass ac = env.getClassByName("Buffer");
                AussomObject ret = (AussomObject) ac.instantiate(env, false, new AussomList());
                ABuffer ab = (ABuffer) ret.getExternObject();
                try {
                    ab.setBuffer(is.readAllBytes());
                } catch (IOException e) {
                    throw new aussomException("aji.bufferToInputStream(): IOException while reading InputStream bytes: " + e.getMessage());
                }
                return ret;
            } else {
                throw new aussomException("aji.bufferToInputStream(): Expected wrapped AussomJavaObject to be of type 'InputStream' but found '" + ajo.getObj().getClass().getName() + "'.");
            }
        } else {
            throw new aussomException("aji.bufferToInputStream(): Expected object of type 'AussomJavaObject' but found '" + ao.getClassDef().getName() + "'.");
        }
    }

    /**
     * Converts an Aussom list to a Java array of the specified type.
     * Supports primitive types (double, int, long, float, boolean,
     * byte, short) and object types by fully qualified class name.
     */
    public AussomType listToJavaArray(Environment env, ArrayList<AussomType> args) throws aussomException {
        String javaClassName = ((AussomString) args.get(0)).str();
        AussomList items = (AussomList) args.get(1);

        // Primitive component names are keywords, not classes, and are
        // resolved without loading anything; everything else names a class
        // that Class.forName would otherwise initialize unchecked.
        if (!isPrimitiveName(javaClassName)) {
            AussomType denied = AjiGate.checkClass(env, javaClassName,
                "aji.listToJavaArray()");
            if (denied != null) { return denied; }
        }

        try {
            Class<?> componentType;
            boolean isPrimitive = true;
            switch (javaClassName) {
                case "double": componentType = double.class; break;
                case "int": componentType = int.class; break;
                case "long": componentType = long.class; break;
                case "float": componentType = float.class; break;
                case "boolean": componentType = boolean.class; break;
                case "byte": componentType = byte.class; break;
                case "short": componentType = short.class; break;
                default:
                    componentType = Class.forName(javaClassName, true, AjiGate.getClassLoader());
                    isPrimitive = false;
                    break;
            }

            Object array = Array.newInstance(componentType, items.size());
            for (int i = 0; i < items.size(); i++) {
                AussomType at = items.getValue().get(i);
                Object val = this.getClassAussomTypeValue(at);
                if (isPrimitive && val instanceof Number) {
                    if (componentType == double.class) Array.setDouble(array, i, ((Number) val).doubleValue());
                    else if (componentType == int.class) Array.setInt(array, i, ((Number) val).intValue());
                    else if (componentType == long.class) Array.setLong(array, i, ((Number) val).longValue());
                    else if (componentType == float.class) Array.setFloat(array, i, ((Number) val).floatValue());
                    else if (componentType == byte.class) Array.setByte(array, i, ((Number) val).byteValue());
                    else if (componentType == short.class) Array.setShort(array, i, ((Number) val).shortValue());
                } else if (componentType == boolean.class && val instanceof Boolean) {
                    Array.setBoolean(array, i, (Boolean) val);
                } else {
                    Array.set(array, i, val);
                }
            }

            AussomObject ret = env.getEngine().instantiateObject("AussomJavaObject");
            AussomJavaObject ajo = (AussomJavaObject) ret.getExternObject();
            ajo.setName(javaClassName + "[]");
            ajo.setObj(array);
            return ret;
        } catch (ClassNotFoundException e) {
            throw new aussomException("aji.listToJavaArray(): Java class '" + javaClassName + "' not found.");
        } catch (Exception e) {
            throw new aussomException("aji.listToJavaArray(): " + e.getMessage());
        }
    }

    /**
     * Converts an Aussom list to a Java ArrayList. Each element
     * is converted from its Aussom type to the corresponding Java
     * type automatically.
     */
    public AussomType listToJavaArrayList(Environment env, ArrayList<AussomType> args) throws aussomException {
        AussomList items = (AussomList) args.get(0);

        ArrayList<Object> arrayList = new ArrayList<Object>();
        for (int i = 0; i < items.size(); i++) {
            AussomType at = items.getValue().get(i);
            Object val = this.getClassAussomTypeValue(at);
            arrayList.add(val);
        }

        AussomObject ret = env.getEngine().instantiateObject("AussomJavaObject");
        AussomJavaObject ajo = (AussomJavaObject) ret.getExternObject();
        ajo.setName("java.util.ArrayList");
        ajo.setObj(arrayList);
        return ret;
    }

    public AussomType closure(Environment env, ArrayList<AussomType> args) throws aussomException, ClassNotFoundException {
        String className = ((AussomString)args.get(0)).getValue();
        AussomCallback ac = (AussomCallback)args.get(1);

        // Implementing an interface is reaching a Java class like any
        // other, and Class.forName below initializes it. fx.getClosure,
        // fx.actionEventHandler and the cell factories all route here, so
        // this one check covers them too.
        AussomType denied = AjiGate.checkClass(env, className, "aji.closure()");
        if (denied != null) { return denied; }

        AussomObject ret = env.getEngine().instantiateObject("AussomJavaObject");

        Class<?> cl = Class.forName(className, true, AjiGate.getClassLoader());
        Method methods[] = cl.getMethods();
        if (methods.length > 0) {
            methods[0].setAccessible(true);
            String name = methods[0].getName();
            Type types[] = methods[0].getGenericParameterTypes();
            Class<?> retType = methods[0].getReturnType();
            Parameter parameters[] = methods[0].getParameters();

            // The reference implementation passed a loader from one of its
            // own classes here. The gate's loader is the equivalent and is
            // the one that can see both JDK and Bukkit interfaces.
            Object handler = (Object) Proxy.newProxyInstance(AjiGate.getClassLoader(),
              new Class[] { cl },
              new GenericInvocationHandler(env,this, ac));

            AussomJavaObject ajo = (AussomJavaObject) ret.getExternObject();
            ajo.setName(handler.getClass().getCanonicalName());
            ajo.setObj(handler);
        }

        return ret;
    }

    private ConstructorMatch getConstructorMatch(Class<?> cl, List<AussomType> constArgs) {
        ConstructorMatch cm = this.getConstructorExactMatch(cl, constArgs);
        if (cm.constructor != null) return cm;
        else {
            Constructor<?> constructors[] = cl.getConstructors();
            cm = this.findConstructorFromList(constructors, constArgs);
            if (cm.constructor != null) return cm;
        }
        return new ConstructorMatch();
    }

    private ConstructorMatch getConstructorExactMatch(Class<?> cl, List<AussomType> constArgs) {
        ConstructorMatch cm = new ConstructorMatch();
        Class<?> typeArgs[] = new Class<?>[constArgs.size()];

        for (int i = 0; i < constArgs.size(); i++) {
            AussomType at = constArgs.get(i);
            typeArgs[i] = this.getClassType(at);
            cm.args.add(this.getClassAussomTypeValue(at));
        }

        try {
            cm.constructor = cl.getConstructor(typeArgs);
        } catch (NoSuchMethodException e) {
            // Do nothing, we expect this
        }

        return cm;
    }

    private ConstructorMatch findConstructorFromList(Constructor<?> constructors[], List<AussomType> constArgs) {
        ConstructorMatch match = new ConstructorMatch();

        boolean found = true;
        for (Constructor constructor : constructors) {
            found = true;
            if (constructor.getParameterCount() == constArgs.size()) {
                // This may be the one!
                if (constArgs.size() == 0) {
                    match.constructor = constructor;
                    break;
                } else {
                    // Check the args, if they can be coerced.
                    List<Object> targs = new ArrayList<>();
                    int num = 0;
                    for (Parameter param : constructor.getParameters()) {
                        AussomType arg = constArgs.get(num);
                        Class<?> tmpType = this.getClassType(arg);
                        if (tmpType != null && (tmpType == param.getType() || param.getType() == Object.class)) {
                            // Look for the direct convert
                            targs.add(this.getClassAussomTypeValue(arg));
                        } else {
                            // No direct conversion, attempt first level coercion.
                            CoercedValue tobj = new CoercedValue();
                            if (!this.attemptCoercion(param.getType(), arg, tobj)) {
                                found = false;
                                break;
                            }
                            targs.add(tobj.val);
                        }
                        num++;
                    }
                    if (found) {
                        // Hurray, we made it here!
                        match.constructor = constructor;
                        match.args = targs;
                        break;
                    }
                }
            }
        }

        return match;
    }
}
