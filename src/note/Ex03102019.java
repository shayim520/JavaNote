package note;

import java.util.Scanner;

public class Ex03102019 {

	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println(" Enter your Score:");
		
		int understand = input.nextInt();
		
		
		if(understand >5) {System.out.println(" You are good.");
	}else {System.out.println( "You need to learn more.");
	}
	}
}
