package com.example.alex.util.Ions;

import com.example.alex.util.Atom;
import com.example.alex.util.Elements.Lead;
import com.example.alex.util.Ion;

/**
 * Created by alex on 6/29/17.
 */

public class Lead_2_Ion extends Ion {

    public Lead_2_Ion(){
        super("Lead(II)", "Pb", getAtoms(), 2);
    }//end Lead_2_Ion()

    private static Atom[] getAtoms(){
        Atom[] atoms = {new Lead()};
        return atoms;
    }//end getAtoms()

}//end Lead_2_Ion
