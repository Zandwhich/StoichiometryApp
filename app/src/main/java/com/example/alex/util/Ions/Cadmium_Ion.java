package com.example.alex.util.Ions;

import com.example.alex.util.Atom;
import com.example.alex.util.Elements.Cadmium;
import com.example.alex.util.Ion;

/**
 * Created by alex on 6/29/17.
 */

public class Cadmium_Ion extends Ion {

    public Cadmium_Ion(){
        super("Cadmium", "Cd", getAtoms(), 2);
    }//end Cadmium_Ion()

    private static Atom[] getAtoms(){
        Atom[] atoms = {new Cadmium()};
        return atoms;
    }//end getAtoms()
}//end Cadmium_Ion
