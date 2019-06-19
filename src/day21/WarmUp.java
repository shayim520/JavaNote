package day21;

import java.util.Scanner;

public class WarmUp {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter two numbers:");

		int num1 = 0;
		int num2 = 0;
		int sum = 0;
		int count=0;

		do {

			System.out.println("Enter your number1:");
			num1 = s.nextInt();
			System.out.println("Enter your number2:");
			num2 = s.nextInt();
			
			 sum = num1 + num2;
			 count++;
			 if(count == 3) {
				 System.out.println("Try 30 minuts Leater");
				 break;
			 }

		} while (!(sum >= 100));
		System.out.println("Thank you!!!");

	}

}
