package com.it1090c;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		//TODO #1: prompt user for a string 
		Scanner input = new Scanner(System.in);
		for(::) {
			System.out.print("Enter a phrase or 'q' to quit: ");
			String nextPhrase = input.nextLine();
			if(nextPhrase.length() == 1 && nextPhrase.charAt(0) == 'q') {
				break;
			}
			String flippedPhrase = reverseString(nextPhrase);
			if(nextPhrase.equals(flippedPhrase)) {
				System.out.println("That is a palindrome");
			} else {
				System.out.println("That is not a palindrome" );
			}
		}

		//TODO #2: invoke the reverseString() method, passing the input string
		
		//TODO #3: Compare the reverseString() result and input string
		//TODO #4: Output whether it's a palindrome or not
		//TODO #5: Continue prompting until user enters a Q to end
	}
	
	/**
	 * 
	 * @param stringToReverse String to reverse
	 * @return new String representing the {@code stringToReverse} reversed
	 */
	public static String reverseString(String stringToReverse) {
		//TODO Create a new String
		String flipped = "";
		for(int i = stringToReverse.length() - 1; i >= 0; --i) {
			flipped = flipped + stringToReverse.charAt(i);
		}
		//TODO Add characters from stringToReverse into new string in reverse
		//TODO Return new String
		return flipped;
	}

}
