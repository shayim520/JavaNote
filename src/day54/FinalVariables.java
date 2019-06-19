package day54;

public class FinalVariables {
	
	public static void main(String[] args) {
	
	
	// can not reassign a value for final variable
		
	// a primitive type dtore value directly so final variable
	// x can not have value here
	final int x = 10;
	      // x = 12;
	
	// a reference variable store address of the object
	//once int's pointed to the object, it can not point to 
	//different object
	final Building b1 = new Building(100);
	b1.num = 200;
	
	
	
	System.out.println(b1.num);

	}
}
	
class Building{
	int num;
	public Building(int num) {
		this.num = num;
	}
}
	
