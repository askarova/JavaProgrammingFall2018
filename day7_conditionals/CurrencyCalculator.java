package day7_conditionals;

import java.util.Scanner;
    
public class CurrencyCalculator {
     public static void main(String[]args){
    	 Scanner scan = new Scanner(System.in);
    	 
   System.out.println("USD Amount :");
   double dollars = scan.nextDouble();
   double usd2eurExchangeRate = 0.86;
   double euros = dollars * usd2eurExchangeRate;
   
   System.out.println(dollars + "USD = " +euros + "EUR");
   		
   		
   		
   
   
   
   
	
}
}
