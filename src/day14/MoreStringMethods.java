package day14;

public class MoreStringMethods {

	public static void main(String[] args) {

		String name = "Shayim";
		int count = name.length();
		int midPoint = count / 2;
		System.out.println(name.charAt(5));
		System.out.println(name.substring(0, 2));
		System.out.println(name.substring(2, 5));
		System.out.println(name.substring(count - 1, count));
		System.out.println(name.length());
		System.out.println(name.substring(midPoint, count));

		
		
//		int i ;
//		System.out.println(i);
	}

}
