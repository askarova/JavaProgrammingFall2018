package day47_inheritance;

public class CarMax {
	
	public static void main(String[]args) {
		
		//create object if Vehicle class
		//instantiation of Vehicle class
		
		Vehicle vehicle = new Vehicle();
		vehicle.makeAndModel ="Subaru Outback";
		vehicle.year= 2018;
		vehicle.maxSpeed = 140;
		vehicle.mileage=200;
		
		vehicle.drive();
		vehicle.stop();
		
	//=== Instantiate Car class
		
		Car car = new Car();
		car.makeAndModel= "BMW";
		car.year= 2015;
		car.maxSpeed = 180;
		car.horsePower= 234;
	    car.mileage=150;
		
		
		car.drive();
		car.stop();
		
		car.doUber();
		
		System.out.println("===TRAIN===");
		
		Train train = new Train();
	
		train.makeAndModel = "CyberTrain";
		train.year =2019;
		train.ticketPrice = 120.50;
		train.maxSpeed =200;
		train.mileage=3000;
		
		train.drive();
		train.leaveStation();
		train.stop();
		
		System.out.println("===ELECTRIC CAR===");
		ElectricCar tesla = new ElectricCar();
		tesla.makeAndModel = "Tesla Model -S";
		tesla.year= 2015;
		tesla.maxSpeed= 200;
		tesla.horsePower = 518;
		tesla.mileage= 54321;
		
		tesla.doUber();
		tesla.charge();
		tesla.drive();
		tesla.stop();
		System.out.println("Has Battery? " + ElectricCar.hasBattery);
		
		System.out.println("===static service calls===");
		
		vehicle.service();
		car.service();
		train.service();
		tesla.service();
		
		
		
		
		
		
		
	}

}
