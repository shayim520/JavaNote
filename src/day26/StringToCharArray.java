package day26;

import java.util.Arrays;

public class StringToCharArray{

	public static void main(String[] args) {
		
		String str = "Spartan" ; 
//	    
//	    int size = str.length() ; 
//	    
//	    char[] myChars = new char[ size ]; 
//	    
//	    for(int i=0 ; i< myChars.length ; i++) {
//	      
	      //myChars[0] = 'A' ; 
//	      myChars[i] = str.charAt(i) ; 
	      char[] myChars = str.toCharArray();
	      
	    
	    
	    System.out.println(Arrays.toString(myChars)   );
		

	}

}
