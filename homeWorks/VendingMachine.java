package homeWorks;

import java.util.Scanner;

public class VendingMachine {
   public static void main(String[]args) {
	   
	   Scanner scan=new Scanner(System.in);
	   
	   int amount, quarters, dimes, nickels, pennies,exchange;
	   System.out.println("Enter the price of the(from 25 cents to a dollar, "
	   		+ "in 5-cent increments): ");
	   
	   amount=scan.nextInt();
	   
	   exchange= 100-amount;
	   
	   System.out.println("Amout in Return:"+exchange+"cents");
	   
	   quarters=exchange/25;
	   exchange=exchange%25;
	   
	   dimes=exchange/10;
	   exchange=exchange%10;
	   
	   nickels=exchange/5;
	   exchange=exchange%5;
	   
	   pennies=exchange;
	   
	   System.out.println("Quarters:"+quarters+" Dimes:"+dimes+" Nickels:"+nickels+" Pennies:"+pennies);
	      
  
}
}

