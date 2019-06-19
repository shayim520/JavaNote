package day13;

import java.util.Scanner;

public class Task1 {

	private static int campare1;

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println(" Enter two names: ");

		String name1 = scan.next();
		String name2 = scan.next();

		boolean b1 = name1.equals(name1);
		boolean b2 = name1.equals(name2);
		boolean b3 = name1.equalsIgnoreCase(name2);
		System.out.println(b3);
		int compare1 = name1.length();
		int compare2 = name2.length();
		char c1 = name1.charAt(2);
		char c2 = name1.charAt(1);

		if (compare1 > compare2) {

			System.out.println(c2);
		}

		else {
			System.out.println(name2.charAt(2));

			System.out.println((compare1 > compare2) ? c1 : name2.charAt(2));

		}

	}

}
