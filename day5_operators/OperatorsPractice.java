package day5_operators;

public class OperatorsPractice {
	
	public static void main(String[]args) {
		//declare variable apples and assign 5
		//add 10 more apples using shorthand operator
	
		// declare variable carsInLot and assign 23
		// declare carsInLot by 10 using short hand operator
		
		
		//declare variable pizzaSlices and assign 12 to it
		//divide pizzaSlices amoung 5 ppl and assign the amount 
		//each person gets back to pizzaSlices
		
		//declare variable minutes and assign 100 to it 
		// find out how many remaining min that do not make another hour
		//and assign back to minutes also add variable hours
		// and assign whole hours to it
		
		
		int apples =5;
		apples = 5 + 10; 
		System.out.println(apples);
		
		int carsInLot = 23;
		carsInLot =23 - 10; // carsInLot -= 10;
		System.out.println(carsInLot);
				
		int pizzaSlices =12;
		pizzaSlices = 12/5; //pizzaSlices /=5;
		System.out.println("Each person gets : "+ pizzaSlices);
		
		int minutes = 100;
	    
		minutes = 100 %60;
		System.out.println(minutes);
		
		
	}
	

}
