package com.arrayprinter;

import java.util.Arrays;

public class ArrayPrinter {
/*
 * 
 * Write a program that initializes an array with ten random integers between 
  (0 and 100 inclusive) and then prints four lines of output, containing:
 * Every element at an even index
 * Every even element 
 * All elements in reverse order
 * Only the first and last element
 * 
 * */
	public static void main(String[] args) {
		int[] randomArray = randomArray();
		printArray(randomArray);
		System.out.println();
		printEvenIndexValues(randomArray);
		System.out.println();
		printEvenNumbers(randomArray);
		System.out.println();
		printReverse(randomArray);
		System.out.println();
		printFirstLast(randomArray);
	}
	public static int[] randomArray() {
		int[] arr = new int[10];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 101);
		}
		return arr;
	}
	
	public static void printArray(int[] array) {
        System.out.print("Array: " + Arrays.toString(array));
    }
	
	public static void printEvenIndexValues(int[] array) {
		System.out.print("Even indexes: ");
		for(int i = 0; i < array.length; i += 2) {
			System.out.print(array[i] + " ");
		}
	}
	
	
	public static void printEvenNumbers(int[] array) {
        System.out.print("Even elements: ");
        for (int i : array) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
	
	public static void printReverse(int[] array) {
		System.out.print("Reversing array: ");
		for(int i = array.length - 1; i >= 0; i--) {
			System.out.print(array[i] + " ");
		}
	}
	
	public static void printFirstLast(int[] array) {
		System.out.print("First: " + array[0] + ", Last: " + array[array.length - 1]);
	}
	
}
