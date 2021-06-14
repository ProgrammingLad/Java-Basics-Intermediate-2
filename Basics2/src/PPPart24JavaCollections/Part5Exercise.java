package PPPart24JavaCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
 * Write a program that ask the user to enter numbers -- as may as they like, one by one.
 * To stop entering numbers: The user must type stop
 * The program then displays all the numbers the user entered from smallest to largest;
 * it also tells them the average value of all the numbers.
 * If they enter something that isn't a number, it prints, "invalid number" and carries on.
 * At the end, print out the average values of number
 */

public class Part5Exercise {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		double userInput;
		double total = 0;
		
		ArrayList<Double> numbers = new ArrayList<>();

		while (true) {
			System.out.println("Please enter a number or type stop: ");
			String line = scanner.nextLine();

			if (line.equalsIgnoreCase("Stop")) {
				break;
			}
			try {
				userInput = Double.parseDouble(line);
				numbers.add(userInput);
				Collections.sort(numbers);
				total += userInput;
			} catch (NumberFormatException e) {
				System.out.println("Invalid number... please enter a number....\n");
				continue;
			}

		}
		scanner.close();
		
		if(numbers.size() > 0) {
		for(Double number: numbers) {
			System.out.printf("You have entered: %.2f\n", number);
		}
		System.out.println();
		System.out.printf("Average of input: %.2f", total/numbers.size());
		}
		else {
			System.out.println("You did not enter a number");
		}
	}

}
