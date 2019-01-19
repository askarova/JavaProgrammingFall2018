package day9_conditionals;

import java.util.Scanner;

public class FindLargerNumber2 {
   public static void main(String[]args) {
	 //you have 3 variables num1,num2
		  //assign value of larger one into variable max
		  //print value of max
	   
	   
	   int  num1, num2, num3, max=0;
	   System.out.println("---I FIND LARGER NUMBER---");
	   System.out.println("Enter 3 number");
	   
	   Scanner scan= new Scanner(System.in);
	   
	   
	   num1=scan.nextInt();
	   num2=scan.nextInt();
	   num3=scan.nextInt();
	   
	   if(num1>=num2 && num1>=num3) {
		   max=num1;
	   } else if(num2>=num1 && num2>=num3) {
			   max=num2;
	   }else if(num3 >= num1 && num3>=num2) {
		   max=num3;
	   }else {
		   
		   }
	   System.out.println("Max: "+ max);
	   }
	   
	   }
   


