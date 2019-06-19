package day19;

import java.util.Scanner;

public class WarnUp {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		String str = "";
		while(!str.contains("java")) {
			System.out.println("Enter your Sentence:");
			str = s.nextLine();
		}
		System.out.println("Thank you!");

	}

}
