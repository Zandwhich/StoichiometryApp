package com.example.alex.util.Ions;

import com.example.alex.util.Atom;
import com.example.alex.util.Elements.Bromine;
import com.example.alex.util.Elements.Oxygen;
import com.example.alex.util.Ion;

/**
 * Created by alex on 7/14/17.
 */

public class Bromate extends Ion {

    public Bromate() {
        super("Bromate", "BrO3", getAtoms(), -1);
    }//end Bromate()

    private static Atom[] getAtoms() {
        Atom[] atoms = {new Bromine(), new Oxygen(), new Oxygen(), new Oxygen()};
        return atoms;
    }//end getAtoms()

}//end Bromate
