package day50;

public class MethodChaining {

	public static void main(String[] args) {
		
		methodA();
		
		

	}
	
	public static void methodA() {
		methodB();
//	    methodC();
		System.out.println("A called");
	}
	
	public static void methodB() {
		methodC();
		System.out.println("B called");
	}
	
	public static void methodC() {
		System.out.println("C called");
	}

}
