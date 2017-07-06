package com.example.alex.util.Ions;

import com.example.alex.util.Atom;
import com.example.alex.util.Elements.Cerium;
import com.example.alex.util.Ion;

/**
 * Created by alex on 7/5/17.
 */

public class Cerium_3_Ion extends Ion {

    public Cerium_3_Ion(){
        super("Cerium(III)", "Ce", getAtoms(), 3);
    }//end Cerium_3_Ion()

    private static Atom[] getAtoms(){
        Atom[] atoms = {new Cerium()};
        return atoms;
    }//end getAtoms()

}//end Cerium_3_Ion
