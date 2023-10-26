package com.evennumbers;

public class EvenNumbers {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 0; i <= 100; i = i + 2) {
			if(i % 2 == 0) {
				sum = sum + i;
			}
		}
		System.out.println("Sum of the numbers=" + sum);
	}

}
