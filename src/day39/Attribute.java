package day39;

public class Attribute {

	public static void main(String[] args) {
		
		Horse h1=new Horse();
		h1.breed = "Arabic";
		h1.age = 5;
		h1.color = "white";
		h1.height = 5.1;
		System.out.println(h1.age);
		System.out.println(h1.breed +"\n"+ h1.age+"\n"+
		h1.color+"\n"+h1.height);

	}

}