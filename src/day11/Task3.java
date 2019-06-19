package day11;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double value = scan.nextDouble();
		String price;
//		
//		if(value>100)
//			price = "expensive";
//		else price = "cheap";
//		
		
		price = (value>100)?"expensive":"cheap";
		
		System.out.println(price);
			

	}

}
