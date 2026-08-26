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
import java.util.List;

import com.lehman.aussomcraft.aji.AjiGate;

/**
 * The tier that can take over or take down the server.
 *
 * It gets the generated modules the other tiers withhold, and it gets AJI,
 * which reaches anything on the class path: other plugins, the JDK, the
 * server internals. Nothing here is a mistake to be corrected later; this is
 * what the name says.
 *
 * @author Austin Lehman
 */
public class DangerousPolicy extends TrustedPolicy {

    /** This plugin's AJI package, which is what lets aji.aus parse. */
    private static final String AJI_PACKAGE = "com.lehman.aussomcraft.aji.*";

    /**
     * Builds the dangerous policy.
     *
     * @param Loader is the class loader the engine resolves extern classes
     * through.
     */
    public DangerousPolicy(ClassLoader Loader) {
        super(Loader);

        this.props.put("aussom.aji.invoke", true);
        this.props.put("aussom.aji.getmember", true);
        this.props.put("aussom.aji.setmember", true);
        this.props.put("aussom.aji.object.create", true);
        this.props.put("aussom.aji.static.invoke", true);
        this.props.put("aussom.aji.static.getmember", true);
        this.props.put("aussom.aji.static.setmember", true);

        // Enforcing, with a list that admits everything. The permission is
        // written in policy data an operator can narrow, rather than in a
        // boolean that removes the mechanism.
        this.props.put(AjiGate.ENFORCE, true);
        this.props.put(AjiGate.ALLOWED, new ArrayList<String>(Arrays.asList("*")));

        // Still false. A script here has arbitrary Java and can reach the
        // trust file anyway, but nothing should hand it a supported API for
        // changing its own gates.
        this.props.put("securitymanager.property.set", false);

        // Reinstalled for the same reason TrustedPolicy does it: the base
        // constructors ran before this class's overrides were in play.
        this.props.put(EXTERN_ALLOWED, this.externAllowed());
    }

    /**
     * Only the dangerous shims, plus AJI.
     *
     * @return A String with the dangerous shim package.
     */
    @Override
    protected String paperPackage() {
        return "com.lehman.aussomcraft.paper.gen.dangerous.*";
    }

    @Override
    protected List<String> externAllowed() {
        List<String> out = super.externAllowed();
        out.add(AJI_PACKAGE);
        return out;
    }
}
