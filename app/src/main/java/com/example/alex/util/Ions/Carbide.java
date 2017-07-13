package com.example.alex.util.Ions;

import com.example.alex.util.Atom;
import com.example.alex.util.Elements.Carbon;
import com.example.alex.util.Elements.Chlorine;
import com.example.alex.util.Ion;

/**
 * Created by alex on 7/12/17.
 */

public class Carbide extends Ion {

    public Carbide() {
        super("Carbide", "C", getAtoms(), -4);
    }//end Carbide()

    private static Atom[] getAtoms() {
        Atom[] atoms = {new Carbon()};
        return atoms;
    }//end getAtoms()

}//end Carbide
