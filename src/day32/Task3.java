package day32;

public class Task3 {

	public static void main(String[] args) {
		
		int bigger = giveMeBiggerNumber(12,56);
		
		System.out.println(bigger);

	}
	public static int giveMeBiggerNumber(int a, int b) {
		
		return (a>b)?a:b;
	}

}
