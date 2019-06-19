package day22;

public class UsingLoopForSearchingIndex {

	public static void main(String[] args) {
		
		String str = "ABCAADKAB";
		
		int i = 0;
		while(i< str.length()) {
			String eachChar = str.substring(i,i+1);
			
			if (i!=str.length()-1) {
				
			System.out.print(eachChar+ "-");
			
			}else {
				System.out.print(eachChar);
			
			}	
			i++;
		}
		
		
		
		
		
		
		
	}

}
