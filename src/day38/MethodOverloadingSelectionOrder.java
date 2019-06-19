package day38;

public class MethodOverloadingSelectionOrder {

	public static void main(String[] args) {
		
		 doSomething(10);
		 doSomething(10,56);
		 doSomething(3,6,7,8,9,89);
		 doSomething(10L);
		 doSomething( Integer.valueOf(100) );
		 doSomething( Integer.parseInt("100") );
		    
	  }

	  public static void doSomething(int x) {
	    System.out.println( "doSomething(int x)" );
	  }

	  public static void doSomething(long x) {
	    System.out.println( "doSomething(long x)" );
	  }

	  public static void doSomething(Integer x) {
	    System.out.println( "doSomething(Integer x)" );
	  }

	  public static void doSomething(int... x) {
	    System.out.println( "doSomething(int... x)" );

	}

}
