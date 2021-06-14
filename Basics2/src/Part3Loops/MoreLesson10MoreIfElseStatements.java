package Part3Loops;

import java.util.Scanner;

public class MoreLesson10MoreIfElseStatements {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Select a Motor");
		System.out.println("==============");

		System.out.printf("1. Select Ninja 400\n2. Select ZX25r\n3. Select R3\n\nPlease input your choice: ");

		int input = scanner.nextInt();
		scanner.close();

		if (input == 1) {
			System.out.println("Ninja 400, Good choice");
		} else if (input == 2) {
			System.out.println("ZX25R, So you like a screamer bike");
		} else if (input == 3) {
			System.out.println("R3 then? Good power, good price");
		} else if (input == 0) {
			System.out.println("Please come back again another time");
			System.exit(0);
		} else if (input > 100) {
			System.out.println("Found the hidden easter egg");
			System.exit(0);
		} else {
			System.out.println("Invalid option");
		}
	}
}
