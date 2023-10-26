package com.cardnotation;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a card number and suit:  ");
		String card = input.next().toUpperCase();
		int suitIndex = card.length() - 1;
		String suit = ""+card.charAt(suitIndex);
		String face = card.substring(0,suitIndex);
		switch(face) {
			case "2":
				System.out.print("Two of ");
				break;
			case "3":
				System.out.print("Three of ");
				break;
			case "4":
				System.out.print("Four of ");
				break;
			case "5":
				System.out.print("Five of ");
				break;
			case "6":
				System.out.print("Six of ");
				break;
			case "7":
				System.out.print("Seven of ");
				break;
			case "8":
				System.out.print("Eight of ");
				break;
			case "9":
				System.out.print("Nine of ");
				break;
			case "10":
				System.out.print("Ten of ");
				break;
			case "J":
				System.out.print("Jack of ");
				break;
			case "Q":
				System.out.print("Queen of ");
				break;
			case "K":
				System.out.print("King of ");
				break;
			case "A":
				System.out.print("Ace of ");
				break;
			default:
				System.out.println(face + " of ");
				break;
		}
		switch(suit) {
			case "C":
				System.out.print("Clubs");
				break;
			case "D":
				System.out.print("Diamonds");
				break;
			case "H":
				System.out.print("Hearts");
				break;
			case "S":
				System.out.print("Spades");
				break;
		}
	}

}
