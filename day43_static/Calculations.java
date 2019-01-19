package day43_static;

public class Calculations {
	public static void main(String[]args) {
		
		 
	System.out.println(Calculator.plus(5, 4));
	System.out.println(Calculator.minus(50, 3));
	
	Calculator HeydarCalculator = new Calculator();
	System.out.println(HeydarCalculator.multiply(4,2));
	System.out.println(HeydarCalculator.plus(10, 30));
	
	// Calculator.operation ="add"; will not work
	
	HeydarCalculator.operation="math calculations";
	
		
	}
	

}
