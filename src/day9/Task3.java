package day9;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println(" User Name:");
		String User = scan.next();
		String User1 = "shay";
		System.out.println(" Password:");
		String Password = scan.next();
		String password1 = "123321";
		
		boolean User3 = User.equals("shay");
		boolean Password3 = Password.equals("123321");
		
		
		//can write statement like that without boolean.
		//if(User.contentEquals("shay")&&Password.contentEquals("123321")) {System.out.println("login");}
		
		
		if(User3&&Password3) {System.out.println("login");}
		
		else {System.out.println("User name or Password is wrong");
		
		}	
		
		
		
		
		
		
	}

}
