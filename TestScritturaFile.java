package it.prova.gestionecollection.test;

import java.io.*;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class TestScritturaFile {

	public static void main(String[] args) {
		try {
			FileWriter myWriter = new FileWriter("filename.txt");
			myWriter.write("Ciao mondo");
			myWriter.close();
			System.out.println("Abbiamo Scritto nel file");
		} catch (IOException e) {
			System.out.println("ERRORE");
			e.printStackTrace();
		}
		
		 try {
		      File myObj = new File("filename.txt");
		      Scanner myReader = new Scanner(myObj);
		      while (myReader.hasNextLine()) {
		        String data = myReader.nextLine();
		        System.out.println(data);
		      }
		      myReader.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("ERRORE");
		      e.printStackTrace();
		    }
	}
}


