package day17;

public class WhileLoop {

	public static void main(String[] args) {
		
		
		int a=0;
		while(a <= 5){
			
			System.out.println("Happy Birthday!!!" + a);
			++a;
		}
		
		int y = 5;
		while(y >= 1) {
			System.out.println("Happy Birthday!!!" + y);
			--y;
			
		}

		int num = 50;// print even number;
		while(num <= 100 ) {
			System.out.println("Even number from 50 to 100 is " + num++);
			++num;
		}
		int num1 = 50;// print odd nember;
		while(num1 < 100 ) {
			System.out.println("Even number from 50 to 100 is " + ++num1);
			++num1;
		}
	}

}
