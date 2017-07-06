package com.example.alex.util.Ions;

import com.example.alex.util.Atom;
import com.example.alex.util.Elements.Bismuth;
import com.example.alex.util.Ion;

/**
 * Created by alex on 7/5/17.
 */

public class Bismuth_3_Ion extends Ion {

    public Bismuth_3_Ion(){
        super("Bismuth(III)", "Bi", getAtoms(), 3);
    }//end Bismuth_3_Ion()

    private static Atom[] getAtoms(){
        Atom[] atoms = {new Bismuth()};
        return atoms;
    }//end getAtoms()

}//end Bismuth_3_Ion
