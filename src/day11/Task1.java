package day11;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter your namber: ");
		int num;
		num = scan.nextInt();

		if (num % 5 == 0 && num % 3 == 0)
			System.out.println("fizz buzz");
		else if (num % 3 == 0)
			System.out.println("buzz");
		else if (num % 5 == 0)
			System.out.println("fizz ");
		else
			System.out.println("Not a fizz buzz number ");

	}

}
