package day9;

import java.util.Scanner;

public class Simplewithoutcurlybracis {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your name:");
		String name = input.next();
		String name1 = "shay";
		boolean b = name.equals("shay");
		
		if(b) System.out.println("it`s him");
		else System.out.println("Not him");
	
		
		
	}

}
