package com.example.alex.util.Ions;

import com.example.alex.util.Atom;
import com.example.alex.util.Elements.Chlorine;
import com.example.alex.util.Ion;

/**
 * Created by alex on 7/9/17.
 */

public class Chloride extends Ion {

    public Chloride() {
        super("Chloride", "Cl", getAtoms(), -1);
    }//end Chloride()

    private static Atom[] getAtoms() {
        Atom[] atoms = {new Chlorine()};
        return atoms;
    }//end getAtoms()

}//end Chloride
