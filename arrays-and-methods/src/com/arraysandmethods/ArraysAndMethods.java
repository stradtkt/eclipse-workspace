package com.arraysandmethods;

import java.util.Arrays;

public class ArraysAndMethods {

	public static void main(String[] args) {
		System.out.println("  -----  Average  -----  ");
		int[] randomFilledArray = new int[10];
		System.out.println(Arrays.toString(randomFilledArray));
		fillWithRandomValues(randomFilledArray);
		System.out.println(Arrays.toString(randomFilledArray));
		double average = computeAverage(randomFilledArray);
		System.out.println("Average=" + average);
	}

	private static void fillWithRandomValues(int[] randomFilledArray) {
		for (int i = 0; i < randomFilledArray.length; ++i) {
			int nextRandom = (int)(Math.random() * 101);
			randomFilledArray[i] = nextRandom;
		}
	}
	
	private static double computeAverage(int[] arrayToAverage) {
		int sum = 0;
		for(int num : arrayToAverage) {
			sum += num;
		}
		return (sum / arrayToAverage.length);
	}

}
