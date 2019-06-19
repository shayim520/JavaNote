package day54;

public class Stadium {
	
	int capacity;
	String name;
	public Stadium(int capacity, String name) {
		
		this.capacity = capacity;
		this.name = name;
	}
	

	@Override
	public String toString() {
		return "Stadium [capacity=" + capacity 
				+ ", name=" + name + "]";
	}

}
