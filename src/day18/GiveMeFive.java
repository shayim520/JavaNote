package day18;

import java.util.Scanner;

public class GiveMeFive {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
//		int x = 0;
//		while (x != 5) {
//
//			System.out.println("Give me 5");
//			x = scan.nextInt();
//		}
//		System.out.println("Good Job");
		
		
		int bill= 0;
		
		while( !(bill ==5 || bill ==10) ) {
			
			System.out.println("Enter somebill");
			bill = scan.nextInt();
		}
		System.out.println("Right bill");

	}

}
