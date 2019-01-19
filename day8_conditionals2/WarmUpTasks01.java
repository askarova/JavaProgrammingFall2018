package day8_conditionals2;

import java.util.Scanner;

public class WarmUpTasks01 {
   public static void main(String[]args) {
	   
	   // create a variable pincode and assign some number
	   //ask user to enter their pincode, if it matches,say access
	   //granted
	   //if not,say denied
	   
	   int pincode= 1234;
	   
	   Scanner scan = new Scanner(System.in);
	   System.out.println("Please enter your pincode");
	   
	   int inputPinCode = scan.nextInt();
	   
	   
	   if(inputPinCode == pincode) {
		   System.out.println("Access granted");
	   }else {
		   System.out.println("Access Denied");
		   System.out.println("Incorrect pincode");
		  
//ask user to enter a number, and check if its odd or even number.
// if even, print "it is even number,
//else print it is odd number
		   
		System.out.println("Enter any number");
		int number= scan.nextInt();
		
		if(number %2 ==0) {
			System.out.println("Even number");
		}else {
			System.out.println("Odd number");
		
		}
		   
	   }
			   
   }
}
