package day20_loops03;

import java.util.Random;
import java.util.Scanner;

public class GuessANumber {
	public static void main(String[] args) {
		/*
		 * Random is a class name,
		 * The purpose of this class is to generate random numbers
		 */
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		//give me random number between 0 and 9
		//System.out.println(random.nextInt(10));
		int secretNumber = random.nextInt(10);
		int guessedNumber;
		
		do {
			System.out.println("Guess the number:");
			guessedNumber = input.nextInt();
			
			if(guessedNumber == secretNumber) {
				System.out.println("Congratulations! You won!");
			}else {
				System.out.println("Incorrect guess. Try again");
			}
			
		}while(secretNumber != guessedNumber);
		
		
	  
	}
}




