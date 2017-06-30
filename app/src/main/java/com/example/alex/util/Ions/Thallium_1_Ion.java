package com.example.alex.util.Ions;

import com.example.alex.util.Atom;
import com.example.alex.util.Ion;
import com.example.alex.util.Elements.Thallium;

/**
 * Created by alex on 6/28/17.
 */

public class Thallium_1_Ion extends Ion {

    public Thallium_1_Ion(){
        super("Thallium(I)", "Tl", getAtoms(), 1);
    }//end Thallium_1_Ion()

    private static Atom[] getAtoms(){
        Thallium thallium = new Thallium();
        Atom[] atoms = {thallium};
        return atoms;
    }//end getAtoms()
}//end Thallium_1_Ion
