package day31_Methods2;

public class Steps {

	public static void main(String[]args) {

	
	steps(0);
	}
	
	//create a method steps. it accepts an int parameter.
	//if the parameter is negative then we print"jump"that many times
	//-2
	//jump 1
	//jump 2
	
	//if parameter is 0 then we sit
	//if it is positive we take steps:
	//Step 1
	//Step 2
	
	
	public static void steps(int times) {
		if(times ==0) {
			System.out.println("sit");
		}else if(times >0){
			for(int i=1; i<=times; i++) {
			System.out.println("Step " +i);
			}
		}else if(times <0) {
			for(int n=1; n<=times*(-1); n++) {
				System.out.println("Jump " + n);
				
			
			
			
			}
			
		}
		
	}
}
