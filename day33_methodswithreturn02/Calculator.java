package day33_methodswithreturn02;

public class Calculator {

	
		public static double add(double num1, double num2) {
			double result = num1 + num2;
			return result;
		}
		
		public static double subtract(double num1, double num2) {
			double result = num1 - num2;
			return result;	
		}
		
		public static double multiply(double num1, double num2) {
			double result = num1 * num2;
			return result;
		}
		
		public static double divide(double num1, double num2) {
			if(num2 == 0) {
				System.out.println("ERROR: Cannot divide by zero");
				return -1;
			}
			
			double result = num1 / num2;

			return result;
			
		}
		
	}
	

