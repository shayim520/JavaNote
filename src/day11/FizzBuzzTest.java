package day11;

import java.util.Scanner;

public class FizzBuzzTest {

	public static void main(String[] args) {
		System.out.println("Enter your number:");
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		String result;
		
		result = (num%5==0 && num%3==0)?"FizzBuzzz":"not FizzBuzz";	
//		this is what you do if you dont wanna do anything in else condition
//		result = (num%5==0 && num%3==0)?"FizzBuzzz":result;
		System.out.println("reult is " + result);

	}

}
