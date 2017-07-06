package com.example.alex.util.Ions;

import com.example.alex.util.Atom;
import com.example.alex.util.Elements.Lead;
import com.example.alex.util.Ion;

/**
 * Created by alex on 7/5/17.
 */

public class Lead_4_Ion extends Ion {

    public Lead_4_Ion(){
        super("Lead(IV)", "Pb", getAtoms(), 4);
    }//end Lead_4_Ion()

    private static Atom[] getAtoms(){
        Atom[] atoms = {new Lead()};
        return atoms;
    }//end getAtoms()

}//end Lead_4_Ion
