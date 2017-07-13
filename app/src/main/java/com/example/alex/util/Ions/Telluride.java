package com.example.alex.util.Ions;

import com.example.alex.util.Atom;
import com.example.alex.util.Elements.Tellurium;
import com.example.alex.util.Ion;

/**
 * Created by alex on 7/12/17.
 */

public class Telluride extends Ion {

    public Telluride() {
        super("Telluride", "Te", getAtoms(), -2);
    }//end Telluride()

    private static Atom[] getAtoms() {
        Atom[] atoms = {new Tellurium()};
        return atoms;
    }//end getAtoms()

}//end Telluride
