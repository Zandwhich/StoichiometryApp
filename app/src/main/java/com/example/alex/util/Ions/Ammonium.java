package com.example.alex.util.Ions;

import com.example.alex.util.Atom;
import com.example.alex.util.Elements.Hydrogen;
import com.example.alex.util.Elements.Nitrogen;
import com.example.alex.util.Ion;

/**
 * Created by alex on 7/5/17.
 */

public class Ammonium extends Ion {

    public Ammonium() {
        super("Ammonium", "NH4", getAtoms(), 1);
    }//end Ammonium()

    private static Atom[] getAtoms(){
        Atom[] atoms = {new Nitrogen(), new Hydrogen(), new Hydrogen(), new Hydrogen(), new Hydrogen()};
        return atoms;
    }//end getAtoms()

}//end Ammonium
