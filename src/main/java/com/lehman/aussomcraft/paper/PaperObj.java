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

import java.util.ArrayList;

import com.aussom.Environment;
import com.aussom.types.AussomBool;
import com.aussom.types.AussomString;
import com.aussom.types.AussomType;

/**
 * Base of every generated Paper shim. Holds the wrapped Bukkit object.
 *
 * A shim is never constructed by a script. The host creates one with
 * Engine.instantiateObject and sets the wrapped object on it, so a script can
 * only ever hold shims it was handed.
 *
 * @author Austin Lehman
 */
public class PaperObj {

    /** The wrapped Bukkit object. */
    private Object obj = null;

    public PaperObj() { }

    /** @return the wrapped Bukkit object, or null. */
    public Object getObj() {
        return this.obj;
    }

    /**
     * Sets the wrapped Bukkit object.
     *
     * @param Obj is the object to wrap.
     */
    public void setObj(Object Obj) {
        this.obj = Obj;
    }

    /**
     * Equality is the wrapped object's, so two shims handed out for the same
     * player compare equal.
     *
     * @param env is the calling context.
     * @param args holds the other value.
     * @return An AussomBool.
     */
    public AussomType __opEq__(Environment env, ArrayList<AussomType> args) {
        return new AussomBool(this.sameAs(args));
    }

    /**
     * Java equality, kept in step with __opEq__ because AussomList compares
     * with Java equals rather than the operator.
     */
    @Override
    public boolean equals(Object Other) {
        if (this == Other) {
            return true;
        }
        if (!(Other instanceof PaperObj)) {
            return false;
        }
        Object mine = this.obj;
        Object theirs = ((PaperObj) Other).obj;
        if (mine == null) {
            return theirs == null;
        }
        return mine.equals(theirs);
    }

    @Override
    public int hashCode() {
        if (this.obj == null) {
            return 0;
        }
        return this.obj.hashCode();
    }

    /**
     * The wrapped object's type name, for messages.
     *
     * @param env is the calling context.
     * @param args is unused.
     * @return An AussomString.
     */
    public AussomType toString(Environment env, ArrayList<AussomType> args) {
        if (this.obj == null) {
            return new AussomString("null");
        }
        return new AussomString(this.obj.getClass().getSimpleName());
    }

    private boolean sameAs(ArrayList<AussomType> args) {
        if (args == null || args.isEmpty()) {
            return false;
        }
        Object other = Marshal.unwrap(args.get(0));
        if (this.obj == null) {
            return other == null;
        }
        return this.obj.equals(other);
    }
}
