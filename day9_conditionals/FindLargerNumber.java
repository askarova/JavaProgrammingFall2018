package day9_conditionals;

import java.util.Scanner;

public class FindLargerNumber {
  public static void main(String[]args) {
	  //you have two variables num1,num2
	  //assign value of larger one into variable max
	  //print value of max
	   System.out.println("---- I FIND LARGER NUMBER----");
	   Scanner scan = new Scanner(System.in);
	   
	   int num1, num2, max;
	   System.out.println("Enter 2 numbers");
	   num1=scan.nextInt();
	   num2=scan.nextInt();
	   
	   if(num1 >= num2) {
		   max=num1;
	   }else if(num2>=num1) {
		   max=num2;
	   }else {
		   max=num1;
	   }
	   System.out.println("Max: " +max);
	   
	   }
	   
	   
  }

