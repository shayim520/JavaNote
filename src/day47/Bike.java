package day47;

public class Bike {
	
	private String brand;
	private int gear;
	private double speed;
	private int id;
	private static int countOfBike ;
	
	private Bike() {
		System.out.println("no arg is being called");
	}
	
	public Bike(String brand, int gear, double speed) {
		this();
		this.brand = brand;
		this.gear = gear;
		this.speed = speed;
		countOfBike++;
		this.id = countOfBike;
	}
	
	public static void showCurrentCount() {
		System.out.println("Current Count of Object is " + countOfBike);
	}
	
	public static void resetCount() {
	    countOfBike = 0 ; 
	  }
	
	public String getBrand() {
		return brand;
	}
	public int getGear() {
		return gear;
	}
	public double getSpeed() {
		return speed;
	}
	public int getId() {
		return id;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setGear(int gear) {
		this.gear = gear;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	
	public void  speedUp(int increaseBy) {
		increaseBy+=increaseBy;
	}
	
	public void slowdown(int decreaseBy) {
		decreaseBy -=decreaseBy ;
	}
	
	public String toString() {
		return "Bike [brand=" + brand + ", gear=" + gear + ", speed=" + speed + ", id=" + id + "]";
	}
	

}
