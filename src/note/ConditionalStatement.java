package note;

import java.util.Scanner;

public class ConditionalStatement {

	public static void main(String[] args) {

		int score = 59;

		System.out.println("current score is " + score);

		/*
		 * if(put some boolean expression in here) { do some action is its true } else {
		 * do somthing else if its false
		 * 
		 * }
		 */
		if (score > 60) {
			System.out.println("You will pass! ");
		} else {
			System.out.println(" You shall not pass!");
		}

		Scanner input = new Scanner(System.in);

		System.out.println(" What is your Score? ");

		int score1 = input.nextInt();

		if (score1 > 60) {
			System.out.println(" You Shall pass!");
		} else {
			System.out.println(" You shall not pass!");
		}
	}
}
