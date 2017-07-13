package com.example.alex.util.Ions;

import com.example.alex.util.Atom;
import com.example.alex.util.Elements.Fluorine;
import com.example.alex.util.Ion;

/**
 * Created by alex on 7/12/17.
 */

public class Fluoride extends Ion {

    public Fluoride() {
        super("Fluoride", "F", getAtoms(), -1);
    }//end Fluoride()

    private static Atom[] getAtoms() {
        Atom[] atoms = {new Fluorine()};
        return atoms;
    }//end getAtoms()

}//end Flouride
