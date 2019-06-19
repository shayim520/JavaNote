package day58;

public class Horse extends Animal{



	@Override

	public void makeNoise() {
		
		String s = "neigh neigh";

		System.out.println("NEIGH NEIGH  " +s);

	}

	@Override
	public void sleep() {
		System.out.println("hhhhhh");
	}

}
