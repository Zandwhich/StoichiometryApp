package com.example.alex.util.Ions;

import com.example.alex.util.Atom;
import com.example.alex.util.Elements.Iodine;
import com.example.alex.util.Elements.Oxygen;
import com.example.alex.util.Ion;

/**
 * Created by alex on 7/14/17.
 */

public class Iodate extends Ion {

    public Iodate() {
        super("Iodate", "IO3", getAtoms(), -1);
    }//end Iodate()

    private static Atom[] getAtoms() {
        Atom[] atoms = {new Iodine(), new Oxygen(), new Oxygen(), new Oxygen()};
        return atoms;
    }//end getAtoms()

}//end Iodate
