package day10;

import java.util.Scanner;

public class ConditionaIfonly {

	public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);

		    System.out.println("Welcome to Okta to Slack");

		    System.out.println("Enter the length of your username");

		    int lengthOfName = scan.nextInt();
		    
		    if(lengthOfName>22){
		      System.out.println("Slack can not take more than 22 char");
		      //lengthOfName = 21 ; 
		      System.out.println("user name has been adjusted");
		    }
		    
		    System.out.println("Successfully added user");
		    
		
		
		
		
		
		

	}

}
