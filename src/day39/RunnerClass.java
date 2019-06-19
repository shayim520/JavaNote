package day39;

public class RunnerClass {

	public static void main(String[] args) {
		
		// local variable  
	    //String s = "abc" ; 
	    
	    Person p1 = new Person(); 
	    p1.name = "Talmurat" ;
	    p1.age = 1 ;
	    p1.gender = 'M' ;
	    
	    
	    Person p2 = new Person();
	    p2.name = "Diana";
	    p2.age = 27;
	    p2.gender = 'F';
	    System.out.println(p1.name);
	    System.out.println(p2.name);

	}

}
