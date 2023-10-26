package com.integerops;

import java.util.Scanner;

public class IntegerOps {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("What is the first number: ");
		int first = input.nextInt();
		System.out.print("What is the second number: ");
		int second = input.nextInt();
		
		int sum = first + second;
		int difference = first - second;
		int product = first * second;
		int average = (first + second) / 2;
		int absolute = Math.abs(difference);
		int min = Math.min(first, second);
		int max = Math.max(first, second);
		
		System.out.println("The sum is " + sum);
		System.out.println("The difference is " + difference);
		System.out.println("The product is " + product);
		System.out.println("The average is " + average);
		System.out.println("The absolute difference is " + absolute);
		System.out.println("The min is " + min);
		System.out.println("The max is " + max);
	}

}
