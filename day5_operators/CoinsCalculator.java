package day5_operators;

import java.util.Scanner;

public class CoinsCalculator {
 public static void main(String[]args) {
	 
//	 int pennies = 250;
//	 int dollars = pennies / 100;
//	 System.out.println(dollars);
//	 
//	 pennies %= 100;
//	 System.out.println(pennies);
	 
	Scanner scan =new Scanner(System.in);
	System.out.println("Enter count of pennies you have:");
	int pennies = scan.nextInt();
	int dollars, quarters , dimes, nickles, cents;
	
	dollars = pennies /100;
	pennies %= 100;
	quarters = pennies /25;
	pennies %=25;
	dimes = pennies /10;
	pennies %=10;
	nickles = pennies /5;
	pennies %=5;
	cents =pennies;
	
	System.out.println("Dollars: " + dollars);
	System.out.println("Quarters: " + quarters);		
	System.out.println("Dimes: " + dimes);
	System.out.println("Nickles: " + nickles);
	System.out.println("Cents: " + cents);
	
 }
 
}
