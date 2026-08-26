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

package com.lehman.aussomcraft.aji;

import com.aussom.ast.aussomException;

/**
 * Thrown when policy refuses an operation.
 *
 * This is a distinct type on purpose. A security test that only asserts
 * "something threw" passes for the wrong reason forever - a typo in a class
 * name, a missing dependency and a real denial all throw. Tests assert on
 * this type, so a broken wrapper can never be mistaken for a working gate.
 * Host code can also catch it deliberately to tell "not permitted" apart
 * from "went wrong".
 *
 * The message always names the subject (the class or property refused) and
 * the permission that refused it, so a failing test says which allowlist
 * entry is missing rather than just that something was blocked.
 *
 * Ported from the aussom reference implementation. See
 * design/aussomcraft-design-1.md section 3.
 */
public class SandboxDenied extends aussomException {

    private static final long serialVersionUID = 1L;

    /** The class name or property that was refused. */
    private final String subject;

    /** The permission that refused it. */
    private final String permission;

    /**
     * Builds a denial.
     *
     * @param api        the API that was called, e.g. "aji.newObj".
     * @param subject    the class name or property refused.
     * @param permission the permission that refused it.
     * @param why        a short reason, or null for the default wording.
     */
    public SandboxDenied(String api, String subject, String permission,
            String why) {
        super(build(api, subject, permission, why));
        this.subject = subject;
        this.permission = permission;
    }

    /** @return the class name or property that was refused. */
    public String getSubject() {
        return this.subject;
    }

    /** @return the permission that refused the operation. */
    public String getPermission() {
        return this.permission;
    }

    private static String build(String api, String subject, String permission,
            String why) {
        StringBuilder sb = new StringBuilder();
        sb.append(api).append(": denied by sandbox policy. subject='")
            .append(subject).append("' permission='").append(permission)
            .append("'.");
        if (why != null && !why.isBlank()) {
            sb.append(' ').append(why);
        }
        return sb.toString();
    }
}
