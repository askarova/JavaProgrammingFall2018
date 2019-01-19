package day10_conditionals4;

import java.util.Scanner;

public class FindASeason {
   public static void main(String[]args) {
	  
//1) find a season
// month ->number and find the season of the year for that month
// 2)leap year; if year is 1 multiple of 400 or
// multiple of 4 but not multiple of 100 then ita a leep year
	   
	   
	   int month=8; //use scanner for this
	   
	System.out.println("Enter month"); 
	Scanner scan=new Scanner(System.in);
	
	if (month== 12|| month==1 || month ==2) {
		System.out.println("Winter");
	}else if(month >=3 && month <=5) {
		System.out.println("Spring");
	}else if(month >=6 && month <=8){
		System.out.println("Summer");
	}else if(month >=9 && month <= 11) {
		System.out.println("Fall");	
	}else
		System.out.println("Invalid month. 1-12 accepted");
		
		
		
		}
	}
	   
	   
   

