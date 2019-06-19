package day27;

import java.util.Arrays;
import java.util.Scanner;

public class CommonArrayTasks {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter 5 numbers:");

		int[] numbers = { scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt() };
		System.out.println(Arrays.toString(numbers));
		int sum = 0;

		for (int num : numbers) {
			sum = sum + num;
		}
		System.out.println(sum);
		int max = numbers[0];
		for (int eachnum : numbers) {
			if (max < eachnum)
				max = eachnum;
		}
		System.out.println("max number is : " + max);
		
		int min = numbers[0];
		for(int eachnum : numbers) {
			if(eachnum<min) {
				min = eachnum;
			}
			
		}
		System.out.println("min number is : " + min);
	}

}
