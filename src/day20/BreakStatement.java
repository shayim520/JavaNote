package day20;

public class BreakStatement {

	public static void main(String[] args) {
		
		// break statement is used to break out of switch statement
	    // and loops 
	    
	    int x = 10 ; 
	    do {
	      
	      System.out.println( x );
	      x++ ;   // x = x+ 1 ;  
	      if(x>50) {
	        break; 
	      }
	      
	    } while (x<100);
	    
	    


	}

}
