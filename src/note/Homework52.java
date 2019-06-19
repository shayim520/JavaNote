package note;

import java.util.Scanner;

public class Homework52 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		   
		  int people =0;
		  double amount, total,totalperperson,tip = 0;
		  String service,split,people1;
		  
		  System.out.println("Split:");
		   split = input.next();
		  if(split.equalsIgnoreCase("yes")){
		    System.out.print("Number of people:");
		      people = input.nextInt();
		    
		  }
		  
		  System.out.println("Check amount:");
		  amount = input.nextDouble();
		  System.out.println("Service Quality:");
		  service = input.next();
		  if(service.equalsIgnoreCase("poor")){
		    tip = amount*0.05;}
		  else if(service.equalsIgnoreCase("fair")){
		    tip = amount*0.1;}
		  else if(service.equalsIgnoreCase("good")){
		    tip = amount*0.15;}
		   else if(service.equalsIgnoreCase("great")){
		    tip = amount*0.2;}
		  else if(service.equalsIgnoreCase("excellent")){
		    tip = amount*0.25;
		    }
		            
		            
		            if(people==4){
		              people1 = "&&&&";
		            }else{
		              people1 = "&&&&&";
		            }
		              
		              
		            System.out.println("Number of people entered: " + people1);
		            System.out.println("Total to pay: " + (amount + tip) );
		            System.out.println("Total tip: " + tip);
		            System.out.println("Total per person: " + (amount + tip)/people);
		            System.out.println("Tip per person: " + tip/people);
		}

	}


