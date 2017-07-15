package com.example.alex.util.Ions;

import com.example.alex.util.Atom;
import com.example.alex.util.Elements.Boron;
import com.example.alex.util.Elements.Oxygen;
import com.example.alex.util.Ion;

/**
 * Created by alex on 7/15/17.
 */

public class Peroxoborate extends Ion {

    public Peroxoborate() {
        super("Peroxoborate", "BO3", getAtoms(), -1);
    }//end Peroxoborate()

    private static Atom[] getAtoms() {
        Atom[] atoms = {new Boron(), new Oxygen(), new Oxygen(), new Oxygen()};
        return atoms;
    }//end geAtoms()

}//end Peroxyborate
