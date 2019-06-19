package day45;

public class Constructor {
	String name;
	String city;
	int age;
	boolean adult;
	char gender;
	
	public Constructor() {
this("fsdf", "saaa", 45, false, 'f');
		//		this.adult = true;
//		this.age=25;
//		this.city = "LA";
//		this.gender = 'M';
//		this.name="shay";
		System.out.println("gjhgjgj");
		
	}

	public Constructor(String name, String city, int age, boolean adult, char gender) {
//		this();
		this.adult = true;
		this.age=25;
		this.city = "LA";
		this.gender = 'M';
		this.name="Shay";	
		System.out.println();
	}

	
	public String toString() {
		return "Constructor [name=" + name + ", city=" + city + ", age=" + age + ", adult=" + adult + ", gender="
				+ gender + "]";
	}
	

}
