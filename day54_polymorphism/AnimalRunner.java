package day54_polymorphism;

public class AnimalRunner {
	
	public static void main(String[]args) {
		
		Animal a1= new Dog();
		a1.makeNoise();
		
		Animal a2= new Cat();
		a2.makeNoise();
		
		Animal a3= new Horse();
		a3.makeNoise();
		
		Animal []animals= {a1, a2, a3};
		
		for(Animal each:animals) {
			each.makeNoise();
		}
	}

}
