package day30;

import java.util.Scanner;

import day29.Spartan;

public class Utility {

	public static void main(String[] args) {
		
		printusername();
		
		   // calling the method
//	    Utility.printUsersName() ; 
	    
	    // Arrays.sort(arrObject) ; 
	    
	    
	    // We can call methods coming from 
	    // different classes 
	    // if the class is under same package no import needed
	    // if the class is under different package import is mandatory
	    Spartan.releaseTheHorse();
	}
	public static void printusername() {
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter your name :");
	String name = scan.next();
	System.out.println("You Entered : " + name);
	
	}

}
