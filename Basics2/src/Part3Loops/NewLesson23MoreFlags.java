package Part3Loops;

import java.util.Scanner;

public class NewLesson23MoreFlags {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		final String PASSWORD = "Eugene";
		boolean gotPASSWORD = false;

		for (int i = 0; i < 3; i++) {
			System.out.println("Please enter your password: ");
			String passwordinput = scanner.nextLine();
			if (passwordinput.equals(PASSWORD)) {
				gotPASSWORD = true;
				System.out.println("Welcome " +  PASSWORD);
				break;
			} else {
				System.out.println("Incorrect password");
			}
		}
		scanner.close();

		if (!gotPASSWORD) {
			System.err.println("Access denied");
		}
	}
}
