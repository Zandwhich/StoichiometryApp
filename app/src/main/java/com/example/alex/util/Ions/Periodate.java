package com.example.alex.util.Ions;

import com.example.alex.util.Atom;
import com.example.alex.util.Elements.Iodine;
import com.example.alex.util.Elements.Oxygen;
import com.example.alex.util.Ion;

/**
 * Created by alex on 7/15/17.
 */

public class Periodate extends Ion {

    public Periodate() {
        super("Periodate", "IO4", getAtoms(), -1);
    }//end Periodate()

    private static Atom[] getAtoms() {
        Atom[] atoms = {new Iodine(), new Oxygen(), new Oxygen(), new Oxygen(), new Oxygen()};
        return atoms;
    }//end getAtoms()

}//end Periodate
