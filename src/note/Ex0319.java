package note;

import java.util.Scanner;

public class Ex0319 {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter your score:");
		int n = s.nextInt();
		
		switch(n){
		
		case 7:
			System.out.println("pass");
		break;
		default:
		
		System.out.println("fail");
		break;
		
		}
				
				
	}

}
