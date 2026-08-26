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
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.LinkedHashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import org.bukkit.configuration.file.YamlConfiguration;

/**
 * The store's configuration key separator.
 *
 * This is a key separator inside a configuration object, not a filesystem
 * path, so it never reaches the operating system. What matters is only that
 * the character cannot appear in a script file name, or a name containing it
 * would be split into nested sections and lost.
 *
 * A forward slash is the one separator that is illegal in a file name on
 * every platform this runs on. Windows additionally forbids a backslash,
 * colon, asterisk, question mark, quote, angle brackets and pipe, but Linux
 * allows all of those, so none of them would be safe.
 */
public class StoreKeySeparatorTest {

    private static YamlConfiguration flat() {
        YamlConfiguration cfg = new YamlConfiguration();
        cfg.options().pathSeparator('/');
        return cfg;
    }

    /**
     * Names that are legal on Linux and would break a configuration using a
     * different separator. A backslash is the one that matters: it is a
     * perfectly ordinary Linux file name character, so choosing it as the
     * separator to suit Windows would have broken Linux instead.
     */
    @ParameterizedTest
    @ValueSource(strings = {
        "counter.aus",
        "my.long.name.aus",
        "back\\slash.aus",
        "colon:name.aus",
        "star*name.aus",
        "question?name.aus",
        "pipe|name.aus",
        "quote\"name.aus",
        "space name.aus",
    })
    public void aScriptNameSurvivesAsALiteralKey(String Name) throws Exception {
        Map<String, Object> vals = new LinkedHashMap<String, Object>();
        vals.put("kept", "yes");
        vals.put("Steve.home.world", "overworld");

        YamlConfiguration out = flat();
        out.createSection(Name, vals);
        String text = out.saveToString();

        YamlConfiguration back = flat();
        back.loadFromString(text);

        assertTrue(back.getKeys(false).contains(Name),
            "the whole name must be one key, got " + back.getKeys(false));
        assertEquals("yes", back.getConfigurationSection(Name).get("kept"));
        assertEquals("overworld", back.getConfigurationSection(Name).get("Steve.home.world"),
            "a dotted key inside the store must stay whole too");
    }

    /** The separator is not a file path, so it never reaches the platform. */
    @Test
    public void theSeparatorIsAConfigurationKeyNotAPath() {
        YamlConfiguration cfg = flat();
        assertEquals('/', cfg.options().pathSeparator());
        cfg.set("a/b", "nested");
        assertTrue(cfg.getKeys(false).contains("a"),
            "a slash is the separator, so it does nest; that is why a file"
            + " name can never contain one");
    }
}
