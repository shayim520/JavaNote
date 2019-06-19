package day16;

public class ReplacePartOfString {

	public static void main(String[] args) {
		
		String str = "Date is 03_25_2019";
		str = str.replace('_','-');
		System.out.println(str);
		System.out.println(str.replace("is", "was"));
		System.out.println(str.replace("is", " "));
		System.out.println(str.replace("is", ""));
		
		 String str1 = "Date is 03_25_2019" ;
	        
	        str1 = str1.replace('_','-') ; 
	        
	        System.out.println(  str1   ); 
	        
	        //Date is 03-25-2019  --> Date will be 03-25-2019
	        
	        str1 = str1.replace("is","will be" ) ; 
	        System.out.println(  str1 );
	        
	        // Date will be 03-25-2019  --->>>03-25-2019
	        System.out.println(  str1.replace("Date will be ", "")    );
	        
	        
	        
	        String str2 = "AAAAABBBBBBCCCCCCC" ; 
	        System.out.println(     str2.replace('A', 'Z')      );



	}

}
