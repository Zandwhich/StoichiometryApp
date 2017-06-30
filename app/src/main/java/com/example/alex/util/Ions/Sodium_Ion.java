package com.example.alex.util.Ions;

import com.example.alex.util.Atom;
import com.example.alex.util.Elements.Sodium;
import com.example.alex.util.Ion;

/**
 * Created by alex on 6/29/17.
 */

public class Sodium_Ion extends Ion {

    public Sodium_Ion(){
        super("Sodium", "Na", getAtoms(), 1);
    }//end Sodium_Ion()

    private static Atom[] getAtoms(){
        Atom[] atoms = {new Sodium()};
        return atoms;
    }//end getAtoms()

}//end Sodium_Ion
