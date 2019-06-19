package day12;

import java.util.Scanner;

public class ConditionalReview {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Siri! How is the weather today?");

		String weather = scan.next();
		String action;

//		if (weather.equals("sunny")) {
//			action = "go out";
//		} else {
//			action = "stay home";
//		}

		
		action = (weather.equalsIgnoreCase("sunny"))?"go out":"stay home";
		
		System.out.println(" According to weather you should " + action);

	}

}
