package com.example.alex.util.Ions;

import com.example.alex.util.Atom;
import com.example.alex.util.Elements.Strontium;
import com.example.alex.util.Ion;

/**
 * Created by alex on 7/5/17.
 */

public class Strontium_Ion extends Ion {

    public Strontium_Ion(){
        super("Strontium", "Sr", getAtoms(), 2);
    }//end Strontium_Ion()

    private static Atom[] getAtoms(){
        Atom[] atoms = {new Strontium()};
        return atoms;
    }//end getAtoms()

}//end Strontium_Ion
