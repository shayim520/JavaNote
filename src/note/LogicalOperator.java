package note;

public class LogicalOperator {

	public static void main(String[] args) {
		// Logical and operator && , &
	      // As long as one operand is false WHOLE THING WILL BE FALSE 
	      // ONLY WHEN both operands are true then WHOLE THING WILL BE TRUE 
	    
	    // Logical or operator || , | 
	      // As long as one operand is TRUE WHOLE THING WILL BE TRUE 
	      // ONLY WHEN both operands are false then WHOLE THING WILL BE FALSE 
	    
	    // Logical NOT operator !
	    
	    // difference between single & | and double && || is 
	      // && will only evaluate first part if the whole result can be decided 
	        // just using the first boolean value 
	      // & will check for both side whether it can be already decided using 
	        // boolean value 
	      
	    
	    System.out.println("result of (true && true)  " +  (true && true)  );
	    System.out.println("result of (false && true) " +  (false && true)  );
	    System.out.println("result of (true && false) " +  (true && false)  );
	    System.out.println("result of (false && false) " +  (false && false)  );
	    
	    System.out.println("result of (true || true)  " +  (true || true)  );
	    System.out.println("result of (false || true) " +  (false || true)  );
	    System.out.println("result of (true || false) " +  (true || false)  );
	    System.out.println("result of (false || false) " +  (false || false)  );
	    
	    System.out.println("result of !true " + (!true) );
	    System.out.println("result of !false " + (!false) );
	    
	    
		/*int score =10;
		boolean result1 = score > 4;
		boolean result2 = score >4 && score <11;
		boolean result3 = score > 14*/

		
	
	
	
	
	}

}
