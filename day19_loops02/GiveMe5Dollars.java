package day19_loops02;

import java.util.Scanner;

public class GiveMe5Dollars {
	public static void main(String[]args) {
// ask for 5 dollars and keep asking for 5 dollars until you get it.
//or user enters it
		Scanner scan = new Scanner(System.in);
		int amount;
	
		do {
		System.out.println("Give me 5 dollars");
		amount = scan.nextInt();
		}while(amount != 5);
		
	System.out.println("Thank you for 5 dollars");
	
		
	}
	

}
