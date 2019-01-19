package day6_operators_boolean;
import java.util.Scanner;

public class gasMileage {
public static void main(String[]args) {
	
	// write a program that ask user to enter current car odometer miles
	// and prevouse car odometer miles.Also number of gallons that was put.
	//price per gallon.
	// calculate MPG-> miles per gallon value
	//calculate total gas expense.
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Enter Current Odometer Reading: ");
	double currentOdometer= scan.nextDouble();
	
	System.out.println("Enter Previous Odometer Reading: ");
	double previousOdometer = scan.nextDouble();
	
	System.out.println("Enter gallons : ");
	double gallons = scan.nextDouble();
	
	System.out.println("Enter Gas price per gallon : ");
	double pricePerGallon = scan.nextDouble();
	
    double mpg = (currentOdometer - previousOdometer )/ gallons;
    System.out.println("MPG value: " + mpg);
    
    double totalCost= gallons * pricePerGallon;
    System.out.println("Your total cost is $ " + totalCost);
    	
    
	
	
	
	
	
}
}
