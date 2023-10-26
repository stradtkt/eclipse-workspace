package com.springrepeater;

import java.util.Scanner;

public class StringRepeater {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a string to repeat:  ");
		String stringToRepeat = input.nextLine();
		System.out.print("Please enter the number of times to repeat: ");
		int numOfTimes = input.nextInt();
		printStringTimes(stringToRepeat, numOfTimes);
	}
	
	public static void printStringTimes(String printString, int times) {
		for(int i = 0; i < times; ++i) {
			System.out.print(printString + " ");
		}
	}

}
