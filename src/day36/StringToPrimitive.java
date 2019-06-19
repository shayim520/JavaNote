package day36;

public class StringToPrimitive {

	public static void main(String[] args) {
		
		String d ="3.14";
		Double d1 = Double.valueOf(d);
		System.out.println(d1);
		
		double d2 =d1;
		System.out.println(d2);
		
		System.out.println(Double.parseDouble(d));

	}

}
