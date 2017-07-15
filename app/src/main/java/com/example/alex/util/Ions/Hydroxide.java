package com.example.alex.util.Ions;

import com.example.alex.util.Atom;
import com.example.alex.util.Elements.Hydrogen;
import com.example.alex.util.Elements.Oxygen;
import com.example.alex.util.Ion;

/**
 * Created by alex on 7/14/17.
 */

public class Hydroxide extends Ion {

    public Hydroxide() {
        super("Hydroxide", "OH", getAtoms(), -1);
    }//end Hydroxide()

    private static Atom[] getAtoms() {
        Atom[] atoms = {new Oxygen(), new Hydrogen()};
        return atoms;
    }//end getAtoms()

}//end Hydroxide
