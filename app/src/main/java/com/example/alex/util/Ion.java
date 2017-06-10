package com.example.alex.util;

/**
 * A class that defines Ions. (IDK)
 * @author Alex
 *
 */
public class Ion {
	/** The ion's name. */
	public final String NAME;
	
	/** The ion's symbol. */
	public final String SYMBOL;
	
	/** The ion's charge. */
	public final int CHARGE;
	
	/** The ion's mass. */
	public final double MASS;
	
	/**
	 * The only constructor for the Ion class.
	 * @param iName The ion's name.
	 * @param iSymbol The ion's symbol.
	 * @param iCharge The ion's charge.
	 * @param iMass The ion's mass.
	 */
	public Ion(String iName, String iSymbol, int iCharge, double iMass){
		NAME = iName;
		SYMBOL = iSymbol;
		CHARGE = iCharge;
		MASS = iMass;
	}//end Ion()

}//end class Ion
