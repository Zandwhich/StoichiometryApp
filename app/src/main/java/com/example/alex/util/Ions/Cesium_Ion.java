package com.example.alex.util.Ions;

import com.example.alex.util.Atom;
import com.example.alex.util.Elements.Cesium;
import com.example.alex.util.Ion;

/**
 * Created by alex on 6/28/17.
 */

public class Cesium_Ion extends Ion {

    public Cesium_Ion(){
        super("Cesium", "Cs", getAtoms(), 1);
    }//end Cesium_Ion()

    private static Atom[] getAtoms(){
        Cesium cesium = new Cesium();
        Atom[] atoms = {cesium};
        return atoms;
    }//end getAtoms()
}//end Cesium_Ion
