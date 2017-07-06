package com.example.alex.util.Ions;

import com.example.alex.util.Atom;
import com.example.alex.util.Elements.Zirconium;
import com.example.alex.util.Ion;

/**
 * Created by alex on 7/5/17.
 */

public class Zirconium_4_Ion extends Ion {

    public Zirconium_4_Ion() {
        super("Zirconium(IV)", "Zr", getAtoms(), 4);
    }//end Zirconium_4_Ion()

    private static Atom[] getAtoms() {
        Atom[] atoms = {new Zirconium()};
        return atoms;
    }//end getAtoms()

}//end Zirconium_4_Ion
