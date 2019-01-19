package day9_conditionals;

import java.util.Scanner;

public class TollCalculator {
   public static void main(String[]args) {
	   
	   //0-100->$5
	   //100-500 ->$8
	   //500-1000 -> $10
	   //More than 1000 ->$12
	   
	   Scanner scan=new Scanner(System.in);
			   
	   System.out.println("---TOLL COST CALCULATOR---");
	   System.out.println("Enter distance");
	   
	   int miles=scan.nextInt();
	   double tollCost=0.0;
	   
	   if(miles >0 && miles <=100) {
		   tollCost=5.0;
	   }else if(miles >=101 && miles <=500) {
		   tollCost=8.0;
	   }else if (miles >=501 && miles <=1000) {
		   tollCost=10;
	   }else if(miles >1000) {
		   tollCost=12;
	   }   else {
		   System.out.println("Cannot be negative distance");
	   }   
		System.out.println("Toll cost for " +miles+ "miles- $ " + tollCost);
		
		   
		  
		   
		   
		   
	   }
	   
		   
		   }
	   
	   
   

