package replIt;

import java.util.Scanner;

public class methodSimpleCalculator {
	public static void main(String[]args) {
		
		
//create a static method called "plus", 
//its return is void and it gets no arguments.

//It asks the user to input two numbers, 
//then it will add them and print the result.
//Create a scanner within plus method.
		
	
		    Scanner scan = new Scanner(System.in);
		    System.out.println("Please enter 2 numbers");
				
				
				int b;
				int a;
				
				plus(a = scan.nextInt(), b = scan.nextInt());
				
			}
			
			public static void plus(int a, int b){
			     
			    System.out.println("result: " + (a+b));
		  }
		  
		}
