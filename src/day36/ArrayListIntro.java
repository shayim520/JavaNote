package day36;

import java.util.ArrayList;

public class ArrayListIntro {

	public static void main(String[] args) {
		
		ArrayList lst1 = new ArrayList();
		lst1.add("abc");
		lst1.add("def");
		lst1.add(new Integer(10));
		lst1.add(Character.valueOf('a'));
		lst1.add(new Double("3.14"));
		
		System.out.println(lst1);
		
		
		ArrayList<String> lst2 = new ArrayList<>();

	}

}
