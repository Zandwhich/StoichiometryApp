package com.example.alex.util;

/**
 * Created by alex on 6/25/17.
 */

public abstract class Molecule extends BasicUnit{

    /** A variable to store the molecule's atoms */
    public final Atom[] ATOMS;

    /**
     * The constructor for the Molecule class.
     * @param name The name of the molecule
     * @param symbol The symbol of the molecule
     * @param atoms The atoms that makeup the molecule
     */
    public Molecule(String name, String symbol, Atom[] atoms) {
        super(name, symbol, getMass(atoms));
        this.ATOMS = atoms;
    }//end Molecule()

    /**
     * A private method to get the mass of the molecule from its
     * component atoms.
     * @param atoms The atoms in the molecule
     * @return The mass of the molecule
     */
    private static double getMass(Atom[] atoms) {
        double mass = 0;
        for (Atom atom : atoms) {
            mass += atom.MASS;
        }//end for
        return mass;
    }//end getMass()

}//end Molecule
