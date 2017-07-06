package com.example.alex.util.Ions;

import com.example.alex.util.Atom;
import com.example.alex.util.Elements.Nickel;
import com.example.alex.util.Ion;

/**
 * Created by alex on 7/5/17.
 */

public class Nickel_Ion extends Ion {

    public Nickel_Ion(){
        super("Nickel", "Ni", getAtoms(), 2);
    }//end Nickel_Ion()

    private static Atom[] getAtoms(){
        Atom[] atoms = {new Nickel()};
        return atoms;
    }//end getAtoms()

}//end Nickel_Ion
