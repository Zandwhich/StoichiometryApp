package com.example.alex.util.Ions;

import com.example.alex.util.Atom;
import com.example.alex.util.Elements.Potassium;
import com.example.alex.util.Ion;

/**
 * Created by alex on 6/28/17.
 */

public class Potassium_Ion extends Ion {

    public Potassium_Ion(){
        super("Potassium", "K", getAtoms(), 1);
    }//end Potassium_Ion()

    private static Atom[] getAtoms(){
        Potassium potassium = new Potassium();
        Atom[] atoms = {potassium};
        return atoms;
    }
}//end Potassium_Ion
