package day46_this_isa;

public class HasARelationTest {

	public static void main(String[]args) {
		
		Engine carEngine = new Engine();
		carEngine.cylinders =4;
		carEngine.horsepower= 234;
		
		Car camry = new Car();
		camry.model = "Toyota Camry";
		camry.engine = carEngine;
		
		//print
		
		System.out.println(camry.model);
		System.out.println(camry.engine.cylinders);
		
		Car car2= new Car();
		car2.model = "BMW";
		car2.engine= new Engine();
		car2.engine.cylinders= 6;
		car2.engine.horsepower= 500;
		
		Car car3= new Car();
		car3.engine= new Engine(8, 687);
		car3.model= "Audi";
		
		
		System.out.println(car3.model + " has " + car3.engine.cylinders + " cylinders");
		System.out.println(car3.model + " has " + car3.engine.horsepower + " horsepower");
	}
}
