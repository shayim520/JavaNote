package day54;

public class Engine {
	
	 final String engineType ;
	 final int cilinder;
	 
	 
	
	public Engine(String engineType, int cilinder) {
		
		this.engineType = engineType;
		this.cilinder = cilinder;
	}
	public void start() {
		System.out.println("Engine Type is " + engineType + "Cilynder Count is" + cilinder);
	}
	@Override
	public String toString() {
		return "Engine [engineType=" + engineType + ", cilinder=" + cilinder + "]";
	}

}
