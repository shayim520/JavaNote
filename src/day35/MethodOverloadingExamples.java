package day35;

public class MethodOverloadingExamples {

	public static void main(String[] args) {
//
//		String name = "Java";
//
//		System.out.println(name.indexOf("a"));
//		System.out.println(name.indexOf("a", 2));
//		System.out.println(name.replace("a", "b"));
//		System.out.println(name.replace("va", "java"));
		
		System.out.println(addNums1(6,8));
		System.out.println(addNums2(6,8,7));
		addNums3(6,8,9,5);
	}

	public static int addNums1(int num1, int num2) {

		int sum = num1 + num2;
		System.out.println(addNums1(6,8));
		return sum;

	}

	public static int addNums2(int num1, int num2,int num3) {

		int sum = num1 + num2 + num3;
		return sum;

	}
	
	public static void  addNums3(int num1, int num2,int num3,int num4) {

		int sum = num1 + num2 + num3+num4;
		System.out.println(sum);

	}

}
