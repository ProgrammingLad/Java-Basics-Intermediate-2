package Part3Loops;

import java.util.Scanner;

/*
 *Create a login system
 *Up to 3 tries for username and another 3  tries for password
 *Username = Eugene
 *Password = Reyes
 */

public class NewLesson25LoginExercise {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		//Login Credentials
		final String USERNAME = "Eugene";
		final String PASSWORD = "Reyes";

		// Attempts for username and password
		
		//Conditions for login
		int attemptsPassword = 3;
		int attemptsUsername = 3;
		int attempts = 3;
		
		//break statement
		boolean running = true;
		
		while (attempts != 0) {
			System.out.println("Please enter your username: ");
			String username = scanner.nextLine();
			attempts--;
			
			if (username.equals(USERNAME)) {
				while (attemptsPassword != 0) {
					System.out.println("Please enter your password: ");
					String password = scanner.nextLine();
					if (password.equals(PASSWORD)) {
						System.out.println("Access granted, welcome....");
						break;
					} else if (!password.equals(PASSWORD)) {
						--attemptsPassword;
						System.out.printf("Please re enter your password..... Attempts remaining: %d\n", attemptsPassword);
						if (attemptsPassword == 0) {
							running = false;
						}
					}
				}
				break;
			} else if (!username.equals(USERNAME)) {
				--attemptsUsername;
				System.out.printf("Please re enter your username.... Attempts remaining: %d\n", attemptsUsername);
			}
			
			if (attemptsUsername == 0) {
				running = false;
			}
		} scanner.close();
		
		if(!running) {
			System.out.println("Account has been locked.... please contact support.");
		}
	}
}
