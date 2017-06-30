package com.example.alex.util;

/**
 * A class that defines Ions_OLD. (IDK)
 * @author Alex
 *
 */
public abstract class Ion extends Molecule{
	
	/** The ion's charge. */
	public final int CHARGE;
	
	/**
	 * The only constructor for the Ion class.
	 * @param name The ion's name.
	 * @param symbol The ion's symbol.
	 * @param atoms The atoms that make up the ion
	 * @param charge The ion's charge.
	 */
	public Ion(String name, String symbol, Atom[] atoms, int charge){
		super(name, symbol, atoms);
		this.CHARGE = charge;
	}//end Ion()

}//end class Ion
