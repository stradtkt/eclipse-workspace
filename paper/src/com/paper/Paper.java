package com.paper;

public class Paper {

	public static void main(String[] args) {
		double PAPER_WIDTH = 8.5;
		double PAPER_LENGTH = 11.0;
		
		double PAPER_2_WIDTH = 9.75;
		double PAPER_2_LENGTH = 13.25;
		
		double perimeter = (2 * PAPER_WIDTH) + (2 * PAPER_LENGTH);
		System.out.println("Perimeter of a sheet of paper: " + perimeter + " inches");
		double diagonalSquare = Math.pow(PAPER_WIDTH, 2) + Math.pow(PAPER_LENGTH, 2);
		System.out.println("The diangonal length is " + Math.sqrt(diagonalSquare) + " inches long");
		
		
		double perimeter2 = (2 * PAPER_2_WIDTH) + (2 * PAPER_2_LENGTH);
		System.out.println("Perimeter of a sheet of paper 2: " + perimeter2 + " inches");
		double diagonalSquare2 = Math.pow(PAPER_2_WIDTH, 2) + Math.pow(PAPER_2_LENGTH, 2);
		System.out.println("The diangonal length of 2: " + Math.sqrt(diagonalSquare2) + " inches long");
		
		
	}

}
