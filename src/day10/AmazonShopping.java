package day10;

import java.util.Scanner;

public class AmazonShopping {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Welcome Amazon Shopper");

		System.out.println("Enter price_");
		double price = scan.nextDouble();

		System.out.println("Are you a prime member");
		boolean prime = scan.nextBoolean();

		if (prime) {
			System.out.println("You got free shipping" + price);
		}

		else if (price > 35) {
			System.out.println(" You still got free shipping" + price);
		} else {
			price +=5;
			System.out.println("You gotta pay 5$ shipping fee 5$ " + price);

		}

	}

}
