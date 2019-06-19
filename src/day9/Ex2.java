package day9;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println(" Enter your score:");
		int score = input.nextInt();

		if (score >= 90 && score <= 100) {
			System.out.println(" You got \"A\"");
		} else if (score >= 80 && score < 90) {
			System.out.println(" You got \"B\"");
		} else if (score >= 70 && score < 80) {
			System.out.println(" You got \"C\"");
		} else {
			System.out.println(" You need to hard work!");
		}

	}
}
