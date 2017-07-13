package com.example.alex.util.Ions;

import com.example.alex.util.Atom;
import com.example.alex.util.Elements.Nitrogen;
import com.example.alex.util.Ion;

/**
 * Created by alex on 7/12/17.
 */

public class Nitride extends Ion {

    public Nitride() {
        super("Nitride", "N", getAtoms(), -3);
    }//end Nitride()

    private static Atom[] getAtoms() {
        Atom[] atoms = {new Nitrogen()};
        return atoms;
    }//end getAtoms()

}//end Nitride
