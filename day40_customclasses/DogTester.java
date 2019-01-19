package day40_customclasses;

public class DogTester {

	public static void main(String[]args) {
		
		Dog myPet = new Dog();
		myPet.breed= "German Shepherd";
		myPet.color = "Brown";
		myPet.size = 50;

		
		myPet.bark();
		myPet.eat();
		myPet.run();
		
		
	}
}
