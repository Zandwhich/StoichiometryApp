package com.example.alex.util.Ions;

import com.example.alex.util.Atom;
import com.example.alex.util.Elements.Cadmium;
import com.example.alex.util.Elements.Calcium;
import com.example.alex.util.Ion;

/**
 * Created by alex on 6/29/17.
 */

public class Calcium_Ion extends Ion {

    public Calcium_Ion(){
        super("Calcium", "Ca", getAtoms(), 2);
    }//end Calcium_Ion()

    private static Atom[] getAtoms(){
        Atom[] atoms = {new Calcium()};
        return atoms;
    }//end getAtoms()
}//end Calcium_Ion
