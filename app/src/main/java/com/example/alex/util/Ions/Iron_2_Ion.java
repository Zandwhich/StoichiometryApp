package com.example.alex.util.Ions;

import com.example.alex.util.Atom;
import com.example.alex.util.Elements.Iron;
import com.example.alex.util.Ion;

/**
 * Created by alex on 6/29/17.
 */

public class Iron_2_Ion extends Ion {

    public Iron_2_Ion(){
        super("Iron(II)", "Fe", getAtoms(), 2);
    }//end Iron_2_Ion()

    private static Atom[] getAtoms(){
        Atom[] atoms = {new Iron()};
        return atoms;
    }//end getAtoms()
}//end Iron_2_Ion
