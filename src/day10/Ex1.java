package day10;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {

		System.out.println("Welcome to Cybertek Banking App");

		Scanner scan = new Scanner(System.in);
		System.out.println("Account Number_");

		long account = scan.nextLong();
		long account1 = 1234567890;

		System.out.println("Password_");

		String password = scan.next();
		String password1 = "java";

		// in order to check primitive type equality
		// you should always use ==
		// for String you should always use .equals method

		// if you have single line of statement under your if or else
		// curly braces are optional

		boolean password2 = password.equals("java");

		if (account == account1 && password2) {
			System.out.println("Welcome to Cybertek Bank!");
		} else {
			System.out.println("Invalid Account");
		}

	}

}
