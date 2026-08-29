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

package com.lehman.aussomcraft.script;

import java.nio.file.Path;

import com.lehman.aussomcraft.profile.Profile;

/**
 * Every include path an engine is given, in one place.
 *
 * A script reaches other Aussom source two ways, and both are decided here
 * so that neither has to be hunted for. The generated Paper modules come
 * from inside the jar, one directory per tier. Other scripts come from the
 * filesystem, and only above the untrusted tier.
 *
 * The tier boundary is the path itself rather than a check on top of it.
 * Each tier's resource path points at that tier's own directory, so the
 * only names reachable through it are the ones in that directory, and the
 * grammar has no way to climb out of it: a leading '..' in an include is a
 * syntax error, not a traversal.
 *
 * @author Austin Lehman
 */
public final class IncludePaths {

    /**
     * Where the generated Paper modules live inside the jar, less the tier.
     * The last segment is the tier id, the same correspondence the generator
     * writes and PaperModules reads.
     */
    private static final String PAPER_ROOT = "/com/lehman/aussomcraft/aus/paper/";

    /** Where the host modules live inside the jar. */
    private static final String HOST_ROOT = "/com/lehman/aussomcraft/aus/host/";

    private IncludePaths() { }

    /**
     * The jar resource directory holding the host modules.
     *
     * craft.aus is here rather than beside the generated modules, so that
     * putting it on the include path does not also put paper/ on it and
     * let a script name a tier. aji.aus is not here at all: it lives in the
     * dangerous tier's own directory, which is the only include path that
     * reaches it.
     *
     * @return A String with the resource path, ending in a separator.
     */
    public static String hostResource() {
        return HOST_ROOT;
    }

    /**
     * The jar resource directory this tier may include from.
     *
     * @param Tier is the tier the script runs at.
     * @return A String with the resource path, ending in a separator.
     */
    public static String paperResource(Profile Tier) {
        return PAPER_ROOT + Tier.getId() + "/";
    }

    /**
     * The directory a script may include other scripts from.
     *
     * The script's own directory, so a script can include a helper sitting
     * beside it. Untrusted gets none: a script at that tier is meant to be
     * readable on its own, and pulling in another file is how that stops
     * being true.
     *
     * @param Tier is the tier the script runs at.
     * @param ScriptPath is the file being loaded.
     * @return A Path to add, or null when this tier gets none.
     */
    public static Path scriptDir(Profile Tier, Path ScriptPath) {
        if (Tier == Profile.UNTRUSTED || ScriptPath == null) {
            return null;
        }
        return ScriptPath.toAbsolutePath().getParent();
    }
}
