package com.example.alex.util.Ions;

import com.example.alex.util.Atom;
import com.example.alex.util.Elements.Copper;
import com.example.alex.util.Ion;

/**
 * Created by alex on 6/29/17.
 */

public class Copper_2_Ion extends Ion {

    public Copper_2_Ion(){
        super("Copper(II)", "Cu", getAtoms(), 2);
    }//end Copper_2_Ion()

    private static Atom[] getAtoms(){
        Atom[] atoms = {new Copper()};
        return atoms;
    }//end getAtoms()
}//end Copper_2_Ion
