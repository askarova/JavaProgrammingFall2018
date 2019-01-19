package day31_Methods2;

import java.util.*; //import all classes from java.util package

public class Calculator {
	
	public static void main(String[] args) {
		double n1 = 10;
		double n2 = 5;
		
		add(400 , 1000);
		subtract(n1, n2);
		multiply(n1, n2);
		divide(n1, n2);
		
		//add more numbers?
		//add a scanner:
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter 2 numbers:");
		n1 = input.nextDouble();
		n2 = input.nextDouble();
		
		System.out.println("Choose operation: \n" +
				"1 - add \n"+
				"2 - subtract \n"+
				"3 - multiply \n"+
				"4 - divide"
				);
		/*
		 * for add select 1
		 * for substract select 2
		 * for multiply select 3
		 * for divide select 4
		 */
		int operation = input.nextInt();
		
		switch(operation) {
		  case 1:
			  add(n1, n2);
			  break;
		  case 2:
			  subtract(n1, n2);
			  break;
		  case 3:
			  multiply(n1, n2);
			  break;
		  case 4:
			  divide(n1 , n2);
			  break;
		  default:
			  System.out.println("ERROR: Invalid Operation.");
			  break;
		}
		
		
	}
	
	public static void add(double num1, double num2) {
		double result = num1 + num2;
		System.out.println(result);
		
	}
	
	public static void subtract(double num1, double num2) {
		double result = num1 - num2;
		System.out.println(result);
		
	}
	
	public static void multiply(double num1, double num2) {
		double result = num1 * num2;
		System.out.println(result);
	}
	
	public static void divide(double num1, double num2) {
		if(num2 == 0) {
			System.out.println("ERROR: Cannot divide by zero");
		}else {
			double result = num1 / num2;
			System.out.println(result);
		}
	}
	
}