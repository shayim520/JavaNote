package day21;

import java.util.Scanner;

public class StringAndLoop {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter name: ");
		String name = s.next();
		String save = "";
//		
//		for(int i =0; i<name.length();i++) {
//			
//			save = save + name.charAt(i);
//			System.out.println(name.charAt(i) + " ");
//			
//		}
//		
//		for(int i = name.length()-1;i>=0;i--) {
//			System.out.print(name.charAt(i) + " ");
//		}
		for(int i = name.length()-1;i>=0;i--) {
			char c = name.charAt(i);
			save = save + c;
			System.out.print(save );
		}
	}

}
