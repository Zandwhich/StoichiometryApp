package com.example.alex.util.Ions;

import com.example.alex.util.Atom;
import com.example.alex.util.Elements.Barium;
import com.example.alex.util.Ion;

/**
 * Created by alex on 6/29/17.
 */

public class Barium_Ion extends Ion {

    public Barium_Ion(){
        super("Barium", "Ba", getAtoms(), 2);
    }//end Barium_Ion()

    private static Atom[] getAtoms(){
        Atom[] atoms = {new Barium()};
        return atoms;
    }//end getAtoms()

}//end Barium_Ion
