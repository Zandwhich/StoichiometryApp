package com.example.alex.util;

import android.nfc.tech.NfcA;
import android.opengl.GLDebugHelper;
import android.text.style.BulletSpan;

import com.example.alex.util.Elements.*;

/**
 * A utility class that holds all the atoms.
 * @author Alex
 *
 */
public class Elements_OLD {

	public final static Atom[] allElements = new Atom[118];

	/** Hydrogen */
	public final static Hydrogen HYDROGEN = new Hydrogen();

	/** Helium */
	public final static Helium HELIUM = new Helium();
	
	/** Lithium */
	public final static Lithium LITHIUM = new Lithium();
	
	/** Beryllium */
	public final static Beryllium BERYLLIUM = new Beryllium();
	
	/** Boron */
	public final static Boron BORON = new Boron();
	
	/** Carbon */
	public final static Carbon CARBON = new Carbon();
	
	/** Nitrogen */
	public final static Nitrogen NITROGEN = new Nitrogen();
	
	/** Oxygen */
	public final static Oxygen OXYGEN = new Oxygen();
	
	/** Flourine */
	public final static Fluorine FLUORINE = new Fluorine();
	
	/** Neon */
	public final static Neon NEON = new Neon();
	
	/** Sodium */
	public final static Sodium SODIUM = new Sodium();
	
	/** Magnesium */
	public final static Magnesium MAGNESIUM = new Magnesium();
	
	/** Aluminum */
	public final static Aluminum ALUMINUM = new Aluminum();
	
	/** Silicon */
	public final static Silicon SILICON = new Silicon();
	
	/** Phosphorus */
	public final static Phosphorus PHOSPHORUS = new Phosphorus();
	
	/** Sulfur */
	public final static Sulfur SULFUR = new Sulfur();
	
	/** Chlorine */
	public final static Chlorine CHLORINE = new Chlorine();
	
	/** Argon */
	public final static Argon ARGON = new Argon();
	
	/** Potassium */
	public final static Potassium POTASSIUM = new Potassium();
	
	/** Calcium */
	public final static Calcium CALCIUM = new Calcium();
	
	/** Scandium */
	public final static Scandium SCANDIUM = new Scandium();
	
	/** Titanium */
	public final static Titanium TITANIUM = new Titanium();
	
	/** Vanadium */
	public final static Vanadium VANADIUM = new Vanadium();
	
	/** Chromium */
	public final static Chromium CHROMIUM = new Chromium();
	
	/** Manganese */
	public final static Manganese MANGANESE = new Manganese();
	
	/** Iron */
	public final static Iron IRON = new Iron();
	
	/** Cobalt */
	public final static Cobalt COBALT = new Cobalt();
	
	/** Nickel */
	public final static Nickel NICKEL = new Nickel();
	
	/** Copper */
	public final static Copper COPPER = new Copper();
	
	/** Zinc */
	public final static Zinc ZINC = new Zinc();
	
	/** Gallium */
	public final static Gallium GALLIUM = new Gallium();
	
	/** Germanium */
	public final static Germanium GERMANIUM = new Germanium();
	
	/** Arsenic */
	public final static Arsenic ARSENIC = new Arsenic();
	
	/** Selenium */
	public final static Selenium SELENIUM = new Selenium();
	
	/** Bromine */
	public final static Bromine BROMINE = new Bromine();
	
	/** Krypton */
	public final static Krypton KRYPTON = new Krypton();
	
	/** Rubidium */
	public final static Rubidium RUBIDIUM = new Rubidium();
	
	/** Strontium */
	public final static Strontium STRONTIUM = new Strontium();
	
	/** Yttrium */
	public final static Yttrium YTTRIUM = new Yttrium();
	
	/** Zirconium */
	public final static Zirconium ZIRCONIUM = new Zirconium();
	
	/** Niobium */
	public final static Niobium NIOBIUM = new Niobium();
	
	/** Molybdenum */
	public final static Molybdenum MOLYBDENUM = new Molybdenum();
	
	/** Technetium */
	public final static Technetium TECHNETIUM = new Technetium();
	
	/** Ruthenium */
	public final static Ruthenium RUTHENIUM = new Ruthenium();
	
	/** Rhodium */
	public final static Rhodium RHODIUM = new Rhodium();
	
	/** Palladium */
	public final static Palladium PALLADIUM = new Palladium();
	
	/** Silver */
	public final static Silver SILVER = new Silver();
	
	/** Cadmium */
	public final static Cadmium CADMIUM = new Cadmium();
	
	/** Indium */
	public final static Indium INDIUM = new Indium();
	
	/** Tin */
	public final static Tin TIN = new Tin();
	
	/** Antimony */
	public final static Antimony ANTIMONY = new Antimony();
	
	/** Tellurium */
	public final static Tellurium TELLURIUM = new Tellurium();

	/** Iodine */
	public final static Iodine IODINE = new Iodine();
	
	/** Xenon */
	public final static Xenon XENON = new Xenon();
	
	/** Cesium */
	public final static Cesium CESIUM = new Cesium();
	
	/** Barium */
	public final static Barium BARIUM = new Barium();
	
	/** Lanthanum */
	public final static Lanthanum LANTHANUM = new Lanthanum();
	
	/** Cerium */
	public final static Cerium CERIUM = new Cerium();
	
	/** Praesodymium */
	public final static Praseodymium PRASEODYMIUM = new Praseodymium();
	
	/** Neodymium */
	public final static Neodymium NEODYMIUM = new Neodymium();
	
	/** Promethium */
	public final static Promethium PROMETHIUM = new Promethium();
	
	/** Samarium */
	public final static Samarium SAMARIUM = new Samarium();
	
	/** Europium */
	public final static Europium EUROPIUM = new Europium();
	
	/** Gadolinium */
	public final static Gadolinium GADOLINIUM = new Gadolinium();
	
	/** Terbium */
	public final static Terbium TERBIUM = new Terbium();
	
	/** Dysprosium */
	public final static Dysprosium DYSPROSIUM = new Dysprosium();
	
	/** Holmium */
	public final static Holmium HOLMIUM = new Holmium();
	
	/** Erbium */
	public final static Erbium ERBIUM = new Erbium();
	
	/** Thulium */
	public final static Thulium THULIUM = new Thulium();
	
	/** Ytterbium */
	public final static Ytterbium YTTERBIUM = new Ytterbium();
	
	/** Lutetium */
	public final static Lutetium LUTETIUM = new Lutetium();
	
	/** Hafnium */
	public final static Hafnium HAFNIUM = new Hafnium();
	
	/** Tantalum */
	public final static Tantalum TANTALUM = new Tantalum();
	
	/** Tungsten */
	public final static Tungsten TUNGSTEN = new Tungsten();
	
	/** Rhenium */
	public final static Rhenium RHENIUM = new Rhenium();
	
	/** Osmium */
	public final static Osmium OSMIUM = new Osmium();
	
	/** Iridium */
	public final static Iridium IRIDIUM = new Iridium();
	
	/** Platinum */
	public final static Platinum PLATNIUM = new Platinum();
	
	/** Gold */
	public final static Gold GOLD = new Gold();
	
	/** Mercury */
	public final static Mercury MERCURY = new Mercury();
	
	/** Thallium */
	public final static Thallium THALLIUM = new Thallium();
	
	/** Lead */
	public final static Lead LEAD = new Lead();
	
	/** Bismuth */
	public final static Bismuth BISMUTH = new Bismuth();
	
	/** Polonium */
	public final static Polonium POLONIUM = new Polonium();
	
	/** Astatine */
	public final static Astatine ASTATINE = new Astatine();
	
	/** Radon */
	public final static Radon RADON = new Radon();
	
	/** Francium */
	public final static Francium FRANCIUM = new Francium();
	
	/** Radium */
	public final static Radium RADIUM = new Radium();
	
	/** Actinium */
	public final static Actinium ACTINIUM = new Actinium();
	
	/** Thorium */
	public final static Thorium THORIUM = new Thorium();
	
	/** Protactinium */
	public final static Protactinium PROTACTINIUM = new Protactinium();
	
	/** Uranium */
	public final static Uranium URANIUM = new Uranium();
	
	/** Neptunium */
	public final static Neptunium NEPTUNIUM = new Neptunium();
	
	/** Plutonium */
	public final static Plutonium PLUTONIUM = new Plutonium();
	
	/** Americium */
	public final static Americium AMERICIUM = new Americium();
	
	/** Curium */
	public final static Curium CURIUM = new Curium();
	
	/** Berkelium */
	public final static Berkelium BERKELIUM = new Berkelium();
	
	/** Californium */
	public final static Californium CALIFORNIUM = new Californium();
	
	/** Einsteinium */
	public final static Einsteinium EINSTEINIUM = new Einsteinium();
	
	/** Fermium */
	public final static Fermium FERMIUM = new Fermium();
	
	/** Mendelevium */
	public final static Mendelevium MENDELEVIUM = new Mendelevium();
	
	/** Nobelium */
	public final static Nobelium NOBELIUM = new Nobelium();
	
	/** Lawrencium */
	public final static Lawrencium LAWRENCIUM = new Lawrencium();
	
	/** Rutherfordium */
	public final static Rutherfordium RUTHERFORDIUM = new Rutherfordium();
	
	/** Dubnium */
	public final static Dubnium DUBNIUM = new Dubnium();
	
	/** Seaborgium */
	public final static Seaborgium SEABORGIUM = new Seaborgium();
	
	/** Bohrium */
	public final static Bohrium BOHRIUM = new Bohrium();
	
	/** Hassium */
	public final static Hassium HASSIUM = new Hassium();
	
	/** Meitnerium */
	public final static Meitnerium MEITNERIUM = new Meitnerium();
	
	/** Darmstadtium */
	public final static Darmstadrium DARMSTADRIUM = new Darmstadrium();
	
	/** Roentgenium */
	public final static Roentgenium ROENTGENIUM = new Roentgenium();
	
	/** Copernicium */
	public final static Copernicium COPERNICIUM = new Copernicium();
	
	/** Nihonium */
	public final static Nihonium NIHONIUM = new Nihonium();
	
	/** Flerovium */
	public final static Flerovium FLEROVIUM = new Flerovium();
	
	/** Moscovium */
	public final static Moscovium MOSCOVIUM = new Moscovium();
	
	/** Livermorium */
	public final static Livermorium LIVERMORIUM = new Livermorium();

	/** Tennessine */
	public final static Tennessine TENNESSINE = new Tennessine();

	/** Oganesson */
	public final static Oganesson OGANESSON = new Oganesson();

	public Elements_OLD() {
		allElements[HYDROGEN.NUMBER - 1] = HYDROGEN;
		allElements[HELIUM.NUMBER - 1] = HELIUM;
		allElements[LITHIUM.NUMBER - 1] = LITHIUM;
		allElements[BERYLLIUM.NUMBER - 1] = BERYLLIUM;
		allElements[BORON.NUMBER - 1] = BORON;
		allElements[CARBON.NUMBER - 1] = CARBON;
		allElements[NITROGEN.NUMBER - 1] = NITROGEN;
		allElements[OXYGEN.NUMBER - 1] = OXYGEN;
		allElements[FLUORINE.NUMBER - 1] = FLUORINE;
		allElements[NEON.NUMBER - 1] = NEON;
		allElements[SODIUM.NUMBER - 1] = SODIUM;
		allElements[MAGNESIUM.NUMBER - 1] = MAGNESIUM;
		allElements[ALUMINUM.NUMBER - 1] = ALUMINUM;
		allElements[SILICON.NUMBER - 1] = SILICON;
		allElements[PHOSPHORUS.NUMBER - 1] = PHOSPHORUS;
		allElements[SULFUR.NUMBER - 1] = SULFUR;
		allElements[CHLORINE.NUMBER - 1] = CHLORINE;
		allElements[ARGON.NUMBER - 1] = ARGON;
		allElements[POTASSIUM.NUMBER - 1] = POTASSIUM;
		allElements[CALCIUM.NUMBER - 1] = CALCIUM;
		allElements[SCANDIUM.NUMBER - 1] = SCANDIUM;
		allElements[TITANIUM.NUMBER - 1] = TITANIUM;
		allElements[VANADIUM.NUMBER - 1] = VANADIUM;
		allElements[CHROMIUM.NUMBER - 1] = CHROMIUM;
		allElements[MANGANESE.NUMBER - 1] = MANGANESE;
		allElements[IRON.NUMBER - 1] = IRON;
		allElements[COBALT.NUMBER - 1] = COBALT;
		allElements[NICKEL.NUMBER - 1] = NICKEL;
		allElements[COPPER.NUMBER - 1] = COPPER;
		allElements[ZINC.NUMBER - 1] = ZINC;
		allElements[GALLIUM.NUMBER - 1] = GALLIUM;
		allElements[GERMANIUM.NUMBER - 1] = GERMANIUM;
		allElements[ARSENIC.NUMBER - 1] = ARSENIC;
		allElements[SELENIUM.NUMBER - 1] = SELENIUM;
		allElements[BROMINE.NUMBER - 1] = BROMINE;
		allElements[KRYPTON.NUMBER - 1] = KRYPTON;
		allElements[RUBIDIUM.NUMBER - 1] = RUBIDIUM;
		allElements[STRONTIUM.NUMBER - 1] = STRONTIUM;
		allElements[YTTRIUM.NUMBER - 1] = YTTRIUM;
		allElements[ZIRCONIUM.NUMBER - 1] = ZIRCONIUM;
		allElements[NIOBIUM.NUMBER - 1] = NIOBIUM;
		allElements[MOLYBDENUM.NUMBER - 1] = MOLYBDENUM;
		allElements[TECHNETIUM.NUMBER - 1] = TECHNETIUM;
		allElements[RUTHENIUM.NUMBER - 1] = RUTHENIUM;
		allElements[RHODIUM.NUMBER - 1] = RHODIUM;
		allElements[PALLADIUM.NUMBER - 1] = PALLADIUM;
		allElements[SILVER.NUMBER - 1] = SILVER;
		allElements[CADMIUM.NUMBER - 1] = CADMIUM;
		allElements[INDIUM.NUMBER - 1] = INDIUM;
		allElements[TIN.NUMBER - 1] = TIN;
		allElements[ANTIMONY.NUMBER - 1] = ANTIMONY;
		allElements[TELLURIUM.NUMBER - 1] = TELLURIUM;
		allElements[IODINE.NUMBER - 1] = IODINE;
		allElements[XENON.NUMBER - 1] = XENON;
		allElements[CESIUM.NUMBER - 1] = CESIUM;
		allElements[BARIUM.NUMBER - 1] = BARIUM;
		allElements[LANTHANUM.NUMBER - 1] = LANTHANUM;
		allElements[CERIUM.NUMBER - 1] = CERIUM;
		allElements[PRASEODYMIUM.NUMBER - 1] = PRASEODYMIUM;
		allElements[NEODYMIUM.NUMBER - 1] = NEODYMIUM;
		allElements[PROMETHIUM.NUMBER - 1] = PROMETHIUM;
		allElements[SAMARIUM.NUMBER - 1] = SAMARIUM;
		allElements[EUROPIUM.NUMBER - 1] = EUROPIUM;
		allElements[GADOLINIUM.NUMBER - 1] = GADOLINIUM;
		allElements[TERBIUM.NUMBER - 1] = TERBIUM;
		allElements[DYSPROSIUM.NUMBER - 1] = DYSPROSIUM;
		allElements[HOLMIUM.NUMBER - 1] = HOLMIUM;
		allElements[ERBIUM.NUMBER - 1] = ERBIUM;
		allElements[THULIUM.NUMBER - 1] = THULIUM;
		allElements[YTTERBIUM.NUMBER - 1] = YTTERBIUM;
		allElements[LUTETIUM.NUMBER - 1] = LUTETIUM;
		allElements[HAFNIUM.NUMBER - 1] = HAFNIUM;
		allElements[TANTALUM.NUMBER - 1] = TANTALUM;
		allElements[TUNGSTEN.NUMBER - 1] = TUNGSTEN;
		allElements[RHENIUM.NUMBER - 1] = RHENIUM;
		allElements[OSMIUM.NUMBER - 1] = OSMIUM;
		allElements[IRIDIUM.NUMBER - 1] = IRIDIUM;
		allElements[PLATNIUM.NUMBER - 1] = PLATNIUM;
		allElements[GOLD.NUMBER - 1] = GOLD;
		allElements[MERCURY.NUMBER - 1] = MERCURY;
		allElements[THALLIUM.NUMBER - 1] = THALLIUM;
		allElements[LEAD.NUMBER - 1] = LEAD;
		allElements[BISMUTH.NUMBER - 1] = BISMUTH;
		allElements[POLONIUM.NUMBER - 1] = POLONIUM;
		allElements[ASTATINE.NUMBER - 1] = ASTATINE;
		allElements[RADON.NUMBER - 1] = RADON;
		allElements[FRANCIUM.NUMBER - 1] = FRANCIUM;
		allElements[RADIUM.NUMBER - 1] = RADIUM;
		allElements[ACTINIUM.NUMBER - 1] = ACTINIUM;
		allElements[THORIUM.NUMBER - 1] = THORIUM;
		allElements[PROTACTINIUM.NUMBER - 1] = PROTACTINIUM;
		allElements[URANIUM.NUMBER - 1] = URANIUM;
		allElements[NEPTUNIUM.NUMBER - 1] = NEPTUNIUM;
		allElements[PLUTONIUM.NUMBER - 1] = PLUTONIUM;
		allElements[AMERICIUM.NUMBER - 1] = AMERICIUM;
		allElements[CURIUM.NUMBER - 1] = CURIUM;
		allElements[BERKELIUM.NUMBER - 1] = BERKELIUM;
		allElements[CALIFORNIUM.NUMBER - 1] = CALIFORNIUM;
		allElements[EINSTEINIUM.NUMBER - 1] = EINSTEINIUM;
		allElements[FERMIUM.NUMBER - 1] = FERMIUM;
		allElements[MENDELEVIUM.NUMBER - 1] = MENDELEVIUM;
		allElements[NOBELIUM.NUMBER - 1] = NOBELIUM;
		allElements[LAWRENCIUM.NUMBER - 1] = LAWRENCIUM;
		allElements[RUTHERFORDIUM.NUMBER - 1] = RUTHENIUM;
		allElements[DUBNIUM.NUMBER - 1] = DUBNIUM;
		allElements[SEABORGIUM.NUMBER - 1] = SEABORGIUM;
		allElements[BOHRIUM.NUMBER - 1] = BOHRIUM;
		allElements[HASSIUM.NUMBER - 1] = HASSIUM;
		allElements[MEITNERIUM.NUMBER - 1] = MEITNERIUM;
		allElements[DARMSTADRIUM.NUMBER - 1] = DARMSTADRIUM;
		allElements[ROENTGENIUM.NUMBER - 1] = ROENTGENIUM;
		allElements[COPERNICIUM.NUMBER - 1] = COPERNICIUM;
		allElements[NIHONIUM.NUMBER - 1] = NIHONIUM;
		allElements[FLEROVIUM.NUMBER - 1] = FLEROVIUM;
		allElements[MOSCOVIUM.NUMBER - 1] = MOSCOVIUM;
		allElements[LIVERMORIUM.NUMBER - 1] = LIVERMORIUM;
		allElements[TENNESSINE.NUMBER - 1] = TENNESSINE;
		allElements[OGANESSON.NUMBER - 1] = OGANESSON;
	}//end Elements_OLD()
}//end class Atoms
