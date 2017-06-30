package com.example.alex.util;
/**
 * A class that is a rubric for all of the atoms/elements
 * @author Alex
 *
 */
public abstract class Atom extends BasicUnit{
	
	/** A variable that holds the atom's atomic number. */
	public final int NUMBER;
	
	/** A variable that tells if the atom is diatomic. */
	public final boolean DIATOMIC;
	
	/**
	 * The only constructor for the Atom class.
	 * @param name The atom's name (NAME).
	 * @param symbol The atom's symbol (SYMBOL).
	 * @param number The atom's atomic number (NUMBER).
	 * @param mass The atom's atomic mass (MASS).
	 * @param diatomic If the atom is diatomic or not (IS_DIATOMIC).
	 */
	public Atom(String name, String symbol, int number, double mass, boolean diatomic){
		super(name, symbol, mass);
		this.NUMBER = number;
		this.DIATOMIC = diatomic;
	}//end public Atom
}//end public Atom
