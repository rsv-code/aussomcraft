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

package com.lehman.aussomcraft.profile;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.aussom.Limits;
import com.aussom.SecurityManagerImpl;

import com.lehman.aussomcraft.aji.AjiGate;

/**
 * The profile every script gets unless an operator says otherwise.
 *
 * No AJI, so the only way into Java is the five host externs, and the extern
 * allowlist says those are the only classes an 'extern class' may name. That
 * is the whole curation story: one list naming the packages this plugin
 * ships.
 *
 * @author Austin Lehman
 */
public class UntrustedPolicy extends SecurityManagerImpl {

    /** Turns aussom-base's extern class allowlist on. */
    public static final String EXTERN_ENFORCE = "aussom.extern.allowlist.enforce";

    /** The Java classes an 'extern class' declaration may name. */
    public static final String EXTERN_ALLOWED = "aussom.extern.allowed";

    /** Whether an include may resolve through a symbolic link. */
    public static final String SYMLINK_FOLLOW = "aussom.include.symlink.follow";

    /**
     * The extern classes a script may bind. The two interpreter packages are
     * mandatory, not a choice: the Engine constructor parses lang.aus, whose own
     * externs name them, so denying either denies every engine. The AJI package
     * is deliberately absent.
     */
    protected static final String[] BASE_EXTERN_ALLOWED = {
        "com.aussom.stdlib.*",
        "com.aussom.types.*",
        "com.lehman.aussomcraft.host.*",
    };

    /**
     * The generated shim package this tier may bind, and only this one.
     *
     * This is the tier boundary the interpreter enforces for us. Each tier's
     * shims are separate Java classes carrying only that tier's methods, so
     * naming another tier's package is the only way to reach its API, and
     * the allowlist refuses the name.
     *
     * It also keeps com.lehman.aussomcraft.paper itself off the list, so
     * Marshal, PaperObj and the rest are not nameable by any script.
     *
     * @return A String with the package prefix this tier may bind.
     */
    protected String paperPackage() {
        return "com.lehman.aussomcraft.paper.gen.untrusted.*";
    }

    /**
     * Largest script file the engine will parse. A file is read whole into
     * memory before the parser sees a token, so this is the one parse cost
     * worth bounding.
     */
    private static final long MAX_SOURCE_BYTES = 1024L * 1024L;

    /**
     * Builds the untrusted policy.
     *
     * @param Loader is the class loader the engine resolves extern classes
     * through. Inside a Paper plugin this must be the plugin's own loader:
     * the system loader holds Paperclip and nothing else, so it can see
     * neither com.aussom.* nor this plugin's host externs.
     */
    public UntrustedPolicy(ClassLoader Loader) {
        super();

        this.engineClassLoader = Loader;

        // AJI does not exist. Every flag is named explicitly so that no
        // policy question is answered by an absent key.
        this.props.put("aussom.aji.invoke", false);
        this.props.put("aussom.aji.getmember", false);
        this.props.put("aussom.aji.setmember", false);
        this.props.put("aussom.aji.object.create", false);
        this.props.put("aussom.aji.static.invoke", false);
        this.props.put("aussom.aji.static.getmember", false);
        this.props.put("aussom.aji.static.setmember", false);

        // The flags above already deny, so an empty enforced list changes
        // nothing today. It is here so that a flag regressing to true does
        // not silently open the gate: an empty list denies everything.
        this.props.put(AjiGate.ENFORCE, true);
        this.props.put(AjiGate.ALLOWED, new ArrayList<String>());

        this.props.put(EXTERN_ENFORCE, true);
        this.props.put(EXTERN_ALLOWED, this.externAllowed());

        // An include that resolves through a link keeps the path inside the
        // scripts directory while the file it reaches does not.
        this.props.put(SYMLINK_FOLLOW, false);

        // A script must never be able to rewrite its own policy. False in
        // the base manager too; restated because the whole design leans on
        // it, and because a regression here is silent.
        this.props.put("securitymanager.property.set", false);

        this.props.put(Limits.SOURCE_BYTES_PROP, MAX_SOURCE_BYTES);
    }

    /**
     * The extern allowlist this profile installs. Subclasses widen it by
     * overriding.
     *
     * @return A List of class names and 'pkg.*' prefixes.
     */
    protected List<String> externAllowed() {
        List<String> out = new ArrayList<String>(Arrays.asList(BASE_EXTERN_ALLOWED));
        out.add(this.paperPackage());
        return out;
    }

    /**
     * The extern allowlist currently installed, for tests and for the
     * command that reports policy.
     *
     * @return An unmodifiable List of the entries.
     */
    @SuppressWarnings("unchecked")
    public List<String> getExternAllowed() {
        Object cur = this.props.get(EXTERN_ALLOWED);
        if (cur instanceof List) {
            return Collections.unmodifiableList((List<String>) cur);
        }
        return Collections.emptyList();
    }
}
