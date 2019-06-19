package day41;

public class ACTester {

	public static void main(String[] args) {
		
		AirConditioner ac = new AirConditioner();
		ac.brand = "Samsung";
		ac.CurrentTemp=79.7f;
		ac.isOn=true;
		ac.displayTheBrand();
		ac.displayAllInfo();
		ac.turnOff();
		
		
		ac.turnOn();
		ac.showCurrentTemp();
		ac.dicreaseTemp(15);
		ac.increaseTemp(25);
		ac.setTemperature(72);
		
		

	}

}
