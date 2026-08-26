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
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

import org.junit.jupiter.api.Test;

import com.aussom.types.AussomMap;

import com.lehman.aussomcraft.paper.Marshal;

/**
 * A map's keys must be redacted the same way its values are.
 *
 * An Aussom map is keyed by string, so a Java key has to become one, and the
 * obvious way calls toString on whatever it is. That is the same disclosure
 * closed on the value side: a File prints a path, a URL prints a host, a
 * plugin prints its name and version.
 *
 * It was reachable. `World.getPluginChunkTickets` returns a Map keyed by
 * Plugin and is generated at untrusted.
 */
public class MapKeyTest {

    private static Set<String> keysOf(Object Value) {
        AussomMap m = (AussomMap) Marshal.wrap(null, Value);
        return m.getValue().keySet();
    }

    /** Nothing that has to be described by toString may become a key. */
    @Test
    public void unsafeKeysAreDropped() throws Exception {
        Map<Object, Object> m = new LinkedHashMap<Object, Object>();
        m.put(new File("/home/someone/.ssh/id_rsa"), "v");
        m.put(new URL("https://internal.example.com/secret"), "v");
        m.put(new Object() {
            @Override
            public String toString() {
                return "SomePlugin v3.2.1";
            }
        }, "v");

        Set<String> keys = keysOf(m);
        assertTrue(keys.isEmpty(),
            "a key that can only be described by toString must lose its entry, got " + keys);
        for (String k : keys) {
            assertFalse(k.contains("id_rsa") || k.contains("example.com")
                || k.contains("SomePlugin"), "leaked through a key: " + k);
        }
    }

    /** Keys that are their own text still work, or maps become useless. */
    @Test
    public void scalarKeysStillWork() {
        Map<Object, Object> m = new LinkedHashMap<Object, Object>();
        m.put("name", "v");
        m.put(Integer.valueOf(7), "v");
        m.put(Boolean.TRUE, "v");
        m.put(Character.valueOf('c'), "v");
        UUID id = UUID.fromString("00000000-0000-0000-0000-000000000001");
        m.put(id, "v");
        m.put(java.time.DayOfWeek.MONDAY, "v");

        Set<String> keys = keysOf(m);
        assertEquals(6, keys.size(), "every scalar key should survive, got " + keys);
        assertTrue(keys.contains("name"));
        assertTrue(keys.contains("7"));
        assertTrue(keys.contains("true"));
        assertTrue(keys.contains("c"));
        assertTrue(keys.contains(id.toString()));
        assertTrue(keys.contains("MONDAY"), "an enum keys by its name");
    }
}
