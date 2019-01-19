package homeWorks;

import java.util.Scanner;

public class DaysInMonth {
   public static void main(String[]args) {
	   
	   System.out.println("Please enter a month number");
	   
	   
	   Scanner scan = new Scanner(System.in);
	   int month =scan.nextInt();
	   
	   String daysInMonth ;
	   
	  if(month ==1) {
	daysInMonth= "31 days";
	System.out.println(daysInMonth);
	  } else if(month ==2) {
		  daysInMonth ="29 days";
	System.out.println(daysInMonth);
	  }else if(month ==3) {
	   daysInMonth ="31 days";
	   System.out.println(daysInMonth);
	  } else if(month ==4) {
		    daysInMonth ="30 days";
		    System.out.println(daysInMonth);
	 }else if(month ==5) {
		   daysInMonth ="31 days";
		   System.out.println(daysInMonth);
	 } else if(month ==6) {
		 daysInMonth="30 days";
		 System.out.println(daysInMonth);
	 }else if(month==7){
		 daysInMonth="31 days";
		 System.out.println(daysInMonth);
	 }else if(month==8) {
		 daysInMonth ="31 days";
		 System.out.println(daysInMonth);
	 }else if(month ==9) {
	  daysInMonth="30 days";
	  System.out.println(daysInMonth);
	 }else if(month==10) {
		 daysInMonth= "31 days";
		 System.out.println(daysInMonth);
	 }else if(month ==11) {
		 daysInMonth="30 days";
		 System.out.println(daysInMonth);
	 }else if(month==12) {
		 daysInMonth="31 days";
		 System.out.println(daysInMonth);
	 }else {
		 daysInMonth = "Invalid input! Please enter month number between 1-12";
		 System.out.println(daysInMonth);
	 }
	  
		 
		
	}
	 
			  
			  
			  
			  
			  
	  }
		  
	  
		  
	  
		  

   


       
       
       