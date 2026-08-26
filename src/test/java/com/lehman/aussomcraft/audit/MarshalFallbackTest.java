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

package com.lehman.aussomcraft.audit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.File;
import java.net.URL;
import java.util.Date;

import org.junit.jupiter.api.Test;

import com.aussom.types.AussomString;
import com.aussom.types.AussomType;

import com.lehman.aussomcraft.paper.Marshal;

/**
 * What the marshaller does with an object no tier was granted.
 *
 * A Paper method declared to return Object may return anything at all, and
 * the generator lets those through because Object is a value type as far as
 * a signature goes. The check therefore has to be at the point of
 * conversion, not at generation.
 *
 * The risk is toString. A File prints an absolute path, a URL prints a host,
 * and both would be reported to a tier that is not supposed to know the
 * filesystem or the network exists.
 */
public class MarshalFallbackTest {

    /** The string a marshalled value carries, or empty when it is not one. */
    private static String text(AussomType Value) {
        if (Value instanceof AussomString) {
            return ((AussomString) Value).getValue();
        }
        return "";
    }

    /** Objects that must not be described to a script at all. */
    @Test
    public void aFileIsNotDescribedToAScript() {
        AussomType got = Marshal.wrap(null, new File("/home/someone/.ssh/id_rsa"));
        assertTrue(got.isNull(),
            "a File must marshal to null, not to its path.");
        assertFalse(text(got).contains("id_rsa"),
            "the path must not appear anywhere in the result.");
    }

    /** The same for anything naming a host. */
    @Test
    public void aUrlIsNotDescribedToAScript() throws Exception {
        AussomType got = Marshal.wrap(null, new URL("https://internal.example.com/secret"));
        assertTrue(got.isNull(), "a URL must marshal to null.");
    }

    /** An arbitrary object must not leak its class name and identity either. */
    @Test
    public void aPlainObjectIsNotDescribed() {
        AussomType got = Marshal.wrap(null, new Object());
        assertTrue(got.isNull(), "an unrepresentable object must marshal to null.");
    }

    /**
     * The value types the generator does promise still work, or closing the
     * fallback would have quietly emptied every method returning one.
     */
    @Test
    public void theValueTypesStillMarshal() {
        assertEquals("42", text(Marshal.wrap(null, java.math.BigInteger.valueOf(42L))),
            "a Number must still marshal.");
        assertFalse(Marshal.wrap(null, new Date(0L)).isNull(),
            "a Date must still marshal.");
        assertFalse(Marshal.wrap(null, java.time.Duration.ofSeconds(5L)).isNull(),
            "a Duration must still marshal.");
        assertFalse(Marshal.wrap(null, new StringBuilder("hi")).isNull(),
            "a CharSequence must still marshal.");
    }
}
