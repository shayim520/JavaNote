package day33;

import java.util.Arrays;

public class ReturningMultipleValue {

	public static void main(String[] args) {
		
		 
	    int[] myArray = giveMeAnArray();
	    System.out.println( Arrays.toString(myArray)  )  ;
	    
	    // CALLLING in one shot 
	    System.out.println( Arrays.toString( giveMeAnArray() )  )  ;
	    
	    
	    
	  }
	  
	  // this method have no paramter 
	  // and return int array object as returned value 
	  public static int[] giveMeAnArray() {    
	    
	    int[] arr = new int[] {1,2,3} ;  
	    //return Arrays.toString(arr) ; 
	    return arr ; 
	    
	  }

	}


