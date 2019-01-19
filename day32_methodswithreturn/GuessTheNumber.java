package day32_methodswithreturn;



	
	import java.util.*;

	public class GuessTheNumber {
		//playGuessNumComputerOnly()
		//playGuessNumWithLimit(int limit)
		//playGuessNumComputerVSMe(int secretNum)
		
		public static void main(String[] args) {
			playGuessNumComputerOnly();
		}
		
		

		public static void playGuessNumComputerOnly() {
			Random random = new Random();
			int secretNumber = random.nextInt(21);
			int counter = 0;
			do {
				counter++;
				System.out.println("Guess the secret number:");
				int guessNumber = random.nextInt(21);
				System.out.println("Guessing :" + guessNumber + " Counter:"+ counter);
				//check if secretNumber matches guessNumber
				if(guessNumber == secretNumber) {
					System.out.println("You won! Guessed the Secret Number!");
					break;
				}else {
					System.out.println("Wrong! Try again");
				}
				
			}while(true);
		}
		
		
	}

