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

import com.aussom.Engine;

import com.lehman.aussomcraft.profile.Profile;

/**
 * Reports whether one tier can include one generated Paper module.
 *
 * Runs in a JVM of its own with the packaged jar as its whole class path,
 * which is the only place a resource include path resolves. aussom-base
 * decides between its jar branch and its directory branch by asking where
 * aussom-base itself was loaded from, so under surefire, where aussom-base
 * is a Maven jar and this project's resources are loose in target/classes,
 * it enumerates the aussom-base jar and finds none of them. Against the
 * packaged jar both live in the same archive and the lookup is the one the
 * server performs.
 *
 * Prints one line per case, 'tier|include|RESULT', for TierIncludeIT to
 * read. Anything unexpected is printed rather than thrown so the parent
 * test can name what happened.
 *
 * @author Austin Lehman
 */
public final class IncludeProbeMain {

    private IncludeProbeMain() { }

    /**
     * Runs one case per argument.
     *
     * @param args is a list of 'tier:Type' pairs to try.
     * @throws Exception never, in practice; failures are reported as text.
     */
    public static void main(String[] args) throws Exception {
        for (String pair : args) {
            int at = pair.indexOf(':');
            String tier = pair.substring(0, at);
            String type = pair.substring(at + 1);
            System.out.println(tier + "|" + type + "|" + attempt(tier, type));
        }
    }

    /**
     * Builds an engine for a tier the way ScriptLoader does, then tries the
     * include.
     *
     * @param TierId is the tier id.
     * @param Type is the generated type to include.
     * @return A String with RESOLVED, REFUSED or an error description.
     */
    private static String attempt(String TierId, String Type) {
        Profile tier = Profile.byId(TierId);
        if (tier == null) {
            return "BAD_TIER";
        }
        try {
            Engine eng = new Engine(tier.newPolicy(IncludeProbeMain.class.getClassLoader()));
            eng.addResourceIncludePath(IncludePaths.paperResource(tier));
            eng.parseString("probe.aus",
                "include " + Type + ";\n"
              + "class Main { public main() { return 0; } }\n");
            if (eng.hasParseErrors()) {
                return "REFUSED";
            }
            if (!eng.containsClass(Type)) {
                return "NOT_DEFINED";
            }
            return "RESOLVED";
        } catch (Exception denied) {
            return "REFUSED";
        }
    }
}
