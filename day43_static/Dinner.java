package day43_static;

public class Dinner {
	
	public static int pizzaSlices=8;
	
	public void takeASlice() {
		pizzaSlices--;
		
	}
	
  public void takeASlice(int num) {
	  //pizzaSlices= pizzaSlices
	  pizzaSlices-= num;
  }
}
