package com.example.alex.util.Ions;

import com.example.alex.util.Atom;
import com.example.alex.util.Elements.Chlorine;
import com.example.alex.util.Elements.Oxygen;
import com.example.alex.util.Ion;

/**
 * Created by alex on 7/14/17.
 */

public class Hypochlorite extends Ion {

    public Hypochlorite() {
        super("Hypochlorite", "ClO", getAtoms(), -1);
    }//end Hypochlorite()

    private static Atom[] getAtoms() {
        Atom[] atoms = {new Chlorine(), new Oxygen()};
        return atoms;
    }//end getAtoms()

}//end Hypochlorite
