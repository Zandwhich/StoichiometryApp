package com.example.alex.util.Ions;

import com.example.alex.util.Atom;
import com.example.alex.util.Elements.Chlorine;
import com.example.alex.util.Elements.Oxygen;
import com.example.alex.util.Ion;

/**
 * Created by alex on 7/14/17.
 */

public class Chlorite extends Ion {

    public Chlorite() {
        super("Chlorite", "ClO2", getAtoms(), -1);
    }//end Chlorite()

    private static Atom[] getAtoms() {
        Atom[] atoms = {new Chlorine(), new Oxygen(), new Oxygen()};
        return atoms;
    }//end getAtoms()

}//end Chlorite
