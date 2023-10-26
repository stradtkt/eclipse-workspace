package com.arraysandmethods;

import java.util.Arrays;

public class ArraysAndMethods {

	public static void main(String[] args) {
		System.out.println("  -----  Average  -----  ");
		int[] randomFilledArray = new int[10];
		System.out.println(Arrays.toString(randomFilledArray));
		fillWithRandomValues(randomFilledArray);
	}

	private static void fillWithRandomValues(int[] randomFilledArray) {
		for (int i = 0; i < randomFilledArray.length; ++i) {
			int nextRandom = (int)(Math.random() * 101);
			randomFilledArray[i] = nextRandom;
		}
	}

}
