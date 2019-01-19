package day51_abstraction_and_abstract_classes;

public class Drone implements Movable{
	
	int engineSize;
	int maxHeigh;
	
	

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Move from drone");
		
		
	}
	
	@Override
	public void moveIt() {
		System.out.println("Move it");
	}
	
	public static void main(String[]args) {
		
		Drone d = new Drone();
		d.move();
		d.moveIt();
		
	}
		
		@Override
		
		public void fly() {
			System.out.println("Drone is flying");
		}
	}


