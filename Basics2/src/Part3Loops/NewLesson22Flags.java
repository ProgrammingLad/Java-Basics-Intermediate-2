package Part3Loops;

import java.util.Scanner;

public class NewLesson22Flags {

	public static void main(String[] args) {

		boolean codeWord = false;
		final int ATTEMPTS = 3;
		int attemptsRemaining = 3;
		final String USERNAME = "Eugene";

		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < ATTEMPTS; i++) {
			System.out.println("Please enter username: ");
			String usernameinput = scanner.nextLine();
			if (usernameinput.equals(USERNAME)) {
				System.out.println("Access granted");
				break;
			} else if(usernameinput.equals("Eugene")) {
					codeWord = true;
			}
			else {
				attemptsRemaining--;
				System.out.println("Incorrect Password");
				if(attemptsRemaining == 0) {
					System.err.println("Access denied");
				}
				System.out.println();
			}
		}
		scanner.close();
		
		System.out.println();
		System.out.println("Checking for username..........");
		if(codeWord) {
			System.out.println("Username entered");
		}else {
			System.out.println("Username has not been entered");
		}
	}
}
