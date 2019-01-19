package day7_conditionals;

public class IfElseStatement {
   public static void main(String[] args) {
	
	   double coffePrice = 8.50;
	   
	if(coffePrice <6.0 ) {
		System.out.println("I will get a cofee");
	}else {
		System.out.println("I will not get cofee. Too expensive");
		
	}
	   double accountBalance = 450.50;
	   double price = 700;
	   //if you have enough money, you buy the item
	   //otherwise you say not enough balance
	   
	   if(accountBalance >=price) {
		   System.out.println("You can buy this item");
		   System.out.println("I am ordering online");
		   
	   }else {
		   System.out.println("Not enough balance");
		   System.out.println("Lets wait for a paycheck");
		   
	   }
	   
// 2 variables: speedLimit, currentSpeed
//if currentSpeed is more than 25 mph compares to SpeedLimit
// then you are getting a ticket, otherwise keep driving
	   
	   int speedLimit, currentSpeed;
	   
	   speedLimit =55;
	   currentSpeed = 65;
	   
	   if(currentSpeed >= speedLimit+20) {
		   System.out.println("Hey slow down");
	       System.out.println("You are going to get a ticket");
	   }else {
		   System.out.println("Good job, keep driving" );
		   

	   }
	   
	   
   }

}