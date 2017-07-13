package com.example.alex.util.Ions;

import com.example.alex.util.Atom;
import com.example.alex.util.Elements.Carbon;
import com.example.alex.util.Elements.Hydrogen;
import com.example.alex.util.Elements.Oxygen;
import com.example.alex.util.Ion;

/**
 * Created by alex on 7/12/17.
 */

public class Bicarbonate extends Ion {

    public Bicarbonate() {
        super("Bicarbonate", "HCO3", getAtoms(), -1);
    }//end Bicarbonate()

    private static Atom[] getAtoms() {
        Atom[] atoms = {new Hydrogen(), new Carbon(), new Oxygen(), new Oxygen(), new Oxygen()};
        return atoms;
    }//end getAtoms()

}//end Bicarbonate
