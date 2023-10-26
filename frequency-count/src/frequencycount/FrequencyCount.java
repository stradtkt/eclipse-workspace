package frequencycount;


import java.util.Scanner;

public class FrequencyCount {
		public static void main(String[] args) {
			// TODO prompt for a phrase
			System.out.println("Enter a phrase:  ");
			Scanner input = new Scanner(System.in);
			String in = input.nextLine();
			
			listVowels(in);
		}

		public static void listVowels(String vowels) {
		    String arrayToString = vowels.toString();
		    int length = arrayToString.length();
		    System.out.println("a count: " + (length - arrayToString.replace("a", "").length()));
		    System.out.println("e count: " + (length - arrayToString.replace("e", "").length()));
		    System.out.println("i count: " + (length - arrayToString.replace("i", "").length()));
		    System.out.println("o count: " + (length - arrayToString.replace("o", "").length()));
		    System.out.println("u count: " + (length - arrayToString.replace("u", "").length()));
		}
	
	}