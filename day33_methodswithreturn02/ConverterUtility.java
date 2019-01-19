package day33_methodswithreturn02;

public class ConverterUtility {

	public static void main(String[] args) {
		System.out.println( mile2Km(55.0) );
		double kmValue = mile2Km(10);
		System.out.println(kmValue);
		
		if( mile2Km(55) < 100.0  ) {
			System.out.println("Speed is good");
		}else {
			System.out.println("Slow down");
		}
		
		double val = mile2KmV2(98.0);
		System.out.println(val);
		
		//Unit tests for fahrenheitToCelcius method
		//#1
		int res = fahrenheitToCelcius(72);
		if(res == 22) {
			System.out.println("Test #1 passed");
		}else {
			System.out.println("Test #1 failed. Incorrect result");
		}
		
		res = fahrenheitToCelcius(0);
		if(res == -17) {
			System.out.println("Test #2 passed");
		}else {
			System.out.println("Test #2 failed. Incorrect result");
		}
		
		res = fahrenheitToCelcius(-10);
		if(res == -23) {
			System.out.println("Test #3 passed");
		}else {
			System.out.println("Test #3 failed. Incorrect result");
		}
	}
	//Write a method: mile2Km , accepts miles and return km value:
	//return type: double
	//Params: 1 double
	
	public static double mile2Km(double miles) {		
//		double kms = miles * 1.60934;
//		return kms;
		return miles * 1.60934;
	}
	
	public static double mile2KmV2(double miles) {		
		double kms =	CalculatorV2.multiply(miles,1.60934);
		return kms;
		
		//return CalculatorV2.multiply(miles,1.60934);
	}

	/**
	 * Method Name: fahrenheitToCelcius
	 * Action: accepts fahrenheit and returns Celcius value
	 * Return type: int
	 * Params: 1 int
	 * 
	 */
	
	public static int fahrenheitToCelcius(int farh) {
		return (farh-32)*5/9; 
	}

}

	
	
	
	

	
		