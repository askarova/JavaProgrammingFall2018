package day20_loops03;

import java.util.Random;
import java.util.Scanner;

public class GuessANumberVersion2 {
	public static void main(String[] args) {
		/*
		 * Random is a class name,
		 * The purpose of this class is to generate random numbers
		 */
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		//give me random number between 0 and 9
		//System.out.println(random.nextInt(10));
		int secretNumber = random.nextInt(100);
		int guessedNumber;
		
		do {
			System.out.println("Guess the number:");
			guessedNumber = input.nextInt();
			
			if(guessedNumber == secretNumber) {
				System.out.println("Congratulations! You won!");
			}else if(guessedNumber > secretNumber) {
				System.out.println("Too large");
			}else {
				System.out.println("Too small");
			}
			
		}while(secretNumber != guessedNumber);
		
		
	  
	}
}




