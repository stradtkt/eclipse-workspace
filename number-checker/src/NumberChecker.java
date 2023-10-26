import java.util.Scanner;

public class NumberChecker {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter for an integer: ");
		int userNumber = input.nextInt();
		if (userNumber == 0) {
			System.out.println("Number entered was a zero");
		} else if(userNumber > 0) {
			System.out.println("positive");
		} else {
			System.out.println("negative");
		}
	}

}
