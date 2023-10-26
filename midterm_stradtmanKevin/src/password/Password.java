package password;

import java.util.Scanner;

public class Password {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean valid = false;
		while(!valid) {
			System.out.print("Enter password or a 'q' to quit: ");
            String password = in.nextLine();
            if (password.equalsIgnoreCase("Q")) {
                System.out.println("Quitting password manager.");
                System.exit(0);
            }
            
            String message = checkPassword(password);
            if (message == null) {
                valid = true;
                System.out.println("Password is valid.");
            } else {
                System.out.println("Invalid password: " + message);
            }
		}
		
	}

	public static String checkPassword(String password) {
		if(password.length() < 8 || password.length() > 20) {
			return "Password must be between 8-20 characters in length";
		}
		if(!password.contains("Z")) {
			return "Password must contain a capital 'Z'";
		}
		if (password.charAt(password.length() - 1) != '7') {
            return "Password last character must be a '7'";
        }
		if(!password.equals(retypePassword())) {
			return "Passwords do not match";
		}
        return null;
	}
	public static String retypePassword() {
        Scanner input = new Scanner(System.in);
        System.out.print("Retype password: ");
        return input.nextLine();
    }
}
