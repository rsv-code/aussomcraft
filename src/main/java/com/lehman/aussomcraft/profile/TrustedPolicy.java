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


/**
 * The working tier: the full Paper API, less anything that leaves the game
 * world.
 *
 *
 * No filesystem, no network, no class loading, and no server control. Those
 * are withheld by the generator rather than by a runtime check: the modules
 * this tier registers simply do not declare them.
 *
 * @author Austin Lehman
 */
public class TrustedPolicy extends UntrustedPolicy {

    /**
     * Builds the trusted policy.
     *
     * No AJI here. What separates this tier from untrusted is which
     * generated Paper modules the loader registers, not a Java gate.
     *
     * @param Loader is the class loader the engine resolves extern classes
     * through. See UntrustedPolicy.
     */
    public TrustedPolicy(ClassLoader Loader) {
        super(Loader);
        // The constructor of the base class already installed the untrusted
        // package, because it ran before this override existed. Put the list
        // back with this tier's package instead.
        this.props.put(EXTERN_ALLOWED, this.externAllowed());
    }

    /**
     * Only the trusted shims. An engine at this tier registers only the
     * trusted modules, and those bind only trusted shim classes, so nothing
     * here needs the untrusted package as well.
     *
     * @return A String with the trusted shim package.
     */
    @Override
    protected String paperPackage() {
        return "com.lehman.aussomcraft.paper.gen.trusted.*";
    }
}
