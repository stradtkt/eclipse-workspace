package stringrepeater;

import java.util.Scanner;

public class StringRepeater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a string to repeat:  ");
		String newString = input.nextLine();
		System.out.println("How many times would you like it repeated?  ");
		int newInt = input.nextInt();
		stringRepeater(newString, newInt);
		
	}
	public static void stringRepeater(String str, int times) {
		for(int i = 0; i < times; i++) {
			System.out.println(str + " ");
		}
	}

}
