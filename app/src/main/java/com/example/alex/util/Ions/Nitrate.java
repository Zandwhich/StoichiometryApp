package com.example.alex.util.Ions;

import com.example.alex.util.Atom;
import com.example.alex.util.Elements.Nitrogen;
import com.example.alex.util.Elements.Oxygen;
import com.example.alex.util.Ion;

/**
 * Created by alex on 7/14/17.
 */

public class Nitrate extends Ion {

    public Nitrate() {
        super("Nitrate", "NO3", getAtoms(), -1);
    }//end Nitrate()

    private static Atom[] getAtoms() {
        Atom[] atoms = {new Nitrogen(), new Oxygen(), new Oxygen(), new Oxygen()};
        return atoms;
    }//end getAtoms()

}//end Nitrate
