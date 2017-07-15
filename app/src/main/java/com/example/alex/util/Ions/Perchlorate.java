package com.example.alex.util.Ions;

import com.example.alex.util.Atom;
import com.example.alex.util.Elements.Chlorine;
import com.example.alex.util.Elements.Oxygen;
import com.example.alex.util.Ion;

/**
 * Created by alex on 7/14/17.
 */

public class Perchlorate extends Ion {

    public Perchlorate() {
        super("Perchlorate", "ClO4", getAtoms(), -1);
    }//end Perchlorate()

    private static Atom[] getAtoms() {
        Atom[] atoms = {new Chlorine(), new Oxygen(), new Oxygen(), new Oxygen(), new Oxygen()};
        return atoms;
    }//end getAtoms()

}//end Perchlorate
