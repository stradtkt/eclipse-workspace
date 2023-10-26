package com.integerfactors;

import java.util.Scanner;

public class IntegerFactors {

	public static void main(String[] args) {
		System.out.print("Please enter an integer: ");
		Scanner input = new Scanner(System.in);
		
		int number = input.nextInt();
		
		for(int i = 1; i <= number; i++) {
			if(number % i == 0) {
				System.out.println("factor found: " + i);
			}
		}
	}

}
