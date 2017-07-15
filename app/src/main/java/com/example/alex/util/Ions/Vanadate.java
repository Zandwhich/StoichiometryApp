package com.example.alex.util.Ions;

import com.example.alex.util.Atom;
import com.example.alex.util.Elements.Oxygen;
import com.example.alex.util.Elements.Vanadium;
import com.example.alex.util.Ion;

/**
 * Created by alex on 7/15/17.
 */

public class Vanadate extends Ion {

    public Vanadate() {
        super("Vanadate", "VO4", getAtoms(), -3);
    }//end Vanadate()

    private static Atom[] getAtoms() {
        Atom[] atoms = {new Vanadium(), new Oxygen(), new Oxygen(), new Oxygen()};
        return atoms;
    }//end getAtoms()

}//end Vanadate
