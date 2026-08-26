package com.lehman.aussomcraft.paper;

import java.util.ArrayList;
import com.aussom.Environment;
import com.aussom.types.AussomString;
import com.aussom.types.AussomType;

/** Stands in for a generated base shim. */
public class BaseProbeShim extends PaperObj {
    public AussomType alpha(Environment env, ArrayList<AussomType> args) {
        return new AussomString("alpha");
    }
}
