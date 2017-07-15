package com.example.alex.util.Ions;

import com.example.alex.util.Atom;
import com.example.alex.util.Elements.Oxygen;
import com.example.alex.util.Elements.Phosphorus;
import com.example.alex.util.Ion;

/**
 * Created by alex on 7/14/17.
 */

public class Metaphosphate extends Ion {

    public Metaphosphate() {
        super("Metaphosphate", "PO3", getAtoms(), -1);
    }//end Metaphosphate()

    private static Atom[] getAtoms() {
        Atom[] atoms = {new Phosphorus(), new Oxygen(), new Oxygen(), new Oxygen()};
        return atoms;
    }//end getAtoms()

}//end Metaphosphate
