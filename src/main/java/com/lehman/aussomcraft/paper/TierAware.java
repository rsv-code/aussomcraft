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

package com.lehman.aussomcraft.paper;

/**
 * An engine that knows which tier it is running at.
 *
 * The marshaller needs it to include a type's module the first time a value
 * of that type comes back, and only modules of the engine's own tier are
 * ever reachable.
 *
 * @author Austin Lehman
 */
public interface TierAware {

    /** @return the tier id, for example "trusted". */
    String getTierId();

    /**
     * Called after the host has done work on the script's behalf, such as
     * parsing a module a returned value needed.
     *
     * The wall clock budget bounds what a script does, not what the host
     * does for it. Without this a handler could be cancelled for the cost of
     * a parse it did not ask for and cannot avoid.
     */
    void hostWorkDone();
}
