package com.example.alex.util.Ions;

import com.example.alex.util.Atom;
import com.example.alex.util.Elements.Silicon;
import com.example.alex.util.Ion;

/**
 * Created by alex on 7/5/17.
 */

public class Silicon_4_Ion extends Ion {

    public Silicon_4_Ion(){
        super("Silicon(IV)", "Si", getAtoms(), 4);
    }//end Silicon_4_Ion()

    private static Atom[] getAtoms(){
        Atom[] atoms = {new Silicon()};
        return atoms;
    }//end getAtoms()

}//end Silicon_4_Ion
