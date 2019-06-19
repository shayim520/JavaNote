package day51;

public class Assesment {
	
	int quesetionCount;
	int score;
	String type;
	
	// in our application all assesment has one shared timeLimit
	static int timelimit = 55;
	
	// static method can only access static members
	public static void printTimelimit() {
		
		System.out.println("time Limit " + timelimit);
	}

	@Override
	public String toString() {
		return "Assesment [quesetionCount=" 
	           + quesetionCount + ", score=" + score 
	           + ", type=" + type + "]";
	}
	

}
