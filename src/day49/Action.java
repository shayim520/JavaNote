package day49;

public class Action {

	public static void main(String[] args) {
		
		Employee e = new Employee();
		// e can only access title and id;
		FullTimeEmployee f = new FullTimeEmployee();
		//salary, insurance
		// title, id coming from Employee
		Teacher t = new Teacher();
		// teacherid energy level
		// salary, insurance coming from FullTimeEmployee
		//title id coming from Employee
		
		
	}

}
