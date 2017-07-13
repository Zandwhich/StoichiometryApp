package com.example.alex.util.Ions;

import com.example.alex.util.Atom;
import com.example.alex.util.Elements.Hydrogen;
import com.example.alex.util.Elements.Oxygen;
import com.example.alex.util.Elements.Sulfur;
import com.example.alex.util.Ion;

/**
 * Created by alex on 7/12/17.
 */

public class Bisulfite extends Ion {

    public Bisulfite() {
        super("Bisulfite", "HSO3", getAtoms(), -1);
    }//end Bisulite()

    private static Atom[] getAtoms() {
        Atom[] atoms = {new Hydrogen(), new Sulfur(), new Oxygen(), new Oxygen(), new Oxygen()};
        return atoms;
    }//end getAtoms()

}//end Bisulfite
