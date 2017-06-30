package com.example.alex.util.Ions;

import com.example.alex.util.Atom;
import com.example.alex.util.Elements.Manganese;
import com.example.alex.util.Ion;

/**
 * Created by alex on 6/29/17.
 */

public class Manganese_2_Ion extends Ion {

    public Manganese_2_Ion(){
        super("Manganese(II)", "", getAtoms(), 2);
    }//end Mangagnese_2_Ion()

    private static Atom[] getAtoms(){
        Atom[] atoms = {new Manganese()};
        return atoms;
    }//end getAtoms()

}//end Manganese_2_Ion
