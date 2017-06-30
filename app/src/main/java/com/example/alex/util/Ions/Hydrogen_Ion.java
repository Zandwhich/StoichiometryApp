package com.example.alex.util.Ions;

import com.example.alex.util.Atom;
import com.example.alex.util.Elements.Hydrogen;
import com.example.alex.util.Ion;

/**
 * Created by alex on 6/28/17.
 */

public class Hydrogen_Ion extends Ion {

    public Hydrogen_Ion(){
        super("Hydrogen", "H", getAtoms(), 1);
    }//end Hydrogen_Ion()

    private static Atom[] getAtoms(){
        Hydrogen hydrogen = new Hydrogen();
        Atom[] atoms = {hydrogen};
        return atoms;
    }//end getAtoms()
}//end Hydrogen_Ion
