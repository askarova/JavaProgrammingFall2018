package day47_inheritance;

public class ElectricCar extends Car{
	
	public static boolean hasBattery= true;
	public int batteryLevelMiles;
	
	public void charge() {
		System.out.println("Charging Electric Car");
		batteryLevelMiles = 250;
		
	}
	
	

}
