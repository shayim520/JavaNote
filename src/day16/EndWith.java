package day16;

import java.util.Scanner;

public class EndWith {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter your name:");
		String name = s.nextLine();
		boolean start = name.startsWith("A");
		boolean end = name.endsWith("x");
		
		if(start && end) {
			System.out.println("the name matches");
		}else {System.out.println("no match");
		
		}
		
		int lastindex = name.lastIndexOf("a");
//		System.out.println(start);
//		System.out.println(end);
		System.out.println(lastindex);
		int count = name.length();
		
		if(count>2) {
			if(count%2==1) {
				int midIndex = count/2;
				System.out.println(name.charAt(midIndex) );
			}else {
				
				int midIndex = count/2;
				char midR=name.charAt(midIndex);
				char midL=name.charAt(midIndex-1);
				System.out.println(""+midR + midL);
			}
		}
		

	}

}
