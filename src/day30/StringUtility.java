package day30;

public class StringUtility {

	public static void main(String[] args) {
		reverseString("shay");
		reverseString("abc");
		reverseString("java is good for you");
		

	}
	public static void reverseString(String str) {
		for(int  i =str.length()-1;i>=0;i--) {
			System.out.print(str.charAt(i));
		}
		System.out.println();
	}

}
