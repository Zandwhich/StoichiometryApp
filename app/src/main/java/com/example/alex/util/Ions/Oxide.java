package com.example.alex.util.Ions;

import com.example.alex.util.Atom;
import com.example.alex.util.Elements.Oxygen;
import com.example.alex.util.Ion;

/**
 * Created by alex on 7/12/17.
 */

public class Oxide extends Ion {

    public Oxide() {
        super("Oxide", "O", getAtoms(), -2);
    }//end Oxide()

    private static Atom[] getAtoms() {
        Atom[] atoms = {new Oxygen()};
        return atoms;
    }//end getAtoms()

}//end Oxide
