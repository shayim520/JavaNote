package day25;

import java.util.Arrays;

public class StringArray {

	public static void main(String[] args) {
		
		String[] str = new String[] {"Toyota","Nissan","Bmw"};
		int i =0;
		System.out.println(Arrays.toString(str));
		System.out.println(str[0]);
		System.out.println(str.length);
		System.out.println(str[i].length());
		i++;
		System.out.println(str[i].length());
		i++;
		System.out.println(str[i].length());
		i++;
		for (int x=0; x<=str.length-1;x++) {
			System.out.println(str[x] + " char count is " + str[x].length());
			
		}
		int max = str[0].length();
		int index = 0;
		for(int a = 0;a<str.length;a++)
		if(str[a].length()>max) {
			
			max=str[a].length();
			index = a;
		
		}
		System.out.println(max);
		System.out.println(str[index]);

	}

}
