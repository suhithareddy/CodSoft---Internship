//NUMBER GAME

package com.tap.project;

import java.util.Scanner;
import java.util.Random;

public class TASK1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	    Random random = new Random();
	    int start = 1;
	    int end = 100;
	    int Attempts = 10;
	    int rounds = 0;
	    int score = 0;
	    
	    System.out.println("guess a number between " + start + " and " + end + ".");
	    do {
	    	int range = end-start+1;
	    	int target = random.nextInt(range) + start;
	        int attempt1 = 0;
	        boolean guessed = false;
	         
	        System.out.println("Round " + (rounds + 1) + ": Guess the number within " + Attempts + " attempts.");
	        while (attempt1 < Attempts && !guessed) {
	               System.out.print("Enter your guess: ");
	               int userGuess = scanner.nextInt();
	               attempt1++;

	               if (userGuess == target) {
	                   System.out.println("Congratulations! You guessed the correct number, which was " + target + ".");
	                   score += Attempts - attempt1 + 1;
	                   guessed = true;
	                }else if (userGuess < target) {
	                   System.out.println("Try a higher number.");
	                }else {
	                   System.out.println("Try a lower number.");
	                }
	            }
	        
	        if (!guessed) {
	                System.out.println("Sorry, you've reached the maximum number of attempts. The correct number was: " + target);
	            }

	            rounds++;
	            System.out.println("Your current score: " + score);

	            System.out.print("Play another round? (yes/no): ");
	            String playAnotherRound = scanner.next().toLowerCase();
	            if (!playAnotherRound.equals("yes")) {
	                break;
	            }
	            System.out.println();
	        } while (true);

	        System.out.println("Game Over! Your total score: " + score);

	        scanner.close();
	}
}
	    
	

	            

	     
	 


	     
		
			     
	     	            
	        	

	            
	
	

      



	
		

		

	