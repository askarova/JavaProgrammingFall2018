package homeWorks;

import java.util.Scanner;

public class NumberToWords {
    public static void main(String[]args) {
    	
//   //Create a program called NumberToWords.
//    Program accepts a number between 0 and 10
//    	And prints the word for the number. Try to use switch statement.
//    	Ex:
//    	Enter number: 5
//    	five
   
    	System.out.println("Please enter a number between 0 and 10");
    	
    	Scanner scan=new Scanner(System.in);
        int number= scan.nextInt();
        
   if(number ==0) {
	   System.out.println("Zero");
   }else if(number ==1) {
	   System.out.println("One");
   }else if(number ==2) {
	   System.out.println("Two");
   }else if(number==3) {
	   System.out.println("Three");
   }else if(number==4) {
	   System.out.println("Four");
   }else if(number ==5) {
	   System.out.println("Five");
   }else if(number ==6) {
	   System.out.println("Six");
   }else if(number ==7) {
	   System.out.println("Seven");
   }else if(number ==8) {
	   System.out.println("Eight");
   }else if(number ==9) {
	   System.out.println("Nine");
   }else if(number ==10) {
	   System.out.println("Ten");
   }else {
	   System.out.println("Invalid input! Please enter number between 1-10");
   }
  
    	
    }
}
