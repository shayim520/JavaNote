package day24;

import java.util.Scanner;

public class ScannerAndArray {

	public static void main(String[] args) {

	    Scanner scan = new Scanner(System.in) ; 
	    int[] arr = new int[3] ; 
	    
//	    System.out.println("enter number");
//	    arr[0] = scan.nextInt();
//	    System.out.println("enter number");
//	    arr[1] = scan.nextInt();
//	    System.out.println("enter number");
//	    arr[2] = scan.nextInt();
	    
	    
	    for (int i = 0; i < arr.length; i++) {
	      
	      System.out.println("enter number " + (i+1) );
	      arr[i] = scan.nextInt();
	      System.out.println( arr[i] );
	    
	    }
	    
	    
		int min = arr[0];
	    for(int i = 0; i < arr.length;i++) {
	    	
	    
	    if(min>arr[i]) {
	    min = arr[i];
	    }
	    }
	    System.out.println(min);
	}

}
