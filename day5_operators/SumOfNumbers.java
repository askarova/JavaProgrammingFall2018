package day5_operators;
import java.util.Scanner;


public class SumOfNumbers {
	public static void main(String[] args) {
		/*
		 * Write a program that asks user to enter 3 numbers from keyboard
		 * and calculates the sum of those numbers and show result
		 */
	// create a scanner
		
	 Scanner scan = new Scanner(System.in);
	 
	 // ask user to enter 3 nums
	 
	 System.out.println("Enter 3 number");
	 
	 int num1 = scan.nextInt();
	 int num2 =scan.nextInt();
	 int num3 =scan.nextInt();
	 
int sum = num1 + num2 + num3;
System.out.println("sum is "+ sum);

scan.close();


		 
		 
		 
	
		 
	}
	

}
