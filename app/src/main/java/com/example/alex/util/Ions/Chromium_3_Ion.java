package com.example.alex.util.Ions;

import com.example.alex.util.Atom;
import com.example.alex.util.Elements.Chromium;
import com.example.alex.util.Ion;

/**
 * Created by alex on 7/5/17.
 */

public class Chromium_3_Ion extends Ion {

    public Chromium_3_Ion(){
        super("Chromium(III)", "Cr", getAtoms(), 3);
    }//end Chromium_3_Ion()

    private static Atom[] getAtoms(){
        Atom[] atoms = {new Chromium()};
        return atoms;
    }//end getAtoms()

}//end Chromium_3_Ion
