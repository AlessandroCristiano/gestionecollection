package it.prova.gestionecollection.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class TestJavaUntilSet {

	public static void main(String[] args) {
		HashSet<String> cars = new HashSet<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("BMW");
		cars.add("Mazda");
		System.out.println("Stampa prima: " + cars);
		
	
		HashSet<String> cars2 = new HashSet<String>();
		cars2.add("Volvo");
		cars2.add("BMW");
		cars2.add("Audi");
		cars2.add("BMW");
		cars2.add("Mercedes");
		System.out.println("Stampa dopo: " + cars2);
		
		for(String elementi: cars) {
			System.out.println(cars2.contains(elementi) ? "yes" : "No");
		}
	}
}
