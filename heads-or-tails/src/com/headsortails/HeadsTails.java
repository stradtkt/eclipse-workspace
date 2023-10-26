package com.headsortails;

import java.util.Scanner;

public class HeadsTails {

	public static void main(String[] args) {
		//step 1 ask for heads or tails
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a 0 for heads, 1 for tails: ");
		int userGuess = input.nextInt();
		int computerGuess = (int)(Math.random() * 2);
		System.out.println("userGuess=" + userGuess + ", computerGuess=" + computerGuess);
		
		String userGuessFriendly = "";
		if (userGuess == 0) {
			userGuessFriendly = "heads";
		} else {
			userGuessFriendly = "tails";
		}
		
		String computerGuessFriendly = "";
		if (userGuess == 0) {
			computerGuessFriendly = "heads";
		} else {
			computerGuessFriendly = "tails";
		}
		
		if (userGuess == computerGuess) {
			System.out.println("You guessed " + userGuessFriendly + " coin flip was the same!");
		} else {
			System.out.println("You guessed "  + userGuessFriendly + " but the coin flip was " + computerGuessFriendly);
		}
	}

}
