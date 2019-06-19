package day23;

public class ArrayIntro {

	public static void main(String[] args) {

		// we declared int array variable
		// and we assigned and int array object
		// that has capacity of 5
		int[] numbers = new int[5];
		// System.out.println(numbers);

		// ASSIGNING VALUE to array
		numbers[0] = 10;
		numbers[1] = 15;
		numbers[2] = 28;
		numbers[3] = 20;
		numbers[4] = 3;

		System.out.println(numbers[0]);

		double[] num = new double[5];
		num[0] = 1.25;
		num[1] = 2.5;
		num[2] = 3.58;
		num[3] = 5.69;
		num[4] = 7.25;
		
		System.out.println(num[4]);
	}

}
