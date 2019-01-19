package day43_static;

public class AtRestaurant {
	public static void main(String []args) {
		
		Dinner Dad= new Dinner() ;
		Dinner Mom= new Dinner();
		Dinner Kid= new Dinner();
		
	System.out.println("Pizza slices:" + Dinner.pizzaSlices);
	
	Dad.takeASlice(2);
	Kid.takeASlice(3);
	Mom.takeASlice();
	
	System.out.println("Pizza slices: "+ Mom.pizzaSlices);
	Mom.takeASlice();
	System.out.println(Kid.pizzaSlices);
	
		
	}

}
