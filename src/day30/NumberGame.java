package day30;

import java.util.Scanner;

public class NumberGame {

	public static void main(String[] args) {

		printTheDoubleNumber(5);
		int age=0;
		checkForAge(age);
		

	}
	
	public static void checkForAge(int age) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your age :");
		age = scan.nextInt();
		if(age>18) {
			System.out.println("Adult");
		}else { System.out.println(" Not a Adult");
		
		}
	}

	public static void printTheDoubleNumber(int num) {

		System.out.println("Print The Double Number :" + num * 2);

	}
}
