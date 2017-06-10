package com.example.alex.util;

/**
 * A utility class that holds all the ions.
 * @author Alex
 *
 */
public class Ions {
	/* Positive */
	
	/** Cesium */
	public static Ion cesium_Ion = new Ion("Cesium", Elements.cesium.SYMBOL, 1, Elements.cesium.MASS);
	
	/** Copper(I) */
	public static Ion copper_Ion_1 = new Ion("Copper(I)", Elements.copper.SYMBOL, 1, Elements.copper.MASS);
	
	/** Thallium(I) */
	public static Ion thallium_Ion_1 = new Ion("Thallium(I)", Elements.thallium.SYMBOL, 1, Elements.thallium.MASS);
	
	/** Hydrogen */
	public static Ion hydrogen_Ion = new Ion("Hydrogen", Elements.hydrogen.SYMBOL, 1, Elements.hydrogen.MASS);
	
	/** Lithium */
	public static Ion lithium_Ion = new Ion("Lithium", Elements.lithium.SYMBOL, 1, Elements.lithium.MASS);

	/** Potassium */
	public static Ion potassium_Ion = new Ion("Potassium", Elements.potassium.SYMBOL, 1, Elements.potassium.MASS);

	/** Rubidium */
	public static Ion rubidium_Ion = new Ion("Rubidium", Elements.rubidium.SYMBOL, 1, Elements.rubidium.MASS);
		
	/** Silver */
	public static Ion silver_Ion = new Ion("Silver", Elements.silver.SYMBOL, 1, Elements.silver.MASS);
		
	/** Sodium */
	public static Ion sodium_Ion = new Ion("Sodium", Elements.sodium.SYMBOL, 1, Elements.sodium.MASS);
		
	/** Barium */
	public static Ion barium_Ion = new Ion("Barium", Elements.barium.SYMBOL, 2, Elements.barium.MASS);
		
	/** Cadmium */
	public static Ion cadmium_Ion = new Ion("Cadmium", Elements.cadmium.SYMBOL, 2, Elements.cadmium.MASS);
		
	/** Calcium */
	public static Ion calcium_Ion = new Ion("Calcium", Elements.calcium.SYMBOL, 2, Elements.calcium.MASS);
		
	/** Cobalt(II) */
	public static Ion cobalt_Ion_2 = new Ion("Cobalt(II)", Elements.cobalt.SYMBOL, 2, Elements.cobalt.MASS);
		
	/** Copper(II) */
	public static Ion copper_Ion_2 = new Ion("Copper(II)", Elements.copper.SYMBOL, 2, Elements.copper.MASS);
		
	/** Iron(II) */
	public static Ion iron_Ion_2 = new Ion("Iron(II)", Elements.iron.SYMBOL, 2, Elements.iron.MASS);
		
	/** Lead(II) */
	public static Ion lead_Ion_2 = new Ion("Lead(II)", Elements.lead.SYMBOL, 2, Elements.lead.MASS);
		
	/** Magnesium */
	public static Ion magnesium_Ion = new Ion("Magnesium", Elements.magnesium.SYMBOL, 2, Elements.magnesium.MASS);
		
	/** Manganese(II) */
	public static Ion manganese_Ion_2 = new Ion("Manganese(II)", Elements.manganese.SYMBOL, 2, Elements.manganese.MASS);
		
	/** Mercury(II) */
	public static Ion mercury_Ion_2 = new Ion("Mercury(II)", Elements.mercury.SYMBOL, 2, Elements.mercury.MASS);
		
	/** Nickel */
	public static Ion nickel_Ion = new Ion("Nickel", Elements.nickel.SYMBOL, 2, Elements.nickel.MASS);
		
	/** Strontium */
	public static Ion strontium_Ion = new Ion("Strontium", Elements.strontium.SYMBOL, 2, Elements.strontium.MASS);
		
	/** Tin(II) */
	public static Ion tin_Ion_2 = new Ion("Tin(II)", Elements.tin.SYMBOL, 2, Elements.tin.MASS);
		
	/** Zinc */
	public static Ion zinc_Ion = new Ion("Zinc", Elements.zinc.SYMBOL, 2, Elements.zinc.MASS);
		
	/** Aluminum */
	public static Ion aluminum_Ion = new Ion("Aluminum", Elements.aluminum.SYMBOL, 3, Elements.aluminum.MASS);
		
	/** Bismuth(III) */
	public static Ion bismuth_Ion_3 = new Ion("Bismuth(III)", Elements.bismuth.SYMBOL, 3, Elements.bismuth.MASS);
		
	/** Cerium(III) */
	public static Ion cerium_Ion_3 = new Ion("Cerium(III)", Elements.cerium.SYMBOL, 3, Elements.cerium.MASS);
		
	/** Chromium(III) */
	public static Ion chromium_Ion_3 = new Ion("Chromium(III)", Elements.chromium.SYMBOL, 3, Elements.chromium.MASS);
		
	/** Gallium(III) */
	public static Ion gallium_Ion_3 = new Ion("Galium(III)", Elements.gallium.SYMBOL, 3, Elements.gallium.MASS);
		
	/** Iron(III) */
	public static Ion iron_Ion_3 = new Ion("Iron(III)", Elements.iron.SYMBOL, 3, Elements.iron.MASS);
		
	/** Germanium(IV) */
	public static Ion germanium_Ion_4 = new Ion("Germanium(IV)", Elements.germanium.SYMBOL, 4, Elements.germanium.MASS);
		
	/** Lead(IV) */
	public static Ion lead_Ion_4 = new Ion("Lead(IV)", Elements.lead.SYMBOL, 4, Elements.lead.MASS);
		
	/** Silicon(IV) */
	public static Ion silicon_Ion_4 = new Ion("Silicon(IV)", Elements.silicon.SYMBOL, 4, Elements.silicon.MASS);
		
	/** Thorium(IV) */
	public static Ion thorium_Ion_4 = new Ion("Thorium(IV)", Elements.thorium.SYMBOL, 4, Elements.thorium.MASS);
		
	/** Tin(IV) */
	public static Ion tin_Ion_4 = new Ion("Tin(IV)", Elements.tin.SYMBOL, 4, Elements.tin.MASS);
		
	/** Zirconium(IV) */
	public static Ion zirconium_Ion_4 = new Ion("Zirconium(IV)", Elements.zirconium.SYMBOL, 4, Elements.zirconium.MASS);
		
	/** Ammonium */
	public static Ion ammonium = new Ion("Ammonium",
			Elements.nitrogen.SYMBOL + Elements.hydrogen.SYMBOL + "4",
			1,
			Elements.nitrogen.MASS + 4 * Elements.hydrogen.MASS);
		
	/* Negative */
		
	/** Bromide */
	public static Ion bromide = new Ion("Bromide", Elements.bromine.SYMBOL, -1, Elements.bromine.MASS);
		
	/** Chloride */
	public static Ion chloride = new Ion("Chloride", Elements.chlorine.SYMBOL, -1, Elements.chlorine.MASS);
		
	/** Fluoride */
	public static Ion flouride = new Ion("Flouride", Elements.flourine.SYMBOL, -1, Elements.flourine.MASS);
		
	/** Iodide */
	public static Ion iodide = new Ion("Iodide", Elements.iodine.SYMBOL, -1, Elements.iodine.MASS);
		
	/** Oxide */
	public static Ion oxide = new Ion("Oxide", Elements.oxygen.SYMBOL, -2, Elements.oxygen.MASS);
		
	/** Selenide */
	public static Ion slenide = new Ion("Selenide", Elements.selenium.SYMBOL, -2, Elements.selenium.MASS);
		
	/** Sulfide */
	public static Ion sulfide = new Ion("Sulfide", Elements.sulfur.SYMBOL, -2, Elements.sulfur.MASS);
		
	/** Telluride */
	public static Ion telluride = new Ion("Telluride", Elements.tellurium.SYMBOL, -2, Elements.tellurium.MASS);
		
	/** Nitride */
	public static Ion nitride = new Ion("Nitride", Elements.nitrogen.SYMBOL, -3, Elements.nitrogen.MASS);
		
	/** Phosphide */
	public static Ion phosphide = new Ion("Phosphide", Elements.phosphorus.SYMBOL, -3, Elements.phosphorus.MASS);
		
	/** Carbide */
	public static Ion carbide = new Ion("Carbide", Elements.carbon.SYMBOL, -4, Elements.carbon.MASS);
		
	
	/** Acetate */
	public static Ion acetate = new Ion("Acetate", 
			Elements.carbon.SYMBOL + "2" + Elements.hydrogen.SYMBOL + "3" + Elements.oxygen.SYMBOL + "2", 
			-1, 
			Elements.carbon.MASS * 2 + Elements.hydrogen.MASS * 3 + Elements.oxygen.MASS * 2);
		
		
	/** Azide */
	public static Ion azide = new Ion("Azide", 
			Elements.nitrogen.SYMBOL + "3", 
			-1, 
			Elements.nitrogen.MASS * 3);
		
		
	/** Benzoate */
	public static Ion benzoate = new Ion("Benzoate",
			Elements.carbon.SYMBOL + "7" + Elements.hydrogen.SYMBOL + "5" + Elements.oxygen.SYMBOL + "2",
			-1,
			Elements.carbon.MASS * 7 + Elements.hydrogen.MASS * 5 + Elements.oxygen.MASS * 2);
		
		
	/** Bicarbonate */
	public static Ion bicarbonate = new Ion("Bicarbonate",
			Elements.hydrogen.SYMBOL + Elements.carbon.SYMBOL + Elements.oxygen.SYMBOL + "3",
			-1,
			Elements.hydrogen.MASS + Elements.carbon.MASS + Elements.oxygen.MASS * 3);
		
		
	/** Bisulfite */
	public static Ion bisulfite = new Ion("Bisulfite",
			Elements.hydrogen.SYMBOL + Elements.sulfur.SYMBOL + Elements.oxygen.SYMBOL + "3",
			-1,
			Elements.hydrogen.MASS + Elements.sulfur.MASS + Elements.oxygen.MASS * 3);
		
		
		
	/** Bromate */
	public static Ion bromate = new Ion("Bromate",
			Elements.bromine.SYMBOL + Elements.oxygen.SYMBOL + "3",
			-1,
			Elements.bromine.MASS + Elements.oxygen.MASS * 3);
	
	
	/** Chlorate */
	public static Ion chlorate = new Ion("Chlorate",
			Elements.chlorine.SYMBOL + Elements.oxygen.SYMBOL + "3",
			-1,
			Elements.chlorine.MASS + Elements.oxygen.MASS * 3);
	
	
	/** Chlorite */
	public static Ion chlorite = new Ion("Chlorite",
			Elements.chlorine.SYMBOL + Elements.oxygen.SYMBOL + "2",
			-1,
			Elements.chlorine.MASS + Elements.oxygen.MASS * 2);
	
	
	/** Cyanide */
	public static Ion cyanide = new Ion("Cyanide",
			Elements.carbon.SYMBOL + Elements.nitrogen.SYMBOL,
			-1,
			Elements.carbon.MASS + Elements.nitrogen.MASS);
	
	
	/** Formate */
	public static Ion formate = new Ion("Formate",
			Elements.carbon.SYMBOL + Elements.hydrogen.SYMBOL + Elements.oxygen.SYMBOL + "2",
			-1,
			Elements.carbon.MASS + Elements.hydrogen.MASS + Elements.oxygen.MASS * 2);
	
	
	/** Hydroxide */
	public static Ion hydroxide = new Ion("Hydroxide",
			Elements.oxygen.SYMBOL + Elements.hydrogen.SYMBOL,
			-1,
			Elements.oxygen.MASS + Elements.hydrogen.MASS);
	
	
	/** Hypochlorite */
	public static Ion hypochlorite = new Ion("Hypochlorite",
			Elements.chlorine.SYMBOL + Elements.oxygen.SYMBOL,
			-1,
			Elements.chlorine.MASS + Elements.oxygen.MASS);
	
	
	/** Hypophosphoite */
	public static Ion hypophosphite = new Ion("Hypophosphite",
			Elements.phosphorus.SYMBOL + Elements.hydrogen.SYMBOL + "2" + Elements.oxygen.SYMBOL + "2", 
			-1,
			Elements.phosphorus.MASS + Elements.hydrogen.MASS * 2 + Elements.oxygen.MASS * 2);
	
	
	/** Iodate */
	public static Ion iodate = new Ion("Iodate",
			Elements.iodine.SYMBOL + Elements.oxygen.SYMBOL + "3",
			-1,
			Elements.iodine.MASS + Elements.oxygen.MASS * 3);
	
	
	/** Metaphosphate */
	public static Ion metaphosphate = new Ion("Metaphosphate",
			Elements.phosphorus.SYMBOL + Elements.oxygen.SYMBOL + "3",
			-1,
			Elements.phosphorus.MASS + Elements.oxygen.MASS * 3);
	
		
	/** Nitrate */
	public static Ion nitrate = new Ion("Nitrate",
			Elements.nitrogen.SYMBOL + Elements.oxygen.SYMBOL + "3",
			-1,
			Elements.nitrogen.MASS + Elements.oxygen.MASS * 3);
	
	
	/** Nitrite */
	public static Ion nitrite = new Ion("Nitrite",
			Elements.nitrogen.SYMBOL + Elements.oxygen.SYMBOL + "2",
			-1,
			Elements.nitrogen.MASS + Elements.oxygen.MASS * 2);
	
	
	/** Perchlorate */
	public static Ion perchlorate = new Ion("Perchlorate",
			Elements.chlorine.SYMBOL + Elements.oxygen.SYMBOL + "4",
			-1,
			Elements.chlorine.MASS + Elements.oxygen.MASS * 4);
	
	
	/** Periodate */
	public static Ion periodate = new Ion("Periodate",
			Elements.iodine.SYMBOL + Elements.oxygen.SYMBOL + "4",
			-1,
			Elements.iodine.MASS + Elements.oxygen.MASS * 4);
	
	
	/** Permanganate */
	public static Ion permangante = new Ion("Permanganate",
			Elements.manganese.SYMBOL + Elements.oxygen.SYMBOL + "4",
			-1,
			Elements.manganese.MASS + Elements.oxygen.MASS + 4);
	
	
	/** Peroxyborate */
	public static Ion peroxyborate = new Ion("Peroxyborate",
			Elements.boron.SYMBOL + Elements.oxygen.SYMBOL + "3",
			-1,
			Elements.boron.MASS + Elements.oxygen.MASS * 3);
	
	
	/** Thiocyanate */
	public static Ion thiocyanate = new Ion("Thiocyanate",
			Elements.sulfur.SYMBOL + Elements.carbon.SYMBOL + Elements.nitrogen.SYMBOL,
			-1,
			Elements.sulfur.MASS + Elements.carbon.MASS + Elements.nitrogen.MASS);
	
	
	/** Vanadate */
	public static Ion vanadate = new Ion("Vanadate",
			Elements.vanadium.SYMBOL + Elements.oxygen.SYMBOL + "3",
			-1,
			Elements.vanadium.MASS + Elements.oxygen.MASS * 3);

}//end class Ions
