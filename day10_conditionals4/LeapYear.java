package day10_conditionals4;

import java.util.Scanner;

public class LeapYear {
   public static void main(String[]args) {
	   
	   //leap year (february 29 days)
	   //if a year is 
	   //1)divisible by 400
	   //2)divisible of 4 but not of 100 then its a leap year 
	   
	   Scanner scan=new Scanner(System.in);
	   System.out.println("Please enter year");
	   
	   int year=scan.nextInt();
	   
	   if(year % 400==0) {
		   System.out.println("It is a leap year");
	   }else if(year %4 == 0 && year%100 !=0) {
		   System.out.println("It is a leap year");
	   }else {
		   System.out.println("Not a leap year");
		   
	   }
	   
	   
   }
}
