package day18;

import java.util.Scanner;

public class WhileLoopMultipleCondition {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Enter your number: ");
	
	int num = scan.nextInt();
	int num1 = 1;
	while(num1 <= num) {
		System.out.println("value is " + num1 + " ");
		num1++;
		
	}

	}

}
