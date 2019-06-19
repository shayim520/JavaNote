package day40;

public class Phone {
	
	// these instance variales 
	  // can be accessed 
	  // inside instand methods directly 
	  // just like it's a local variable 
	  // for that method 
	  
	  // if you are outside class
	  // you need an object to access 
	  /// these attributes 

	
	String type;
	String os;
	int capacity;
	public void ring() {
		System.out.println("ringing");
	}
	public void dial(long dialing) {
		System.out.println("dialing " + dialing);
		
	}
	public void displayBrand() {
		System.out.println("brand: " + type);
	}

}
