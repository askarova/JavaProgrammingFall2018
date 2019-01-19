package day29_Arrays06;

import java.util.Arrays;

public class MulriDArraysSyntax {
  public static void main(String[]args) {
	  
	  double[][]prices= new double [3][];
	  
	  prices[0]= new double [] {234.32,234.56,788.45};
	  prices[1]= new double [] {232.2,100.4};
	  prices[2]= new double [5];
	  prices[2][0]=543.34;
	  prices[2][1]=5364;
	  prices[2][2]= 123.54;
	  prices[2][3]=213142.4;
	  prices[2][4]=129900.54;
	  
	  
	  
	  System.out.println(Arrays.toString(prices[0]));
	  System.out.println(Arrays.toString(prices[1]));
	  System.out.println(Arrays.toString(prices[2]));
	  
	  System.out.println(Arrays.deepToString(prices));
	  
	  
  }
}
