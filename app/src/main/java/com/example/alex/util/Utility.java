package com.example.alex.util;
/**
 * A class that holds a lot of stuff
 * @author Alex
 *
 */
public class Utility {
	
	/* Numbers */
	
	/** Avagadro's Number */
	public static final double AV_NUMBER = (6.02 * 10E23);
	
	/** Speed of Light (m/s) */
	public static final double SPEED_OF_LIGHT_m_by_s = (2.998 * 10E8);
	
	/* Standard */
	
	//Temperature
	
	/** Standard Temperature (C) */
	public static final double STANDARD_TEMP_Celcius = 0;
	
	/** Standard Temperature (K) */
	public static final double STANDARD_TEMP_Kelvin = 273;
	
	//Pressure
	
	/** Standard Pressure (atm) */
	public static final double STANDARD_PRES_atm = 1;
	
	/** Standard Pressure (mmHg) */
	public static final double STANDARD_PRES_mmHg = 706;
	
	/** Standard Pressure (torr) */
	public static final double STANDARD_PRES_torr = 706;
	
	/** Standard Pressure (KPa) */
	public static final double STANDARD_PRES_KPa = 101.3;
	
	//Gas Constants (R)
	
	/** Gas Constant (R) (atm) */
	public static final double R_GAS_CONSTANT_atm = .0821;
	
	/** Gas Constant (R) (mmHg) */
	public static final double R_GAS_CONSTANT_mmHg = 62.4;
	
	/** Gas Constant (R) (torr) */
	public static final double R_GAS_CONSTANT_torr = 62.4;
	
	/** Gas Constant (R) (KPa) */
	public static final double R_GAS_CONSTANT_KPa = 8.31;
	
	
	/**
	 * A method that changes a temperature from Celcius to Kelvin
	 * @param celcius The temperature in Celcius
	 * @return The temperature in Kelvin
	 */
	public static double CelciusToKelvin(double celcius){
		return celcius + STANDARD_TEMP_Kelvin;
	}//end CelciusToKelvin()
	
	/**
	 * A method that changes a temperature from Kelvin to Celcius
	 * @param kelvin The temperature in Kelvin
	 * @return The temperature in Celcius
	 */
	public static double KelvinToCelcius(double kelvin){
		return kelvin - STANDARD_TEMP_Kelvin;
	}//end KelvinToCelcius()
    
    /**
     * A method that changes a pressure from atm to KPa
     * @param atm The pressure in atm
     * @return The pressure in KPa
     */
    public static double ATMToKPa(double atm) {
        return (atm / STANDARD_PRES_atm) * STANDARD_PRES_KPa;
    }//end ATMToKPa()
    
    /**
     * A method that changes a pressure from atm to torr
     * @param atm The pressure in atm
     * @return The pressure in torr
     */
    public static double ATMToTorr(double atm) {
        return (atm / STANDARD_PRES_atm) * STANDARD_PRES_torr;
    }//end ATMToTorr()
    
    /**
     * A method that changes a pressure from atm to mmHg
     * @param atm The pressure in atm
     * @return The pressure in mmHg
     */
    public static double ATMToMmHg(double atm) {
        return (atm / STANDARD_PRES_atm) * STANDARD_PRES_mmHg;
    }//end ATMToMmHg()
    
    /**
     * A method that changes a pressure from KPa to atm
     * @param KPa The pressure in KPa
     * @return The pressure in atm
     */
    public static double KPaToATM(double KPa) {
        return (KPa / STANDARD_PRES_KPa) * STANDARD_PRES_atm;
    }//end KPaToATM()
    
    /**
     * A method that changes a pressure from KPa to torr
     * @param KPa The pressure in KPa
     * @return The pressure in torr
     */
    public static double KPaToTorr(double KPa) {
        return (KPa / STANDARD_PRES_KPa) * STANDARD_PRES_torr;
    }//end KPaToTorr()
    
    /**
     * A method that changes a pressure from KPa to mmHg
     * @param KPa The pressure in KPa
     * @return The pressure in mmHg
     */
    public static double KPaToMmHg(double KPa) {
        return (KPa / STANDARD_PRES_KPa) * STANDARD_PRES_mmHg;
    }//end KPaToMmHg()
    
    /**
     * A method that changes a pressure from torr to atm
     * @param torr The pressure in torr
     * @return The pressure in atm
     */
    public static double TorrToATM(double torr) {
        return (torr / STANDARD_PRES_torr) * STANDARD_PRES_atm;
    }//end TorrToATM()
    
    /**
     * A method that changes a pressure from torr to KPa
     * @param torr The pressure in torr
     * @return The pressure in KPa
     */
    public static double TorrToKPa(double torr) {
        return (torr / STANDARD_PRES_torr) * STANDARD_PRES_KPa;
    }//end TorrToKPA()
    
    /**
     * A method that changes a pressure from torr to mmHg
     * @param torr The pressure in torr
     * @return The pressure in mmHg
     */
    public static double TorrToMmHg(double torr) {
        return (torr / STANDARD_PRES_torr) * STANDARD_PRES_mmHg;
    }//end TorrToMmHg()
    
    /**
     * A method that changes a pressure from mmHg to atm
     * @param mmHg The pressure in mmHg
     * @return The pressure in atm
     */
    public static double MmHgToATM(double mmHg) {
        return (mmHg / STANDARD_PRES_mmHg) * STANDARD_PRES_atm;
    }//end MmHgToATM()
    
    /**
     * A method that changes a pressure from mmHg to KPa
     * @param mmHg The pressure in mmHg
     * @return The pressure in KPa
     */
    public static double MmHgToKPa(double mmHg) {
        return (mmHg / STANDARD_PRES_mmHg) * STANDARD_PRES_KPa;
    }//end MmHgToKPa()
    
    /**
     * A method that changes a pressure from mmHg to torr
     * @param mmHg The pressure in mmHg
     * @return The pressure in torr
     */
    public static double MmHgToTorr(double mmHg) {
        return (mmHg / STANDARD_PRES_mmHg) * STANDARD_PRES_torr;
    }//end MmHgToTorr()
	
}//end class Utility
