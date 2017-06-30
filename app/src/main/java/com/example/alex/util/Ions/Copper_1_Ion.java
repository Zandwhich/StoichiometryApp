package com.example.alex.util.Ions;

import com.example.alex.util.Atom;
import com.example.alex.util.Elements.Copper;
import com.example.alex.util.Ion;

/**
 * Created by alex on 6/28/17.
 */

public class Copper_1_Ion extends Ion {

    public Copper_1_Ion(){
        super("Copper(I)", "Cu", getAtoms(), 1);
    }//end Copper_1_Ion()

    private static Atom[] getAtoms(){
        Copper copper = new Copper();
        Atom[] atoms = {copper};
        return atoms;
    }//end getAtoms()
}//end Copper_1_Ion
