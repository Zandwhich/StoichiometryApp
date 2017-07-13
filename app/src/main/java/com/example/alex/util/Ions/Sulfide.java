package com.example.alex.util.Ions;

import com.example.alex.util.Atom;
import com.example.alex.util.Elements.Sulfur;
import com.example.alex.util.Ion;

/**
 * Created by alex on 7/12/17.
 */

public class Sulfide extends Ion {

    public Sulfide() {
        super("Sulfide", "S", getAtoms(), -2);
    }//end Sulfide()

    private static Atom[] getAtoms() {
        Atom[] atoms = {new Sulfur()};
        return atoms;
    }//end getAtoms()

}//end Sulfide
