package day44;

import java.util.Arrays;

public class MathAction {

	public static void main(String[] args) {
		

	    MathEquation math1=new MathEquation(120, 10, '+');
	    MathEquation math2=new MathEquation(13, 12, '-');
	    MathEquation math3=new MathEquation(120, 10, '/');
	    MathEquation math4=new MathEquation(12, 10, '*');

	    //MathEquasion[] arr = new MathEquasion[] {math1,math2, math3, math4  }; 
	    MathEquation[] arr = {math1,math2, math3, math4  }; 
	    
	    for(MathEquation each : arr) {
	      each.calculate();
	      System.out.println( each.getResult() );
	      System.out.println(each);
	    }
	    
	    System.out.println(Arrays.toString( arr) );


	}

}
