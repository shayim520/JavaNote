package day31;

import java.util.Scanner;

public class Calculator1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number a: ");
		int a = s.nextInt();
		System.out.println("Enter number b: ");
		int b = s.nextInt();
		add(a,b);
		sub(a,b);
		multi(a,b);
		divid(a,b);
		mod(a,b);
	}
	public static void add(int a,int b) {
		System.out.println(a+b);
	}
	public static void sub(int a,int b) {
		System.out.println(a-b);
	}
	public static void multi(int a,int b) {
		System.out.println(a*b);
	}
	public static void divid(int a,int b) {
		System.out.println(a/b);
	}
	public static void mod(int a,int b) {
		System.out.println(a%b);
	}
}

	
