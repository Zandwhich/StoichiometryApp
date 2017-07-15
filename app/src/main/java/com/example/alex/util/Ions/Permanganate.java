package com.example.alex.util.Ions;

import com.example.alex.util.Atom;
import com.example.alex.util.Elements.Manganese;
import com.example.alex.util.Elements.Oxygen;
import com.example.alex.util.Ion;

/**
 * Created by alex on 7/15/17.
 */

public class Permanganate extends Ion {

    public Permanganate() {
        super("Permanganate", "MnO4", getAtoms(), -1);
    }//end Permanganate()

    private static Atom[] getAtoms() {
        Atom[] atoms = {new Manganese(), new Oxygen(), new Oxygen(), new Oxygen(), new Oxygen()};
        return atoms;
    }//end getAtoms()

}//end Permanganate
