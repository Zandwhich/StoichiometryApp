package com.example.alex.util.Ions;

import com.example.alex.util.Atom;
import com.example.alex.util.Elements.Carbon;
import com.example.alex.util.Elements.Nitrogen;
import com.example.alex.util.Elements.Sulfur;
import com.example.alex.util.Ion;

/**
 * Created by alex on 7/15/17.
 */

public class Thiocyanate extends Ion {

    public Thiocyanate() {
        super("Thiocyanate", "SCN", getAtoms(), -1);
    }//end Thiocyanate()

    private static Atom[] getAtoms() {
        Atom[] atoms = {new Sulfur(), new Carbon(), new Nitrogen()};
        return atoms;
    }//end getAtoms()

}//end Thiocyanate
