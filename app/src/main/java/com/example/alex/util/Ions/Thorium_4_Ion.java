package com.example.alex.util.Ions;

import com.example.alex.util.Atom;
import com.example.alex.util.Elements.Thorium;
import com.example.alex.util.Ion;

/**
 * Created by alex on 7/5/17.
 */

public class Thorium_4_Ion extends Ion {

    public Thorium_4_Ion() {
        super("Thorium(IV)", "Th", getAtoms(), 4);
    }//end Thorium_4_Ion()

    private static Atom[] getAtoms() {
        Atom[] atoms = {new Thorium()};
        return atoms;
    }//end getAtoms()


}//end Thorium_4_Ion
