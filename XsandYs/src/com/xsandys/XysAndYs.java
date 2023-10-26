package com.xsandys;

import java.util.Scanner;

public class XysAndYs {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a string of x's and y's");
		String input = in.nextLine();
		int x = 0;
		int y = 0;
		for(int i = 0; i < input.length(); i++) {
			if(input.charAt(i) == 'X' || input.charAt(i) == 'x') {
				x++;
			} else if(input.charAt(i) == 'Y' || input.charAt(i) == 'y') {
				y++;
			}
		}
		if(x == y) {
			System.out.print("X's and Y's equal? ");
			System.out.print("true");
		} else {
			System.out.print("X's and Y's equal? ");
			System.out.print("false");
		}
	}

}
