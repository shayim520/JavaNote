package day18;

import java.util.Scanner;

public class GiveMeSum {

	public static void main(String[] args) {
		
		
Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Enter the Number:");
		
		int sum = 0 ;
		/*
		 * 1+0=1
		 * 2+1=3
		 * 3+3=6
		 * ......
		 */
		
		int count =1;
		
		while (count<=5) {
			
			sum = sum+count;
			System.out.println("current sum :"+sum+"count is "+count);
			
			
			
			
			count++;
			
			
		}
		
		
		System.out.println(sum);
	}

}
