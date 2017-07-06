package com.example.alex.util.Ions;

import com.example.alex.util.Atom;
import com.example.alex.util.Elements.Tin;
import com.example.alex.util.Ion;

/**
 * Created by alex on 7/5/17.
 */

public class Tin_2_Ion extends Ion {

    public Tin_2_Ion(){
        super("Tin(II)", "Sn", getAtoms(), 2);
    }//end Tin_2_Ion()

    private static Atom[] getAtoms(){
        Atom[] atoms = {new Tin()};
        return atoms;
    }//end getAtoms()

}//end Tin_2_Ion
