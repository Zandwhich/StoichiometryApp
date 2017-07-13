package com.example.alex.util.Ions;

import com.example.alex.util.Atom;
import com.example.alex.util.Elements.Carbon;
import com.example.alex.util.Elements.Hydrogen;
import com.example.alex.util.Elements.Oxygen;
import com.example.alex.util.Ion;

/**
 * Created by alex on 7/12/17.
 */

public class Acetate extends Ion {

    public Acetate() {
        super("Acetate", "CH3COOH", getAtoms(), -1);
    }//end Acetate()

    private static Atom[] getAtoms() {
        Atom[] atoms = {new Carbon(), new Carbon(), new Hydrogen(), new Hydrogen(), new Hydrogen(), new Oxygen(), new Oxygen()};
        return atoms;
    }//end getAtoms()

}//end Acetate
