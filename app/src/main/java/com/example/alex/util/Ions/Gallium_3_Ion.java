package com.example.alex.util.Ions;

import com.example.alex.util.Atom;
import com.example.alex.util.Elements.Gallium;
import com.example.alex.util.Ion;

/**
 * Created by alex on 7/5/17.
 */

public class Gallium_3_Ion extends Ion {

    public Gallium_3_Ion() {
        super("Gallium(III)", "Ga", getAtoms(), 3);
    }//end Gallium_3_Ion()

    private static Atom[] getAtoms(){
        Atom[] atoms = {new Gallium()};
        return atoms;
    }//end getAtoms()

}//end Galium_3_Ion
