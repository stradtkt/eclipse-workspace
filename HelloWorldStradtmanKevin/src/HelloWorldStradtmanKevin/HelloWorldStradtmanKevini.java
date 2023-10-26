package HelloWorldStradtmanKevin;

import java.util.Scanner;

public class HelloWorldStradtmanKevini {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your first name: ");
		String fname = input.next();
		System.out.print("Enter your last name: ");
		String lname = input.next();
		System.out.println();
		System.out.println("Hello \n" + fname + " " + lname);

	}

}
