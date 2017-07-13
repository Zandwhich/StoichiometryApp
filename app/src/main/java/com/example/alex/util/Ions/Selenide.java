package com.example.alex.util.Ions;

import com.example.alex.util.Atom;
import com.example.alex.util.Elements.Selenium;
import com.example.alex.util.Ion;

/**
 * Created by alex on 7/12/17.
 */

public class Selenide extends Ion {

    public Selenide() {
        super("Selenide", "Se", getAtoms(), -2);
    }//end Selenide()

    private static Atom[] getAtoms() {
        Atom[] atoms = {new Selenium()};
        return atoms;
    }//end getAtoms()

}//end Selenide
