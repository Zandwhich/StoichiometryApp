package com.example.alex.util.Ions;

import com.example.alex.util.Atom;
import com.example.alex.util.Elements.Germanium;
import com.example.alex.util.Ion;

/**
 * Created by alex on 7/5/17.
 */

public class Germanium_4_Ion extends Ion {

    public Germanium_4_Ion(){
        super("Germanium(IV)", "Ge", getAtoms(), 4);
    }//end Germanium_4_Ion()

    private static Atom[] getAtoms(){
        Atom[] atoms = {new Germanium()};
        return atoms;
    }//end getAtoms()

}//end Germanium_4_Ion
