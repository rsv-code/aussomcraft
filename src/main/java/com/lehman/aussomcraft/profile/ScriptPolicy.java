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
 * The security manager a script runs under.
 *
 * One class for all three tiers, because a tier is a small set of property
 * values and nothing more. The tiers differ in exactly three ways: whether
 * AJI is on, which generated shim package a script may bind, and whether the
 * AJI package itself is bindable. Everything else is identical at every
 * tier, and stating it once is what keeps it that way.
 *
 * This was three classes in an inheritance chain. The base constructor
 * called an overridable method to build the extern allowlist, so it ran
 * before the subclass that answered it existed, and both subclasses had to
 * put the list back afterwards. Nothing needed the hierarchy, so the hazard
 * went with it.
 *
 * @author Austin Lehman
 */
public class ScriptPolicy extends SecurityManagerImpl {

    /** Turns aussom-base's extern class allowlist on. */
    public static final String EXTERN_ENFORCE = "aussom.extern.allowlist.enforce";

    /** The Java classes an 'extern class' declaration may name. */
    public static final String EXTERN_ALLOWED = "aussom.extern.allowed";

    /** Whether an include may resolve through a symbolic link. */
    public static final String SYMLINK_FOLLOW = "aussom.include.symlink.follow";

    /**
     * Every AJI gate aussom-base offers. Named in full rather than left
     * absent, so that no policy question is answered by a missing key.
     */
    private static final String[] AJI_PROPS = {
        "aussom.aji.invoke",
        "aussom.aji.getmember",
        "aussom.aji.setmember",
        "aussom.aji.object.create",
        "aussom.aji.static.invoke",
        "aussom.aji.static.getmember",
        "aussom.aji.static.setmember",
    };

    /**
     * The extern classes every tier may bind. The two interpreter packages
     * are mandatory, not a choice: the Engine constructor parses lang.aus,
     * whose own externs name them, so denying either denies every engine.
     */
    private static final String[] BASE_EXTERN_ALLOWED = {
        "com.aussom.stdlib.*",
        "com.aussom.types.*",
        "com.lehman.aussomcraft.host.*",
    };

    /**
     * Where the generated shims live, less the tier. The generator names
     * that last segment after the tier id, and PaperModules.install looks
     * its modules up the same way, so the two stay in step by construction.
     */
    private static final String SHIM_PACKAGE = "com.lehman.aussomcraft.paper.gen.";

    /** This plugin's AJI package, which is what lets aji.aus parse. */
    private static final String AJI_PACKAGE = "com.lehman.aussomcraft.aji.*";

    /**
     * Largest script file the engine will parse. A file is read whole into
     * memory before the parser sees a token, so this is the one parse cost
     * worth bounding.
     */
    private static final long MAX_SOURCE_BYTES = 1024L * 1024L;

    /**
     * Builds the policy for one tier.
     *
     * @param Loader is the class loader the engine resolves extern classes
     *        through. Inside a Paper plugin this must be the plugin's own
     *        loader: the system loader holds Paperclip and nothing else, so
     *        it can see neither com.aussom.* nor this plugin's host externs.
     * @param Tier is the tier the script runs at.
     */
    public ScriptPolicy(ClassLoader Loader, Profile Tier) {
        super();

        this.engineClassLoader = Loader;

        // AJI is the whole of what the dangerous tier has and the others do
        // not. Below it the gates are off, so the only way into Java is the
        // host externs.
        boolean aji = false;
        if (Tier == Profile.DANGEROUS) {
            aji = true;
        }
        for (String prop : AJI_PROPS) {
            this.props.put(prop, aji);
        }

        // Enforcing at every tier. Below dangerous the flags above already
        // deny and the list is empty, which denies everything on its own, so
        // a flag regressing to true does not silently open the gate. At
        // dangerous the permission is written in policy data an operator can
        // narrow rather than in a boolean that removes the mechanism.
        List<String> ajiAllowed = new ArrayList<String>();
        if (aji) {
            ajiAllowed.add("*");
        }
        this.props.put(AjiGate.ENFORCE, true);
        this.props.put(AjiGate.ALLOWED, ajiAllowed);

        // The tier boundary the interpreter enforces for us. Each tier's
        // shims are separate Java classes carrying only that tier's methods,
        // so naming another tier's package is the only way to reach its API,
        // and the allowlist refuses the name. It also keeps
        // com.lehman.aussomcraft.paper itself off the list, so Marshal,
        // PaperObj and the rest are not nameable by any script.
        List<String> externs = new ArrayList<String>(Arrays.asList(BASE_EXTERN_ALLOWED));
        externs.add(SHIM_PACKAGE + Tier.getId() + ".*");
        if (aji) {
            externs.add(AJI_PACKAGE);
        }
        this.props.put(EXTERN_ENFORCE, true);
        this.props.put(EXTERN_ALLOWED, externs);

        // An include that resolves through a link keeps the path inside the
        // scripts directory while the file it reaches does not.
        this.props.put(SYMLINK_FOLLOW, false);

        // A script must never be able to rewrite its own policy. False in
        // the base manager too; restated because the whole design leans on
        // it, and because a regression here is silent. It stays false at the
        // dangerous tier as well: a script there has arbitrary Java and can
        // reach the trust file anyway, but nothing should hand it a
        // supported API for changing its own gates.
        this.props.put("securitymanager.property.set", false);

        this.props.put(Limits.SOURCE_BYTES_PROP, MAX_SOURCE_BYTES);
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
