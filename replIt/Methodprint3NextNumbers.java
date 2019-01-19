package replIt;

import java.util.Scanner;

public class Methodprint3NextNumbers {
//Create a method called next3 .
//This method gets an int argument and prints the next 3 numbers after that number. 
//Call the method from main method and pass num to it.
	
	public static void main(String[] args) {
	     Scanner scan = new Scanner(System.in);
	     System.out.println("Enter a Number");
	     
	     int num = scan.nextInt();
	     
	  next3(num);
	  
	  }
	  public static void next3(int num) {

			for (int i = num + 1; i <= num + 3; i++) {

				System.out.print(i + " ");

			}
		}
	  
	 
	 
	

}
