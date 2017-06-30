package com.example.alex.util.Ions;

import com.example.alex.util.Atom;
import com.example.alex.util.Elements.Mercury;
import com.example.alex.util.Ion;

/**
 * Created by alex on 6/29/17.
 */

public class Mercury_2_Ion extends Ion {

    public Mercury_2_Ion(){
        super("Mercury(II)", "Hg", getAtoms(), 2);
    }//end Mercury_2_Ion()

    private static Atom[] getAtoms(){
        Atom[] atoms = {new Mercury()};
        return atoms;
    }//end getAtoms()

}//end Mercury_2_Ion
