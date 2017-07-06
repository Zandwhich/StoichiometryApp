package com.example.alex.util.Ions;

import com.example.alex.util.Atom;
import com.example.alex.util.Elements.Zinc;
import com.example.alex.util.Ion;

/**
 * Created by alex on 7/5/17.
 */

public class Zinc_Ion extends Ion {

    public Zinc_Ion(){
        super("Zinc", "Zn", getAtoms(), 2);
    }//end Zinc_Ion()

    private static Atom[] getAtoms(){
        Atom[] atoms = {new Zinc()};
        return atoms;
    }//end getAtoms()

}//end Zinc_Ion
