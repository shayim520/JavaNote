package day59;

import day58.*;

public class AnimalShow59 {

	public static void main(String[] args) {
		
//		Cat c1= new Cat();
//		c1.makeNoise();
		Animal a1 = new Horse();
		a1.makeNoise();
//		IndoorPet i1 = new Cat();
//		i1.makeNoise();
		Cat c2 = (Cat) a1;
		c2.makeNoise();
		
		Horse a2 =new Horse();
		a1.makeNoise();
		a2 = (Horse)a1;
		a1.sleep();
		a2.sleep();
		
	}

}
