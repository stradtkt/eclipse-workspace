package com.computeaverage;

import java.util.Arrays;

public class ComputeAverage {

	public static void main(String[] args) {
		int[] randomFilledArray = new int[10];
		System.out.println(Arrays.toString(randomFilledArray));
		fillWithRandomValues(randomFilledArray);
		double average = computeAverage(randomFilledArray);
	}

	private static double computeAverage(int[] randomFilledArray) {
		int sum = 0;
		for (int num : randomFilledArray) {
			sum += num;
		}
		
		return (sum / randomFilledArray.length);
	}

	private static void fillWithRandomValues(int[] randomFilledArray) {
		for (int i = 0; i < randomFilledArray.length; ++i) {
			int nextRandom = (int)(Math.random() * 101);
			randomFilledArray[i] = nextRandom;
		}
	}

}
