package com.example.alex.util.Ions;

import com.example.alex.util.Atom;
import com.example.alex.util.Elements.Lithium;
import com.example.alex.util.Ion;

/**
 * Created by alex on 6/28/17.
 */

public class Lithium_Ion extends Ion {

    public Lithium_Ion(){
        super("Lithium", "Li", getAtoms(), 1);
    }//end Lithium_Ion()

    private static Atom[] getAtoms(){
        Lithium lithium = new Lithium();
        Atom[] atoms ={lithium};
        return atoms;
    }//end getAtoms()

}//end Lithium
