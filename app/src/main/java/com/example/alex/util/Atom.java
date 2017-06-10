package com.example.alex.util;
/**
 * A class that is a rubric for all of the atoms/elements
 * @author Alex
 *
 */
public class Atom {
	
	/** A variable that holds the atom's name. */
	public final String NAME;
	
	/** A variable that holds the atom's symbol. */
	public final String SYMBOL;
	
	/** A variable that holds the atom's atomic number. */
	public final int NUMBER;
	
	/** A variable to hold the atom's average mass. */
	public final double MASS;
	
	/** A variable that tells if the atom is diatomic. */
	public final boolean DIATOMIC;
	
	/**
	 * The only constructor for the Atom class.
	 * @param aName The atom's name (NAME).
	 * @param aSymbol The atom's symbol (SYMBOL).
	 * @param aNumber The atom's atomic number (NUMBER).
	 * @param aMass The atom's atomic mass (MASS).
	 * @param aDiatomic If the atom is diatomic or not (IS_DIATOMIC).
	 */
	public Atom(String aName, String aSymbol, int aNumber, double aMass, boolean aDiatomic){
		this.NAME = aName;
		this.SYMBOL = aSymbol;
		this.NUMBER = aNumber;
		this.MASS = aMass;
		this.DIATOMIC = aDiatomic;
	}//end public Atom
}//end public Atom
