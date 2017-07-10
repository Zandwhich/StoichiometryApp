package com.example.alex.util.Ions;

import com.example.alex.util.Atom;
import com.example.alex.util.Elements.Bromine;
import com.example.alex.util.Ion;

/**
 * Created by alex on 7/9/17.
 */

public class Bromide extends Ion {

    public Bromide() {
        super("Bromide", "Br", getAtoms(), -1);
    }//end Bromide()

    private static Atom[] getAtoms() {
        Atom[] atoms = {new Bromine()};
        return atoms;
    }//end getAtoms()

}//end Bromide
