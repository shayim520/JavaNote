package day30;

public class MethodWithParameters {

	public static void main(String[] args) {
//		prinTHesum(2.3, 5);
		reportName("shay","abu");
		

	}
	
	public static void reportName(String firstName,String lastName) {
		
		System.out.println("firstName " +firstName + " length is: " 
			      + firstName.length() );
			  
			  System.out.println("lastName " +lastName + " length is: " 
			      + lastName.length() );
			  
			  System.out.println("Your intial is " + firstName.charAt(0) +
			      " "+ lastName.charAt(0));
		
	}
	
	
	
	public static void prinTHesum(double a, int b) {
		 double sum = a + b;
		System.out.println("Sum is :" + sum);
		
	}

}
