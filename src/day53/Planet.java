package day53;



public class Planet {

	public void rotate() {
		System.out.println("rotating");
	}

	public void rotate(int d) {
		System.out.println("rotating d");
	}
	// we can not have two method with same method singature in same class
//	public int rotate(int d) {
//		return 5;
//	}

	public static int rotate(int d, int y) {
		System.out.println("rotating d with return");
		return 5;
	}
	
	public static void main(String[] args) {
	Planet r = new Planet();
		r.rotate();
		
		rotate(5,5);
		
		
	}

}
