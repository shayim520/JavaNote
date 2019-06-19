package day15;

import java.util.Scanner;

public class AmazonSearchTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter items to search for");
		String itemtoSearchfor = sc.nextLine();
		System.out.println("You have entered: " + itemtoSearchfor );
		
		String expectedResult = "Amazon.com : ipad";
		String actualResult = "Amazon.com : " + itemtoSearchfor;
		
		if(expectedResult.equalsIgnoreCase(actualResult)) {
			System.out.println("Test pass for ipad");
		}else {System.out.println("Test fail for ipad");
	}
	}
}
