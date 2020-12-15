/**
 * This class is for the second part (guessing game) of assignment one
 */
package com.ss.sf.training.assignment1;
import java.util.Scanner;
import java.util.Random;
/**
 * @author abelldm
 *
 */
public class GuessingGame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Random rand = new Random();
		
		//establish upperbound at 81 so that the highest generated random number will be 91
		// if the random number is 91 and the user guesses the upper limit of 100, the user will be within 10 of the random number
		int upperbound = 81;
		
		// random number plus 10 so that the lowest possible random number of 0 will come out to 10. If user guesses 1, 1 is within 10 of 10
		int randNum = rand.nextInt(upperbound) + 10;
				
		System.out.print("Hello, brave guesser! Please guess a number from 1 to 100. To win, you must guess within 10 of the random number in five tries or less! ");
				
		for (int i = 0; i < 5; i++) {
		
			int userGuess = scanner.nextInt();

			if (userGuess < 1 || userGuess > 100) {
				
				System.out.print("Uh-oh! You did not follow the rules! Please guess a number between 1-100! ");
				
			} else if ((userGuess > (randNum - 10)) && (userGuess < (randNum + 10))) {
				
				System.out.println(String.format("Congratulations! Your guess is within 10 of the randomly generated number! The randomly generated number is: %d. If you would like to play again, please run the program again!", randNum));
				break;
				
			} else {
				
				if (i == 4) {
					
					System.out.println(String.format("Oh, well. You did not guess within 10 of the randomly generated number in 5 tries or less. The randomly generated number is: %d. If you would like to play again, please restart the program!", randNum));
					
				} else {
					
					System.out.print("Whoops! Your guess is not within 10 of the randomly generated number! Please guess again! ");
					
				}

			}
		}
		//close the scanner
		scanner.close();
	}
}
