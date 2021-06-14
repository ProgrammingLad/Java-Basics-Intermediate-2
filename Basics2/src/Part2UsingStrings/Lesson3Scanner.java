package Part2UsingStrings;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lesson3Scanner {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		/*
		 * Convert Fahrenheit to celsius
		 */
		try {
			System.out.print("Question 1. Enter value in fahrenheit to convert to celsius: ");

			double fahrenheit1 = scanner.nextDouble();
			double celsius1 = (fahrenheit1 - 32) * 5.0 / 9;

			System.out.printf("%.1f degrees fahrenheit is %.2f degrees celsius", fahrenheit1, celsius1);
			System.out.println();

			/*
			 * Convert M to Km
			 */
			System.out.println();
			System.out.print("Question 2. Enter Meters to convert into KM: ");

			int kilometer = 1000;
			int meter = scanner.nextInt();
			int formula1 = (meter / kilometer);

			System.out.printf("1. %d meters is %d kilometers", meter, formula1);
			System.out.println();

			/*
			 * Convert KM to M
			 */
			System.out.println();
			System.out.print("Question 3. Enter Kilometers to be converted to Meters: ");

			int kilometer1 = scanner.nextInt();
			int meter1 = 1000;
			int formula2 = kilometer1 * meter1;

			System.out.printf("2. %d kilometers is %d meters", kilometer1, formula2);
			System.out.println();
		} catch (InputMismatchException e) {
			System.err.println("Please check input and make sure it is a number");
		} finally {
			System.out.println();
			scanner.close();
			System.out.println("Thank you for using me, now closing........");
		}
	}
}
