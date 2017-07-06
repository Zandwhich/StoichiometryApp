package com.example.alex.util.Ions;

import com.example.alex.util.Atom;
import com.example.alex.util.Elements.Aluminum;
import com.example.alex.util.Ion;

/**
 * Created by alex on 7/5/17.
 */

public class Aluminum_Ion extends Ion {

    public Aluminum_Ion(){
        super("Aluminum", "Al", getAtoms(), 3);
    }//end Aluminum_Ion()

    private static Atom[] getAtoms(){
        Atom[] atoms = {new Aluminum()};
        return atoms;
    }//end getAtoms()

}//end Aluminum_Ion
