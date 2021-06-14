package Part3Loops;

import java.util.Scanner;

public class MoreLesson17Password {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		final int ATTEMPTS = 3;
		int TRY = 0;
		final String PASSWORD = "Reyes";
		
		System.out.println("Hi Eugene, Please enter your password: ");

		while (TRY < ATTEMPTS) {
			TRY++;
			String userinput = scanner.next();
			if (PASSWORD.equals(userinput)) {
				System.out.println("Access Granted: Logging in.......");
			} else {
				System.err.println("Access Denied: Wrong Password. Please re-enter your password");
			} 
		} System.err.println("You have reached the maximum number of attempts");
		scanner.close();
	}
}
