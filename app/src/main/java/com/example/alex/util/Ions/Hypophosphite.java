package com.example.alex.util.Ions;

import com.example.alex.util.Atom;
import com.example.alex.util.Elements.Hydrogen;
import com.example.alex.util.Elements.Oxygen;
import com.example.alex.util.Elements.Phosphorus;
import com.example.alex.util.Ion;

/**
 * Created by alex on 7/14/17.
 */

public class Hypophosphite extends Ion {

    public Hypophosphite() {
        super("Hypophosphite", "H2PO2", getAtoms(), -1);
    }//end Hypophosphite()

    private static Atom[] getAtoms() {
        Atom[] atoms = {new Hydrogen(), new Hydrogen(), new Phosphorus(), new Oxygen(), new Oxygen()};
        return atoms;
    }//end getAtoms()

}//end Hypophosphite
