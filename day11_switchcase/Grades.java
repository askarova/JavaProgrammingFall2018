package day11_switchcase;

import java.util.Scanner;

public class Grades {
 public static void main(String[]args) {
	 //A-> Excellent
	 //B-> Goood
	 //C-> Acceptable
	 //D-> Poor
	 //Anything else ->Error: Invalid Grade
	 Scanner scan=new Scanner(System.in);
	 System.out.println("Enter Grade: ");
	 
	 char grade =scan.next().charAt(0);
	 
	 switch(grade) {
	 case 'A':
		 System.out.println("Excellent");
		 break;
	 case 'B':
		 System.out.println("Good");
		 break;
	 case 'C':
		 System.out.println("Acceptable");
		 break;
	 case 'D':
		 System.out.println("Poor");
		 break;
		 default:
			 System.out.println("ERROR: Invalid Grade");	 
	 }
	 
	 
 }
}
