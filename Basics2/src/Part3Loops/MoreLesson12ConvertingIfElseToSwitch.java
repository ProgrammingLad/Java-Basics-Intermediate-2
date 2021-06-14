package Part3Loops;

import java.util.Scanner;

public class MoreLesson12ConvertingIfElseToSwitch {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Select a Motor");
		System.out.println("==============");

		System.out.printf("1. Select Ninja 400\n2. Select ZX25r\n3. Select R3\n\nPlease input your choice: ");

		int input = scanner.nextInt();
		scanner.close();

		/*
		 * We placed the switch statement inside the else statement So it gets executed
		 * if the easter egg is not discovered
		 */
		if (input > 100) {
			System.out.println("You have unlocked the eastern egg");
		} else if (input == 50) {
			System.out.println("Okay, 50% discount unlocked");
		} else {
			switch (input) {
			case 1:
				System.out.println("You have chosen Ninja");
				break;
			case 2:
				System.out.println("You have chosen zx25r");
				break;
			case 3:
				System.out.println("You have chosen r3");

				break;
			default:
				System.out.println("That motor is not available in the list, sorry");
				System.exit(0);
				break;
			}
		}

	}

}
