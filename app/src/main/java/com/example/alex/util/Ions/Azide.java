package com.example.alex.util.Ions;

import com.example.alex.util.Atom;
import com.example.alex.util.Elements.Nitrogen;
import com.example.alex.util.Ion;

/**
 * Created by alex on 7/12/17.
 */

public class Azide extends Ion {

    public Azide() {
        super("Azide", "N3", getAtoms(), -1);
    }//end Azide()

    private static Atom[] getAtoms() {
        Atom[] atoms = {new Nitrogen(), new Nitrogen(), new Nitrogen()};
        return atoms;
    }//end getAtoms()

}//end Azide
