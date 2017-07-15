package com.example.alex.util.Ions;

import com.example.alex.util.Atom;
import com.example.alex.util.Elements.Carbon;
import com.example.alex.util.Elements.Nitrogen;
import com.example.alex.util.Ion;

/**
 * Created by alex on 7/14/17.
 */

public class Cyanide extends Ion {

    public Cyanide() {
        super("Cyanide","CN3", getAtoms(), -1);
    }//end Cyanide()

    private static Atom[] getAtoms() {
        Atom[] atoms = {new Carbon(), new Nitrogen()};
        return atoms;
    }//end getAtoms()

}//end Cyanide
