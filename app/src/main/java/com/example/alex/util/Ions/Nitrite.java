package com.example.alex.util.Ions;

import com.example.alex.util.Atom;
import com.example.alex.util.Elements.Nitrogen;
import com.example.alex.util.Elements.Oxygen;
import com.example.alex.util.Ion;

/**
 * Created by alex on 7/14/17.
 */

public class Nitrite extends Ion {

    public Nitrite() {
        super("Nitrite", "NO2", getAtoms(), -1);
    }//end Nitrite()

    private static Atom[] getAtoms() {
        Atom[] atoms = {new Nitrogen(), new Oxygen(), new Oxygen()};
        return atoms;
    }//end getAtoms()

}//end Nitrite
