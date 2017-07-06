package com.example.alex.util.Ions;

import com.example.alex.util.Atom;
import com.example.alex.util.Elements.Iron;
import com.example.alex.util.Ion;

/**
 * Created by alex on 7/5/17.
 */

public class Iron_3_Ion extends Ion {

    public Iron_3_Ion(){
        super("Ion(III)", "Fe", getAtoms(), 3);
    }//end Iron_3_Ion()

    private static Atom[] getAtoms(){
        Atom[] atoms = {new Iron()};
        return atoms;
    }//end getAtoms()

}//end Iron_3_Ion
