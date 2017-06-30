package com.example.alex.util.Ions;

import com.example.alex.util.Atom;
import com.example.alex.util.Elements.Silver;
import com.example.alex.util.Ion;

/**
 * Created by alex on 6/29/17.
 */

public class Silver_Ion extends Ion {

    public Silver_Ion(){
        super("Silver", "Ag", getAtoms(), 1);
    }//end Silver_Ion()

    private static Atom[] getAtoms(){
        Atom[] atoms = {new Silver()};
        return atoms;
    }//end getAtoms()
}//end Silver_Ion
