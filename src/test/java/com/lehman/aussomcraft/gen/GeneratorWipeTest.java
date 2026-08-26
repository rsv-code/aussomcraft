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

package com.lehman.aussomcraft.gen;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

/**
 * The generator clears its own output before writing.
 *
 * Whole directory rather than file by file. Generated output lives in
 * directories of its own, so there is nothing to distinguish and no rule to
 * get wrong: everything there goes and is rebuilt. A shim left behind for a
 * type Paper has dropped would still be loadable and still callable from a
 * script.
 */
public class GeneratorWipeTest {

    @TempDir
    Path tmp;

    private Path write(String name, String body) throws Exception {
        Path p = this.tmp.resolve(name);
        Files.createDirectories(p.getParent());
        Files.write(p, body.getBytes(StandardCharsets.UTF_8));
        return p;
    }

    /** Everything below an output directory goes, whatever it contains. */
    @Test
    public void theWholeOutputDirectoryIsCleared() throws Exception {
        Path root = this.tmp.resolve("paper");
        Files.createDirectories(root);
        write("paper/trusted/Gone.aus", "extern class Gone { }\n");
        write("paper/untrusted/AlsoGone.aus", "extern class AlsoGone { }\n");
        write("paper/leftover.txt", "stale\n");

        assertEquals(3, Generator.wipe(root), "every file below the root goes");
        assertFalse(Files.exists(root.resolve("trusted")),
            "and the directories with them");
        assertTrue(Files.isDirectory(root), "the root itself stays");
    }

    /**
     * A type Paper dropped leaves no shim behind. This is the reason the
     * wipe exists: a stale module is still loadable and still callable.
     */
    @Test
    public void aDroppedTypeLeavesNothingBehind() throws Exception {
        Path root = this.tmp.resolve("paper");
        Path stale = write("paper/trusted/RemovedInNextRelease.aus",
            "extern class RemovedInNextRelease { }\n");
        Generator.wipe(root);
        assertFalse(Files.exists(stale),
            "a shim for a type that no longer exists must not survive");
    }

    /**
     * A mistyped output path is refused rather than obeyed. Deleting a whole
     * directory is worth a guard.
     */
    @Test
    public void aPathThatIsNotAnOutputDirectoryIsRefused() throws Exception {
        Path src = this.tmp.resolve("main");
        Files.createDirectories(src);
        Path precious = write("main/Handwritten.java", "public class Handwritten { }\n");

        assertThrows(IOException.class, () -> Generator.wipe(src),
            "the generator must refuse to clear a directory it did not write");
        assertTrue(Files.exists(precious), "and must not have touched anything");
    }

    /** Clearing a directory that is not there is not an error. */
    @Test
    public void anAbsentDirectoryIsFine() throws Exception {
        assertEquals(0, Generator.wipe(this.tmp.resolve("gen")));
    }
}
