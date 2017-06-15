package com.example.alex.util;

import com.example.alex.stochiometryapp.BuildConfig;

/**
 * A utility class that holds all the atoms.
 * @author Alex
 *
 */
public class Elements {

	public final static Atom[] allElements = new Atom[118];

	/** Hydrogen */
	public final static Atom hydrogen = new Atom("Hydrogen", "H", 1, 1.008, true);

	/** Helium */
	public final static Atom helium = new Atom("Helium", "He", 2, 4.003, false);
	
	/** Lithium */
	public final static Atom lithium = new Atom("Lithium", "Li", 3, 6.941, false);
	
	/** Beryllium */
	public final static Atom beryllium = new Atom("Beryllium", "Be", 4, 9.012, false);
	
	/** Boron */
	public final static Atom boron = new Atom("Boron", "B", 5, 10.81, false);
	
	/** Carbon */
	public final static Atom carbon = new Atom("Carbon", "C", 6, 12.01, false);
	
	/** Nitrogen */
	public final static Atom nitrogen = new Atom("Nitrognen", "N",  7, 14.01, true);
	
	/** Oxygen */
	public final static Atom oxygen = new Atom("Oxygen", "O", 8, 16.00, true);
	
	/** Flourine */
	public final static Atom flourine = new Atom("Flourine", "F", 9, 19.00, true);
	
	/** Neon */
	public final static Atom neon = new Atom("Neon", "N", 10, 20.18, false);
	
	/** Sodium */
	public final static Atom sodium = new Atom("Sodium", "Na", 11, 22.99, false);
	
	/** Magnesium */
	public final static Atom magnesium = new Atom("Magnesium", "Mg", 12, 24.31, false);
	
	/** Aluminum */
	public final static Atom aluminum = new Atom("Aluminum", "Al", 13, 26.98, false);
	
	/** Silicon */
	public final static Atom silicon = new Atom("Silicon", "Si", 14, 28.09, false);
	
	/** Phosphorus */
	public final static Atom phosphorus = new Atom("Phosphorus", "P", 15, 30.97, false);
	
	/** Sulfur */
	public final static Atom sulfur = new Atom("Sulfur", "S", 16, 32.06, false);
	
	/** Chlorine */
	public final static Atom chlorine = new Atom("Chlorine", "Cl", 17, 35.45, true);
	
	/** Argon */
	public final static Atom argon = new Atom("Argon", "Ar", 18, 39.95, false);
	
	/** Potassium */
	public final static Atom potassium = new Atom("Potassium", "K", 19, 39.10, false);
	
	/** Calcium */
	public final static Atom calcium = new Atom("Calcium", "Ca", 20, 40.08, false);
	
	/** Scandium */
	public final static Atom scandium = new Atom("Scandium", "Sc", 21, 44.96, false);
	
	/** Titanium */
	public final static Atom titanium = new Atom("Titanium", "Ti", 22, 47.98, false);
	
	/** Vanadium */
	public final static Atom vanadium = new Atom("Vanadium", "V", 23, 50.94, false);
	
	/** Chromium */
	public final static Atom chromium = new Atom("Chromium", "Cr", 24, 52.00, false);
	
	/** Manganese */
	public final static Atom manganese = new Atom("Manganese", "Mn", 25, 54.94, false);
	
	/** Iron */
	public final static Atom iron = new Atom("Iron", "Fe", 26, 55.85, false);
	
	/** Cobalt */
	public final static Atom cobalt = new Atom("Cobalt", "Co", 27, 58.93, false);
	
	/** Nickel */
	public final static Atom nickel = new Atom("Nickel", "Ni", 28, 58.96, false);
	
	/** Copper */
	public final static Atom copper = new Atom("Copper", "Cu", 29, 63.55, false);
	
	/** Zinc */
	public final static Atom zinc = new Atom("Zinc", "Zn", 30, 65.38, false);
	
	/** Gallium */
	public final static Atom gallium = new Atom("Gallium", "Ga", 31, 69.72, false);
	
	/** Germanium */
	public final static Atom germanium = new Atom("Germanium", "Ge", 32, 72.59, false);
	
	/** Arsenic */
	public final static Atom arsenic = new Atom("Arsenic", "As", 33, 74.29, false);
	
	/** Selenium */
	public final static Atom selenium = new Atom("Selenium", "Se", 34, 78.96, false);
	
	/** Bromine */
	public final static Atom bromine = new Atom("Bromine", "Br", 35, 79.90, true);
	
	/** Krypton */
	public final static Atom krypton = new Atom("Krypton", "Kr", 36, 83.80, false);
	
	/** Rubidium */
	public final static Atom rubidium = new Atom("Rubidium", "Rb", 37, 85.47, false);
	
	/** Strontium */
	public final static Atom strontium = new Atom("Strontium", "Sr", 38, 87.62, false);
	
	/** Yttrium */
	public final static Atom yttrium = new Atom("Yttrium", "Y", 39, 88.91, false);
	
	/** Zirconium */
	public final static Atom zirconium = new Atom("Zirconium", "Zr", 40, 91.22, false);
	
	/** Niobium */
	public final static Atom niobium = new Atom("Niobium", "Nb", 41, 92.91, false);
	
	/** Molybdenum */
	public final static Atom molybdenum = new Atom("Molybdenum", "Mo", 42, 95.94, false);
	
	/** Technetium */
	public final static Atom technetium = new Atom("Technetium", "Tc", 43, 98, false);
	
	/** Ruthenium */
	public final static Atom ruthenium = new Atom("Ruthenium", "Ru", 44, 101.07, false);
	
	/** Rhodium */
	public final static Atom rhodium = new Atom("Rhodium", "Rh", 45, 102.91, false);
	
	/** Palladium */
	public final static Atom palladium = new Atom("Palladium", "Pd", 46, 106.42, false);
	
	/** Silver */
	public final static Atom silver = new Atom("Silver", "Ag", 47, 107.87, false);
	
	/** Cadmium */
	public final static Atom cadmium = new Atom("Cadmium", "Cd", 48, 112.41, false);
	
	/** Indium */
	public final static Atom indium = new Atom("Indium", "In", 49, 114.82, false);
	
	/** Tin */
	public final static Atom tin = new Atom("Tin", "Sn", 50, 118.71, false);
	
	/** Antimony */
	public final static Atom antimony = new Atom("Antimony", "Sb", 51, 121.75, false);
	
	/** Tellurium */
	public final static Atom tellurium = new Atom("Tellurium", "Te", 52, 127.60, false);
	
	/** Iodine */
	public final static Atom iodine = new Atom("Iodine", "I", 53, 126.91, true);
	
	/** Xenon */
	public final static Atom xenon = new Atom("Xenon", "Xe", 54, 131.29, false);
	
	/** Cesium */
	public final static Atom cesium = new Atom("Cesium", "Cs", 55, 132.91, false);
	
	/** Barium */
	public final static Atom barium = new Atom("Barium", "Ba", 56, 137.33, false);
	
	/** Lanthanum */
	public final static Atom lanthanum = new Atom("Lanthanum", "La", 57, 138.91, false);
	
	/** Cerium */
	public final static Atom cerium = new Atom("Cerium", "Ce", 58, 140.12, false);
	
	/** Praesodymium */
	public final static Atom praesodymium = new Atom("Praseodymium", "Pr", 59, 140.91, false);
	
	/** Neodymium */
	public final static Atom neodymium = new Atom("Neodymium", "Nd", 60, 144.24, false);
	
	/** Promethium */
	public final static Atom promethium = new Atom("Promethium", "Pm", 61, 145, false);
	
	/** Samarium */
	public final static Atom samarium = new Atom("Samarium", "Sm", 62, 150.36, false);
	
	/** Europium */
	public final static Atom europium = new Atom("Europium", "Eu", 63, 151.96, false);
	
	/** Gadolinium */
	public final static Atom gadolinium = new Atom("Gadolinium", "Gd", 64, 157.25, false);
	
	/** Terbium */
	public final static Atom terbium = new Atom("Terbium", "Tb", 65, 158.93, false);
	
	/** Dysprosium */
	public final static Atom dysprosium = new Atom("Dysprosium", "Dy", 66, 162.50, false);
	
	/** Holmium */
	public final static Atom holmium = new Atom("Holmium", "Ho", 67, 164.93, false);
	
	/** Erbium */
	public final static Atom erbium = new Atom("Erbium", "Er", 68, 167.26, false);
	
	/** Thulium */
	public final static Atom thulium = new Atom("Thulium", "Tm", 69, 168.93, false);
	
	/** Ytterbium */
	public final static Atom ytterbium = new Atom("Ytterbium", "Yb", 70, 173.04, false);
	
	/** Lutetium */
	public final static Atom lutetium = new Atom("Lutetium", "Lu", 71, 174.97, false);
	
	/** Hafnium */
	public final static Atom hafnium = new Atom("Hafnium", "Hf", 72, 178.49, false);
	
	/** Tantalum */
	public final static Atom tantalum = new Atom("Tantalum", "Ta", 73, 180.95, false);
	
	/** Tungsten */
	public final static Atom tungsten = new Atom("Tungsten", "W", 74, 183.85, false);
	
	/** Rhenium */
	public final static Atom rhenium = new Atom("Rhenium", "Re", 75, 186.21, false);
	
	/** Osmium */
	public final static Atom osmium = new Atom("Osmium", "Os", 76, 190.23, false);
	
	/** Iridium */
	public final static Atom iridium = new Atom("Iridium", "Ir", 77, 192.22, false);
	
	/** Platinum */
	public final static Atom platinum = new Atom("Platinum", "Pt", 78, 195.08, false);
	
	/** Gold */
	public final static Atom gold = new Atom("Gold", "Au", 79, 196.97, false);
	
	/** Mercury */
	public final static Atom mercury = new Atom("Mercury", "Hg", 80, 200.59, false);
	
	/** Thallium */
	public final static Atom thallium = new Atom("Thallium", "Tl", 81, 204.38, false);
	
	/** Lead */
	public final static Atom lead = new Atom("Lead", "Pb", 82, 207.2, false);
	
	/** Bismuth */
	public final static Atom bismuth = new Atom("Bismuth", "Bi", 83, 208.98, false);
	
	/** Polonium */
	public final static Atom polonium = new Atom("Polonium", "Po", 84, 209, false);
	
	/** Astatine */
	public final static Atom astatine = new Atom("Astatine", "At", 85, 210, false);
	
	/** Radon */
	public final static Atom radon = new Atom("Radon", "Rn", 86, 222, false);
	
	/** Francium */
	public final static Atom francium = new Atom("Francium", "Fr", 87, 223, false);
	
	/** Radium */
	public final static Atom radium = new Atom("Radium", "Ra", 88, 226.03, false);
	
	/** Actinium */
	public final static Atom actinium = new Atom("Actinium", "Ac", 89, 227, false);
	
	/** Thorium */
	public final static Atom thorium = new Atom("Thorium", "Th", 90, 232.04, false);
	
	/** Protactinium */
	public final static Atom protactinium = new Atom("Protactinium", "Pa", 91, 231.04, false);
	
	/** Uranium */
	public final static Atom uranium = new Atom("Uranium", "U", 92, 238.03, false);
	
	/** Neptunium */
	public final static Atom neptunium = new Atom("Neptunium", "Np", 93, 237.05, false);
	
	/** Plutonium */
	public final static Atom plutonium = new Atom("Plutonium", "Pu", 94, 244.06, false);
	
	/** Americium */
	public final static Atom americium = new Atom("Americium", "Am", 95, 243.06, false);
	
	/** Curium */
	public final static Atom curium = new Atom("Curium", "Cm", 96, 247.07, false);
	
	/** Berkelium */
	public final static Atom berkelium = new Atom("Berkelium", "Bk", 97, 247.07, false);
	
	/** Californium */
	public final static Atom californium = new Atom("Californium", "Cf", 98, 251.08, false);
	
	/** Einsteinium */
	public final static Atom einsteinium = new Atom("Einsteinium", "Es", 99, 252.08, false);
	
	/** Fermium */
	public final static Atom fermium = new Atom("Fermium", "Fm", 100, 257.09, false);
	
	/** Mendelevium */
	public final static Atom mendelevium = new Atom("Mendelevium", "Md", 101, 258.10, false);
	
	/** Nobelium */
	public final static Atom nobelium = new Atom("Nobelium", "No", 102, 259.10, false);
	
	/** Lawrencium */
	public final static Atom lawrencium = new Atom("Lawrencium", "Lr", 103, 262.11, false);
	
	/** Rutherfordium */
	public final static Atom rutherfordium = new Atom("Rutherfordium", "Rf", 104, 261.11, false);
	
	/** Dubnium */
	public final static Atom dubnium = new Atom("Dubnium", "Db", 105, 262.11, false);
	
	/** Seaborgium */
	public final static Atom seaborgium = new Atom("Seaborgium", "Sg", 106, 266.11, false);
	
	/** Bohrium */
	public final static Atom bohrium = new Atom("Bohrium", "Bh", 107, 264.12, false);
	
	/** Hassium */
	public final static Atom hassium = new Atom("Hassium", "Hs", 108, 269.13, false);
	
	/** Meitnerium */
	public final static Atom meitnerium = new Atom("Meitnerium", "Mt", 109, 268.14, false);
	
	/** Darmstadtium */
	public final static Atom darmstadtium = new Atom("Darmstadrium", "Ds", 110, 271.15, false);
	
	/** Roentgenium */
	public final static Atom roentgenium = new Atom("Roentgenium", "Rg", 111, 272.15, false);
	
	/** Copernicium */
	public final static Atom copernicium = new Atom("Copernicium", "Cn", 112, 277, false);
	
	/** Nihonium */
	public final static Atom nihonium = new Atom("Nihonium", "Nh", 113, 284, false);
	
	/** Flerovium */
	public final static Atom flerovium = new Atom("Flerovium", "Fl", 114, 289, false);
	
	/** Moscovium */
	public final static Atom moscovium = new Atom("Moscovium", "Mc", 115, 288, false);
	
	/** Livermorium */
	public final static Atom livermorium = new Atom("Livermorium", "Lv", 116, 289, false);

	/** Tennessine */
	public final static Atom tennessine = new Atom("Tennessine", "Ts", 117, 294, false);

	/** Oganesson */
	public final static Atom oganesson = new Atom("Oganesson", "Og", 118, 294, false);

	public Elements() {
		allElements[hydrogen.NUMBER - 1] = hydrogen;
		allElements[helium.NUMBER - 1] = helium;
		allElements[lithium.NUMBER - 1] = lithium;
		allElements[beryllium.NUMBER - 1] = beryllium;
		allElements[boron.NUMBER - 1] = boron;
		allElements[carbon.NUMBER - 1] = carbon;
		allElements[nitrogen.NUMBER - 1] = nitrogen;
		allElements[oxygen.NUMBER - 1] = oxygen;
		allElements[flourine.NUMBER - 1] = flourine;
		allElements[neon.NUMBER - 1] = neon;
		allElements[sodium.NUMBER - 1] = sodium;
		allElements[magnesium.NUMBER - 1] = magnesium;
		allElements[aluminum.NUMBER - 1] = aluminum;
		allElements[silicon.NUMBER - 1] = silicon;
		allElements[phosphorus.NUMBER - 1] = phosphorus;
		allElements[sulfur.NUMBER - 1] = sulfur;
		allElements[chlorine.NUMBER - 1] = chlorine;
		allElements[argon.NUMBER - 1] = argon;
		allElements[potassium.NUMBER - 1] = potassium;
		allElements[calcium.NUMBER - 1] = calcium;
		allElements[scandium.NUMBER - 1] = scandium;
		allElements[titanium.NUMBER - 1] = titanium;
		allElements[vanadium.NUMBER - 1] = vanadium;
		allElements[chromium.NUMBER - 1] = chromium;
		allElements[manganese.NUMBER - 1] = manganese;
		allElements[iron.NUMBER - 1] = iron;
		allElements[cobalt.NUMBER - 1] = cobalt;
		allElements[nickel.NUMBER - 1] = nickel;
		allElements[copper.NUMBER - 1] = copper;
		allElements[zinc.NUMBER - 1] = zinc;
		allElements[gallium.NUMBER - 1] = gallium;
		allElements[germanium.NUMBER - 1] = germanium;
		allElements[arsenic.NUMBER - 1] = arsenic;
		allElements[selenium.NUMBER - 1] = selenium;
		allElements[bromine.NUMBER - 1] = bromine;
		allElements[krypton.NUMBER - 1] = krypton;
		allElements[rubidium.NUMBER - 1] = rubidium;
		allElements[strontium.NUMBER - 1] = strontium;
		allElements[yttrium.NUMBER - 1] = yttrium;
		allElements[zirconium.NUMBER - 1] = zirconium;
		allElements[niobium.NUMBER - 1] = niobium;
		allElements[molybdenum.NUMBER - 1] = molybdenum;
		allElements[technetium.NUMBER - 1] = technetium;
		allElements[ruthenium.NUMBER - 1] = ruthenium;
		allElements[rhodium.NUMBER - 1] = rhodium;
		allElements[palladium.NUMBER - 1] = palladium;
		allElements[silver.NUMBER - 1] = silver;
		allElements[cadmium.NUMBER - 1] = cadmium;
		allElements[indium.NUMBER - 1] = indium;
		allElements[tin.NUMBER - 1] = tin;
		allElements[antimony.NUMBER - 1] = antimony;
		allElements[tellurium.NUMBER - 1] = tellurium;
		allElements[iodine.NUMBER - 1] = iodine;
		allElements[xenon.NUMBER - 1] = xenon;
		allElements[cesium.NUMBER - 1] = cesium;
		allElements[barium.NUMBER - 1] = barium;
		allElements[lanthanum.NUMBER - 1] = lanthanum;
		allElements[praesodymium.NUMBER - 1] = praesodymium;
		allElements[neodymium.NUMBER - 1] = neodymium;
		allElements[promethium.NUMBER - 1] = promethium;
		allElements[samarium.NUMBER - 1] = samarium;
		allElements[europium.NUMBER - 1] = europium;
		allElements[gadolinium.NUMBER - 1] = gadolinium;
		allElements[terbium.NUMBER - 1] = terbium;
		allElements[dysprosium.NUMBER - 1] = dysprosium;
		allElements[holmium.NUMBER - 1] = holmium;
		allElements[erbium.NUMBER - 1] = erbium;
		allElements[thulium.NUMBER - 1] = thulium;
		allElements[ytterbium.NUMBER - 1] = ytterbium;
		allElements[lutetium.NUMBER - 1] = lutetium;
		allElements[hafnium.NUMBER - 1] = hafnium;
		allElements[tantalum.NUMBER - 1] = tantalum;
		allElements[tungsten.NUMBER - 1] = tungsten;
		allElements[rhenium.NUMBER - 1] = rhenium;
		allElements[osmium.NUMBER - 1] = osmium;
		allElements[iridium.NUMBER - 1] = iridium;
		allElements[platinum.NUMBER - 1] = platinum;
		allElements[gold.NUMBER - 1] = gold;
		allElements[mercury.NUMBER - 1] = mercury;
		allElements[thallium.NUMBER - 1] = thallium;
		allElements[lead.NUMBER - 1] = lead;
		allElements[bismuth.NUMBER - 1] = bismuth;
		allElements[polonium.NUMBER - 1] = polonium;
		allElements[astatine.NUMBER - 1] = astatine;
		allElements[radon.NUMBER - 1] = radon;
		allElements[francium.NUMBER - 1] = francium;
		allElements[radium.NUMBER - 1] = radium;
		allElements[actinium.NUMBER - 1] = actinium;
		allElements[thorium.NUMBER - 1] = thorium;
		allElements[protactinium.NUMBER - 1] = protactinium;
		allElements[uranium.NUMBER - 1] = uranium;
		allElements[neptunium.NUMBER - 1] = neptunium;
		allElements[plutonium.NUMBER - 1] = plutonium;
		allElements[americium.NUMBER - 1] = americium;
		allElements[curium.NUMBER - 1] = curium;
		allElements[berkelium.NUMBER - 1] = berkelium;
		allElements[californium.NUMBER - 1] = californium;
		allElements[einsteinium.NUMBER - 1] = einsteinium;
		allElements[fermium.NUMBER - 1] = fermium;
		allElements[mendelevium.NUMBER - 1] = mendelevium;
		allElements[nobelium.NUMBER - 1] = nobelium;
		allElements[lawrencium.NUMBER - 1] = lawrencium;
		allElements[rutherfordium.NUMBER - 1] = rutherfordium;
		allElements[dubnium.NUMBER - 1] = dubnium;
		allElements[seaborgium.NUMBER - 1] = seaborgium;
		allElements[bohrium.NUMBER - 1] = bohrium;
		allElements[hassium.NUMBER - 1] = hassium;
		allElements[meitnerium.NUMBER - 1] = meitnerium;
		allElements[darmstadtium.NUMBER - 1] = darmstadtium;
		allElements[roentgenium.NUMBER - 1] = roentgenium;
		allElements[copernicium.NUMBER - 1] = copernicium;
		allElements[nihonium.NUMBER - 1] = nihonium;
		allElements[flerovium.NUMBER - 1] = flerovium;
		allElements[moscovium.NUMBER - 1] = moscovium;
		allElements[livermorium.NUMBER - 1] = livermorium;
		allElements[tennessine.NUMBER - 1] = tennessine;
		allElements[oganesson.NUMBER - 1] = oganesson;
	}//end Elements()
}//end class Atoms
