package com.example.alex.util.Ions;

import com.example.alex.util.Atom;
import com.example.alex.util.Elements.Magnesium;
import com.example.alex.util.Ion;

/**
 * Created by alex on 6/29/17.
 */

public class Magnesium_Ion extends Ion {

    public Magnesium_Ion(){
        super("Magnesium", "Mg", getAtoms(), 2);
    }//end Magnesium_Ion()

    private static Atom[] getAtoms(){
        Atom[] atoms = {new Magnesium()};
        return atoms;
    }//end getAtoms()

}//end Magnesium_Ion
