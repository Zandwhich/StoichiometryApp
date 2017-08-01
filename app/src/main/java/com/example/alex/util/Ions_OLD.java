package com.example.alex.util;

import com.example.alex.util.Ions.Aluminum_Ion;
import com.example.alex.util.Ions.Barium_Ion;
import com.example.alex.util.Ions.Bismuth_3_Ion;
import com.example.alex.util.Ions.Cadmium_Ion;
import com.example.alex.util.Ions.Calcium_Ion;
import com.example.alex.util.Ions.Cerium_3_Ion;
import com.example.alex.util.Ions.Cesium_Ion;
import com.example.alex.util.Ions.Cobalt_2_Ion;
import com.example.alex.util.Ions.Copper_1_Ion;
import com.example.alex.util.Ions.Copper_2_Ion;
import com.example.alex.util.Ions.Hydrogen_Ion;
import com.example.alex.util.Ions.Iron_2_Ion;
import com.example.alex.util.Ions.Lead_2_Ion;
import com.example.alex.util.Ions.Lithium_Ion;
import com.example.alex.util.Ions.Magnesium_Ion;
import com.example.alex.util.Ions.Manganese_2_Ion;
import com.example.alex.util.Ions.Mercury_2_Ion;
import com.example.alex.util.Ions.Nickel_Ion;
import com.example.alex.util.Ions.Potassium_Ion;
import com.example.alex.util.Ions.Rubidium_Ion;
import com.example.alex.util.Ions.Silver_Ion;
import com.example.alex.util.Ions.Sodium_Ion;
import com.example.alex.util.Ions.Strontium_Ion;
import com.example.alex.util.Ions.Thallium_1_Ion;
import com.example.alex.util.Ions.Tin_2_Ion;
import com.example.alex.util.Ions.Zinc_Ion;

/**
 * A utility class that holds all the ions.
 * @author Alex
 *
 */
public class Ions_OLD {
	/* Positive */
	
	/** Cesium */
	public static Cesium_Ion cesium_ion = new Cesium_Ion();
	
	/** Copper(I) */
	public static Copper_1_Ion copper_1_ion = new Copper_1_Ion();
	
	/** Thallium(I) */
	public static Thallium_1_Ion thallium_1_ion = new Thallium_1_Ion();
	
	/** Hydrogen */
	public static Hydrogen_Ion hydrogen_ion = new Hydrogen_Ion();
	
	/** Lithium */
	public static Lithium_Ion lithium_ion = new Lithium_Ion();

	/** Potassium */
	public static Potassium_Ion potassium_ion = new Potassium_Ion();

	/** Rubidium */
	public static Rubidium_Ion rubidium_ion = new Rubidium_Ion();
		
	/** Silver */
	public static Silver_Ion silver_ion = new Silver_Ion();
		
	/** Sodium */
	public static Sodium_Ion sodium_ion = new Sodium_Ion();
		
	/** Barium */
	public static Barium_Ion barium_ion = new Barium_Ion();
		
	/** Cadmium */
	public static Cadmium_Ion cadmium_ion = new Cadmium_Ion();
		
	/** Calcium */
	public static Calcium_Ion calcium_ion = new Calcium_Ion();
		
	/** Cobalt(II) */
	public static Cobalt_2_Ion cobalt_2_ion = new Cobalt_2_Ion();
		
	/** Copper(II) */
	public static Copper_2_Ion copper_2_ion = new Copper_2_Ion();
		
	/** Iron(II) */
	public static Iron_2_Ion iron_2_ion = new Iron_2_Ion();

	/** Lead(II) */
	public static Lead_2_Ion lead_2_ion = new Lead_2_Ion();
		
	/** Magnesium */
	public static Magnesium_Ion magnesium_ion = new Magnesium_Ion();
		
	/** Manganese(II) */
	public static Manganese_2_Ion manganese_2_ion = new Manganese_2_Ion();
		
	/** Mercury(II) */
	public static Mercury_2_Ion mercury_2_ion = new Mercury_2_Ion();
		
	/** Nickel */
	public static Nickel_Ion nickel_ion = new Nickel_Ion();
		
	/** Strontium */
	public static Strontium_Ion strontium_ion = new Strontium_Ion();
		
	/** Tin(II) */
	public static Tin_2_Ion tin_2_ion = new Tin_2_Ion();
		
	/** Zinc */
	public static Zinc_Ion zinc_ion = new Zinc_Ion();
		
	/** Aluminum */
	public static Aluminum_Ion aluminum_ion = new Aluminum_Ion();
		
	/** Bismuth(III) */
	public static Bismuth_3_Ion bismuth_3_ion = new Bismuth_3_Ion();
		
	/** Cerium(III) */
	public static Cerium_3_Ion cerium_3_ion = new Cerium_3_Ion();
		
	/** Chromium(III) */
	public static Ion chromium_Ion_3 = new Ion("Chromium(III)", Elements_OLD.chromium.SYMBOL, 3, Elements_OLD.chromium.MASS);
		
	/** Gallium(III) */
	public static Ion gallium_Ion_3 = new Ion("Galium(III)", Elements_OLD.gallium.SYMBOL, 3, Elements_OLD.gallium.MASS);
		
	/** Iron(III) */
	public static Ion iron_Ion_3 = new Ion("Iron(III)", Elements_OLD.iron.SYMBOL, 3, Elements_OLD.iron.MASS);
		
	/** Germanium(IV) */
	public static Ion germanium_Ion_4 = new Ion("Germanium(IV)", Elements_OLD.germanium.SYMBOL, 4, Elements_OLD.germanium.MASS);
		
	/** Lead(IV) */
	public static Ion lead_Ion_4 = new Ion("Lead(IV)", Elements_OLD.lead.SYMBOL, 4, Elements_OLD.lead.MASS);
		
	/** Silicon(IV) */
	public static Ion silicon_Ion_4 = new Ion("Silicon(IV)", Elements_OLD.silicon.SYMBOL, 4, Elements_OLD.silicon.MASS);
		
	/** Thorium(IV) */
	public static Ion thorium_Ion_4 = new Ion("Thorium(IV)", Elements_OLD.thorium.SYMBOL, 4, Elements_OLD.thorium.MASS);
		
	/** Tin(IV) */
	public static Ion tin_Ion_4 = new Ion("Tin(IV)", Elements_OLD.tin.SYMBOL, 4, Elements_OLD.tin.MASS);
		
	/** Zirconium(IV) */
	public static Ion zirconium_Ion_4 = new Ion("Zirconium(IV)", Elements_OLD.zirconium.SYMBOL, 4, Elements_OLD.zirconium.MASS);
		
	/** Ammonium */
	public static Ion ammonium = new Ion("Ammonium",
			Elements_OLD.nitrogen.SYMBOL + Elements_OLD.hydrogen.SYMBOL + "4",
			1,
			Elements_OLD.nitrogen.MASS + 4 * Elements_OLD.hydrogen.MASS);
		
	/* Negative */
		
	/** Bromide */
	public static Ion bromide = new Ion("Bromide", Elements_OLD.bromine.SYMBOL, -1, Elements_OLD.bromine.MASS);
		
	/** Chloride */
	public static Ion chloride = new Ion("Chloride", Elements_OLD.chlorine.SYMBOL, -1, Elements_OLD.chlorine.MASS);
		
	/** Fluoride */
	public static Ion flouride = new Ion("Flouride", Elements_OLD.flourine.SYMBOL, -1, Elements_OLD.flourine.MASS);
		
	/** Iodide */
	public static Ion iodide = new Ion("Iodide", Elements_OLD.iodine.SYMBOL, -1, Elements_OLD.iodine.MASS);
		
	/** Oxide */
	public static Ion oxide = new Ion("Oxide", Elements_OLD.oxygen.SYMBOL, -2, Elements_OLD.oxygen.MASS);
		
	/** Selenide */
	public static Ion slenide = new Ion("Selenide", Elements_OLD.selenium.SYMBOL, -2, Elements_OLD.selenium.MASS);
		
	/** Sulfide */
	public static Ion sulfide = new Ion("Sulfide", Elements_OLD.sulfur.SYMBOL, -2, Elements_OLD.sulfur.MASS);
		
	/** Telluride */
	public static Ion telluride = new Ion("Telluride", Elements_OLD.tellurium.SYMBOL, -2, Elements_OLD.tellurium.MASS);
		
	/** Nitride */
	public static Ion nitride = new Ion("Nitride", Elements_OLD.nitrogen.SYMBOL, -3, Elements_OLD.nitrogen.MASS);
		
	/** Phosphide */
	public static Ion phosphide = new Ion("Phosphide", Elements_OLD.phosphorus.SYMBOL, -3, Elements_OLD.phosphorus.MASS);
		
	/** Carbide */
	public static Ion carbide = new Ion("Carbide", Elements_OLD.carbon.SYMBOL, -4, Elements_OLD.carbon.MASS);
		
	
	/** Acetate */
	public static Ion acetate = new Ion("Acetate", 
			Elements_OLD.carbon.SYMBOL + "2" + Elements_OLD.hydrogen.SYMBOL + "3" + Elements_OLD.oxygen.SYMBOL + "2",
			-1, 
			Elements_OLD.carbon.MASS * 2 + Elements_OLD.hydrogen.MASS * 3 + Elements_OLD.oxygen.MASS * 2);
		
		
	/** Azide */
	public static Ion azide = new Ion("Azide", 
			Elements_OLD.nitrogen.SYMBOL + "3",
			-1, 
			Elements_OLD.nitrogen.MASS * 3);
		
		
	/** Benzoate */
	public static Ion benzoate = new Ion("Benzoate",
			Elements_OLD.carbon.SYMBOL + "7" + Elements_OLD.hydrogen.SYMBOL + "5" + Elements_OLD.oxygen.SYMBOL + "2",
			-1,
			Elements_OLD.carbon.MASS * 7 + Elements_OLD.hydrogen.MASS * 5 + Elements_OLD.oxygen.MASS * 2);
		
		
	/** Bicarbonate */
	public static Ion bicarbonate = new Ion("Bicarbonate",
			Elements_OLD.hydrogen.SYMBOL + Elements_OLD.carbon.SYMBOL + Elements_OLD.oxygen.SYMBOL + "3",
			-1,
			Elements_OLD.hydrogen.MASS + Elements_OLD.carbon.MASS + Elements_OLD.oxygen.MASS * 3);
		
		
	/** Bisulfite */
	public static Ion bisulfite = new Ion("Bisulfite",
			Elements_OLD.hydrogen.SYMBOL + Elements_OLD.sulfur.SYMBOL + Elements_OLD.oxygen.SYMBOL + "3",
			-1,
			Elements_OLD.hydrogen.MASS + Elements_OLD.sulfur.MASS + Elements_OLD.oxygen.MASS * 3);
		
		
		
	/** Bromate */
	public static Ion bromate = new Ion("Bromate",
			Elements_OLD.bromine.SYMBOL + Elements_OLD.oxygen.SYMBOL + "3",
			-1,
			Elements_OLD.bromine.MASS + Elements_OLD.oxygen.MASS * 3);
	
	
	/** Chlorate */
	public static Ion chlorate = new Ion("Chlorate",
			Elements_OLD.chlorine.SYMBOL + Elements_OLD.oxygen.SYMBOL + "3",
			-1,
			Elements_OLD.chlorine.MASS + Elements_OLD.oxygen.MASS * 3);
	
	
	/** Chlorite */
	public static Ion chlorite = new Ion("Chlorite",
			Elements_OLD.chlorine.SYMBOL + Elements_OLD.oxygen.SYMBOL + "2",
			-1,
			Elements_OLD.chlorine.MASS + Elements_OLD.oxygen.MASS * 2);
	
	
	/** Cyanide */
	public static Ion cyanide = new Ion("Cyanide",
			Elements_OLD.carbon.SYMBOL + Elements_OLD.nitrogen.SYMBOL,
			-1,
			Elements_OLD.carbon.MASS + Elements_OLD.nitrogen.MASS);
	
	
	/** Formate */
	public static Ion formate = new Ion("Formate",
			Elements_OLD.carbon.SYMBOL + Elements_OLD.hydrogen.SYMBOL + Elements_OLD.oxygen.SYMBOL + "2",
			-1,
			Elements_OLD.carbon.MASS + Elements_OLD.hydrogen.MASS + Elements_OLD.oxygen.MASS * 2);
	
	
	/** Hydroxide */
	public static Ion hydroxide = new Ion("Hydroxide",
			Elements_OLD.oxygen.SYMBOL + Elements_OLD.hydrogen.SYMBOL,
			-1,
			Elements_OLD.oxygen.MASS + Elements_OLD.hydrogen.MASS);
	
	
	/** Hypochlorite */
	public static Ion hypochlorite = new Ion("Hypochlorite",
			Elements_OLD.chlorine.SYMBOL + Elements_OLD.oxygen.SYMBOL,
			-1,
			Elements_OLD.chlorine.MASS + Elements_OLD.oxygen.MASS);
	
	
	/** Hypophosphoite */
	public static Ion hypophosphite = new Ion("Hypophosphite",
			Elements_OLD.phosphorus.SYMBOL + Elements_OLD.hydrogen.SYMBOL + "2" + Elements_OLD.oxygen.SYMBOL + "2",
			-1,
			Elements_OLD.phosphorus.MASS + Elements_OLD.hydrogen.MASS * 2 + Elements_OLD.oxygen.MASS * 2);
	
	
	/** Iodate */
	public static Ion iodate = new Ion("Iodate",
			Elements_OLD.iodine.SYMBOL + Elements_OLD.oxygen.SYMBOL + "3",
			-1,
			Elements_OLD.iodine.MASS + Elements_OLD.oxygen.MASS * 3);
	
	
	/** Metaphosphate */
	public static Ion metaphosphate = new Ion("Metaphosphate",
			Elements_OLD.phosphorus.SYMBOL + Elements_OLD.oxygen.SYMBOL + "3",
			-1,
			Elements_OLD.phosphorus.MASS + Elements_OLD.oxygen.MASS * 3);
	
		
	/** Nitrate */
	public static Ion nitrate = new Ion("Nitrate",
			Elements_OLD.nitrogen.SYMBOL + Elements_OLD.oxygen.SYMBOL + "3",
			-1,
			Elements_OLD.nitrogen.MASS + Elements_OLD.oxygen.MASS * 3);
	
	
	/** Nitrite */
	public static Ion nitrite = new Ion("Nitrite",
			Elements_OLD.nitrogen.SYMBOL + Elements_OLD.oxygen.SYMBOL + "2",
			-1,
			Elements_OLD.nitrogen.MASS + Elements_OLD.oxygen.MASS * 2);
	
	
	/** Perchlorate */
	public static Ion perchlorate = new Ion("Perchlorate",
			Elements_OLD.chlorine.SYMBOL + Elements_OLD.oxygen.SYMBOL + "4",
			-1,
			Elements_OLD.chlorine.MASS + Elements_OLD.oxygen.MASS * 4);
	
	
	/** Periodate */
	public static Ion periodate = new Ion("Periodate",
			Elements_OLD.iodine.SYMBOL + Elements_OLD.oxygen.SYMBOL + "4",
			-1,
			Elements_OLD.iodine.MASS + Elements_OLD.oxygen.MASS * 4);
	
	
	/** Permanganate */
	public static Ion permangante = new Ion("Permanganate",
			Elements_OLD.manganese.SYMBOL + Elements_OLD.oxygen.SYMBOL + "4",
			-1,
			Elements_OLD.manganese.MASS + Elements_OLD.oxygen.MASS + 4);
	
	
	/** Peroxyborate */
	public static Ion peroxyborate = new Ion("Peroxyborate",
			Elements_OLD.boron.SYMBOL + Elements_OLD.oxygen.SYMBOL + "3",
			-1,
			Elements_OLD.boron.MASS + Elements_OLD.oxygen.MASS * 3);
	
	
	/** Thiocyanate */
	public static Ion thiocyanate = new Ion("Thiocyanate",
			Elements_OLD.sulfur.SYMBOL + Elements_OLD.carbon.SYMBOL + Elements_OLD.nitrogen.SYMBOL,
			-1,
			Elements_OLD.sulfur.MASS + Elements_OLD.carbon.MASS + Elements_OLD.nitrogen.MASS);
	
	
	/** Vanadate */
	public static Ion vanadate = new Ion("Vanadate",
			Elements_OLD.vanadium.SYMBOL + Elements_OLD.oxygen.SYMBOL + "3",
			-1,
			Elements_OLD.vanadium.MASS + Elements_OLD.oxygen.MASS * 3);

}//end class Ions_OLD
