package day58;

public class Cat extends Animal  

implements IndoorPet {

@Override

public void makeNoise() {

System.out.println("MIA MIAO");

}

@Override
public void sleep() {
	System.out.println("aaaa");
	
}

}
