package day18;

import java.util.Scanner;

public class sayILoveJava {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String theAnswer = "";
		while(!theAnswer.equalsIgnoreCase("yes")) {
			System.out.println("do you love java?");
			theAnswer = scan.next();
		}
		System.out.println("Finally correct!");
		

	}

}
