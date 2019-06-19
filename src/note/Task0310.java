package note;

import java.util.Scanner;

public class Task0310 {

	public static void main(String[] args) {
		
		 Scanner price = new Scanner(System.in);
		 
		 double iphone, ipad;
		 iphone = 599.99; ipad = 899.99;
		 
		 int quantiphone, quantipad;
		  
		 System.out.println(" How many iphone do you want?");
		  quantiphone = price.nextInt();
		  
		  System.out.println(" How many ipad do you need?");
		  quantipad = price.nextInt();
		  
		  System.out.println(" How mach do you want to speend dotay?");
		  double budget = price.nextInt();
		 
		  double toatal = iphone*quantiphone + ipad*quantipad;
		 
		 
		 if(toatal>budget) {
			 System.out.println(" Out of budget.");
			 System.out.println(" Could you span extra only " + (toatal - budget) + "$");
		 } else {
			 System.out.println(" We have 10% cashback for everypurchse.");
			 
			 
		 }
	
	}

}
