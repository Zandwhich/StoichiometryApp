package com.example.alex.util;

/**
 * A utility class that holds all the ions.
 * @author Alex
 *
 */
public class Ions {
	/* Positive */
	
	/** Cesium */
	public static Ion cesium_Ion = new Ion("Cesium", Elements_OLD.cesium.SYMBOL, 1, Elements_OLD.cesium.MASS);
	
	/** Copper(I) */
	public static Ion copper_Ion_1 = new Ion("Copper(I)", Elements_OLD.copper.SYMBOL, 1, Elements_OLD.copper.MASS);
	
	/** Thallium(I) */
	public static Ion thallium_Ion_1 = new Ion("Thallium(I)", Elements_OLD.thallium.SYMBOL, 1, Elements_OLD.thallium.MASS);
	
	/** Hydrogen */
	public static Ion hydrogen_Ion = new Ion("Hydrogen", Elements_OLD.hydrogen.SYMBOL, 1, Elements_OLD.hydrogen.MASS);
	
	/** Lithium */
	public static Ion lithium_Ion = new Ion("Lithium", Elements_OLD.lithium.SYMBOL, 1, Elements_OLD.lithium.MASS);

	/** Potassium */
	public static Ion potassium_Ion = new Ion("Potassium", Elements_OLD.potassium.SYMBOL, 1, Elements_OLD.potassium.MASS);

	/** Rubidium */
	public static Ion rubidium_Ion = new Ion("Rubidium", Elements_OLD.rubidium.SYMBOL, 1, Elements_OLD.rubidium.MASS);
		
	/** Silver */
	public static Ion silver_Ion = new Ion("Silver", Elements_OLD.silver.SYMBOL, 1, Elements_OLD.silver.MASS);
		
	/** Sodium */
	public static Ion sodium_Ion = new Ion("Sodium", Elements_OLD.sodium.SYMBOL, 1, Elements_OLD.sodium.MASS);
		
	/** Barium */
	public static Ion barium_Ion = new Ion("Barium", Elements_OLD.barium.SYMBOL, 2, Elements_OLD.barium.MASS);
		
	/** Cadmium */
	public static Ion cadmium_Ion = new Ion("Cadmium", Elements_OLD.cadmium.SYMBOL, 2, Elements_OLD.cadmium.MASS);
		
	/** Calcium */
	public static Ion calcium_Ion = new Ion("Calcium", Elements_OLD.calcium.SYMBOL, 2, Elements_OLD.calcium.MASS);
		
	/** Cobalt(II) */
	public static Ion cobalt_Ion_2 = new Ion("Cobalt(II)", Elements_OLD.cobalt.SYMBOL, 2, Elements_OLD.cobalt.MASS);
		
	/** Copper(II) */
	public static Ion copper_Ion_2 = new Ion("Copper(II)", Elements_OLD.copper.SYMBOL, 2, Elements_OLD.copper.MASS);
		
	/** Iron(II) */
	public static Ion iron_Ion_2 = new Ion("Iron(II)", Elements_OLD.iron.SYMBOL, 2, Elements_OLD.iron.MASS);
		
	/** Lead(II) */
	public static Ion lead_Ion_2 = new Ion("Lead(II)", Elements_OLD.lead.SYMBOL, 2, Elements_OLD.lead.MASS);
		
	/** Magnesium */
	public static Ion magnesium_Ion = new Ion("Magnesium", Elements_OLD.magnesium.SYMBOL, 2, Elements_OLD.magnesium.MASS);
		
	/** Manganese(II) */
	public static Ion manganese_Ion_2 = new Ion("Manganese(II)", Elements_OLD.manganese.SYMBOL, 2, Elements_OLD.manganese.MASS);
		
	/** Mercury(II) */
	public static Ion mercury_Ion_2 = new Ion("Mercury(II)", Elements_OLD.mercury.SYMBOL, 2, Elements_OLD.mercury.MASS);
		
	/** Nickel */
	public static Ion nickel_Ion = new Ion("Nickel", Elements_OLD.nickel.SYMBOL, 2, Elements_OLD.nickel.MASS);
		
	/** Strontium */
	public static Ion strontium_Ion = new Ion("Strontium", Elements_OLD.strontium.SYMBOL, 2, Elements_OLD.strontium.MASS);
		
	/** Tin(II) */
	public static Ion tin_Ion_2 = new Ion("Tin(II)", Elements_OLD.tin.SYMBOL, 2, Elements_OLD.tin.MASS);
		
	/** Zinc */
	public static Ion zinc_Ion = new Ion("Zinc", Elements_OLD.zinc.SYMBOL, 2, Elements_OLD.zinc.MASS);
		
	/** Aluminum */
	public static Ion aluminum_Ion = new Ion("Aluminum", Elements_OLD.aluminum.SYMBOL, 3, Elements_OLD.aluminum.MASS);
		
	/** Bismuth(III) */
	public static Ion bismuth_Ion_3 = new Ion("Bismuth(III)", Elements_OLD.bismuth.SYMBOL, 3, Elements_OLD.bismuth.MASS);
		
	/** Cerium(III) */
	public static Ion cerium_Ion_3 = new Ion("Cerium(III)", Elements_OLD.cerium.SYMBOL, 3, Elements_OLD.cerium.MASS);
		
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

}//end class Ions
