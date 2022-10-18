package it.prova.gestionecollection.test;

import java.util.HashMap;

public class TestJavaUntilHashMap {

	public static void main(String[] args) {
		HashMap<String, String> capitalCities = new HashMap<String, String>();
	    // Add keys and values (Country, City)
	    capitalCities.put("England", "London");
	    capitalCities.put("Germany", "Berlin");
	    capitalCities.put("Norway", "Oslo");
	    capitalCities.put("USA", "Washington DC");
		
		for (String i : capitalCities.keySet()) {
			  System.out.println("key: " + i + " value: " + capitalCities.get(i));
			}
		System.out.println();
		capitalCities.remove("Norway");
		
		for (String i : capitalCities.keySet()) {
			  System.out.println("key: " + i + " value: " + capitalCities.get(i));
			}
	}
}
