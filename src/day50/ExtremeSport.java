package day50;

public class ExtremeSport extends Sport{
	@Override
	public void doSport() {
		System.out.println("doing extreme sport---- sky diving");
	}
	
	
	public static void main(String[] args) {
		
		ExtremeSport e1 = new ExtremeSport();
		e1.doSport();
		System.out.println(e1.toString());
		
	}


	@Override
	public String toString() {
		return "ExtremeSport ";
	}
	
	


	

}
