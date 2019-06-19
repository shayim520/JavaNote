package day32;


public class Task2 {

	public static void main(String[] args) {
		
		boolean result = isAdultOrNot(20);
		System.out.println(isAdultOrNot(13));
		System.out.println(result);
		

	}
	public static boolean isAdultOrNot(int age) {
		if(age>18) {
			return true;
		}else {
			return false;
		}
		
	}

}
