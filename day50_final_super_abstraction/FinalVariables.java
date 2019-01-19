package day50_final_super_abstraction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FinalVariables {
	
	public static final int MAX_NUMBER_OF_STUDENTS;
	private final String SCHOOL_NAME;
	final static public String FEBRUARY = "February";
	public static final String ETSY = "https://etsy.com";

	static {
		MAX_NUMBER_OF_STUDENTS = 55;
	}

	public FinalVariables() {
		SCHOOL_NAME = "Cybertek";
		// MAX_NUMBER_OF_STUDENTS = 100; <= will not work
	}
	
	public static void calculate(final int n){
		//n = 200;
		System.out.println("Number is " + n);
		
	}

	public static void main(String[] args) {
		calculate(100);
		
		final int MAX;
		MAX = 200;
		System.out.println(MAX);

		// MAX_NUMBER_OF_STUDENTS = 57;

		final int[] NUMS = new int[] { 100, 300, 400 };
		NUMS[0] = 500;

		System.out.println(Arrays.toString(NUMS));

		// NUMS = new int[2];

		 int[] WHITE = new int[3];
		WHITE[0] = 255;
		WHITE[1] = 255;
		WHITE[2] = 255;

		WHITE[0] = 256;

		WHITE = new int[2];
		
		final List<String> PRODUCTS = new ArrayList<>();
		PRODUCTS.add("water");
		PRODUCTS.add("Cookies");
		PRODUCTS.add("Coffee");
		
		System.out.println(PRODUCTS);
		
		PRODUCTS.remove("Cookies");
		System.out.println(PRODUCTS);
		
		//PRODUCTS = new ArrayList<>(); <== cannot re-assign to new object

	

	}
}
