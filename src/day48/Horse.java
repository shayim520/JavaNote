package day48;

public class Horse extends Animal{
	
	int shoesCount;
	int horsePower;
	
	public static void main(String[] args) {
		
		Animal a1 = new Animal();
		a1.wild=false;
		
		System.out.println(a1.breed);
		System.out.println(a1.legCount);
		System.out.println(a1.color);
		System.out.println(a1.wild);
		System.out.println("--------------------------");
		
		Horse h1 = new Horse();
		h1.breed = "Spartan";
		h1.wild = false;
		h1.horsePower = 600;
		
		System.out.println(h1.breed);
		System.out.println(h1.horsePower);
	}

}
