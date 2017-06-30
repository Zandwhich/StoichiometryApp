package com.example.alex.util.Ions;

import com.example.alex.util.Atom;
import com.example.alex.util.Elements.Cobalt;
import com.example.alex.util.Ion;

/**
 * Created by alex on 6/29/17.
 */

public class Cobalt_2_Ion extends Ion {

    public Cobalt_2_Ion(){
        super("Cobalt", "Co", getAtoms(), 2);
    }//end Cobalt_2_Ion()

    private static Atom[] getAtoms(){
        Atom[] atoms = {new Cobalt()};
        return atoms;
    }//end getAtoms()
}//end Cobalt_2_Ion
