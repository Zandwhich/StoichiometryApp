package com.example.alex.util.Ions;

import com.example.alex.util.Atom;
import com.example.alex.util.Elements.Phosphorus;
import com.example.alex.util.Ion;

/**
 * Created by alex on 7/12/17.
 */

public class Phosphide extends Ion {

    public Phosphide() {
        super("Phosphide", "P", getAtoms(), -3);
    }//end Phosphide()

    private static Atom[] getAtoms() {
        Atom[] atoms = {new Phosphorus()};
        return atoms;
    }//end getAtoms()

}//end Phosphide
