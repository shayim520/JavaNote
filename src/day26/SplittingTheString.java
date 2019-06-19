package day26;

import java.util.Arrays;

public class SplittingTheString {

	public static void main(String[] args) {
		
		String str = "Java is fun";
		String[] words = str.split(" ");
		System.out.println(Arrays.toString(words));
		
		
		String groceries = "milk,fruit,  vagetable,rice";
		String[] split = groceries.split(",");
		System.out.println(Arrays.toString(split));
		System.out.println(split.length);
		for(int i=0;i<split.length;i++) {
			int length=split[i].length();
			System.out.print(length + "," );
			
			System.out.print(split[i].trim().length());
		}
		
		
	}

}
