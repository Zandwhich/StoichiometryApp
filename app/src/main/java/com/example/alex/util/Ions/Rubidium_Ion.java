package com.example.alex.util.Ions;

import com.example.alex.util.Atom;
import com.example.alex.util.Elements.Rubidium;
import com.example.alex.util.Ion;

/**
 * Created by alex on 6/29/17.
 */

public class Rubidium_Ion extends Ion {

    public Rubidium_Ion() {
        super("Rubidium", "Rb", getAtoms(), 1);
    }//end Rubidium_Ion()

    private static Atom[] getAtoms(){
        Rubidium rubidium = new Rubidium();
        Atom[] atoms = {rubidium};
        return atoms;
    }//end getAtoms()

}//end Rubidium
