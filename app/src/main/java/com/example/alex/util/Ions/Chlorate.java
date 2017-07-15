package com.example.alex.util.Ions;

import com.example.alex.util.Atom;
import com.example.alex.util.Elements.Chlorine;
import com.example.alex.util.Elements.Oxygen;
import com.example.alex.util.Ion;

/**
 * Created by alex on 7/14/17.
 */

public class Chlorate extends Ion {

    public Chlorate() {
        super("Chlorate", "ClO3", getAtoms(), -1);
    }//end Chlorate()

    private static Atom[] getAtoms() {
        Atom[] atoms = {new Chlorine(), new Oxygen(), new Oxygen(), new Oxygen()};
        return atoms;
    }//end getAtoms()

}//end Chlorate
