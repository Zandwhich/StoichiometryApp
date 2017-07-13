package com.example.alex.util.Ions;

import com.example.alex.util.Atom;
import com.example.alex.util.Elements.Iodine;
import com.example.alex.util.Ion;

/**
 * Created by alex on 7/12/17.
 */

public class Iodide extends Ion {

    public Iodide() {
        super("Iodide", "I", getAtoms(), -1);
    }//end Iodide()

    private static Atom[] getAtoms() {
        Atom[] atoms = {new Iodine()};
        return atoms;
    }//end getAtoms()

}//end Iodide
