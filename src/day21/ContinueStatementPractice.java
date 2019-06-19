package day21;

public class ContinueStatementPractice {

	public static void main(String[] args) {
		
		int i=0;
		for(i=1;i<=50;i+=2) {
			System.out.println("All odd numbers are " + i);		
			
		}
		int count = 0;
		for (int n = 1;n<50;n++) {
			if(n%4==0) {	
				continue;
			}
			count = count+1;
		}System.out.println("All divisible numbers by 4 is count " +count);
		
		
		for( int n1=1;n1<50;n1++) {
			if((n1%5==0) && (n1%3==0)) {
				continue;
			}
				
			System.out.println("All numbers not divisible by 3 and 5 are " + n1);
		}
			
		}

	}


