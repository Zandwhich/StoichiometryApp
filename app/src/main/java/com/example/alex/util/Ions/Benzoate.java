package com.example.alex.util.Ions;

import com.example.alex.util.Atom;
import com.example.alex.util.Elements.Carbon;
import com.example.alex.util.Elements.Hydrogen;
import com.example.alex.util.Elements.Oxygen;
import com.example.alex.util.Ion;

/**
 * Created by alex on 7/12/17.
 */

public class Benzoate extends Ion {

    public Benzoate() {
        super("Benzoate", "C7H5O2", getAtoms(), -1);
    }//end Benzoate()

    private static Atom[] getAtoms() {
        Atom[] atoms = {new Carbon(), new Carbon(), new Carbon(), new Carbon(), new Carbon(),
                new Carbon(), new Carbon(), new Hydrogen(), new Hydrogen(), new Hydrogen(),
                new Hydrogen(), new Hydrogen(), new Oxygen(), new Oxygen()};
        return atoms;
    }
}//end Benzoate
