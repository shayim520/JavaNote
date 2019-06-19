package day12;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		System.out.println("Enter your number:");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		String event;
		
		switch(num) {
		
		case 1:
			event = "study";
			break;
			
		case 2:
			event = "workout";
			break;
			
		case 3:
			event = "have walk";
			break;
		case 4:
			event = "watch Tv";
			break;
		default:
			event = "error";
			break;
			
		}
		
			
		System.out.println("You should try to " + event);
			
			
			
		}
		
		
		
	}


