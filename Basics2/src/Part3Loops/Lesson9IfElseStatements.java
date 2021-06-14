package Part3Loops;

import java.util.Scanner;

public class Lesson9IfElseStatements {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int dogs = 5;
		int cats = 10;
		
		if(dogs > cats) {
			System.out.println("Condition is true");
		}else {
			System.out.println("Condition is false");
		}
		
		System.out.println("End of program");
		System.out.println();
		
		System.out.print("Question 1. Enter value in fahrenheit to convert to celsius: ");

		double fahrenheit1 = scanner.nextDouble();
		double celsius1 = (fahrenheit1 - 32) * 5.0 / 9;
		System.out.printf("%.1f degrees fahrenheit is %.2f degrees celsius\n", fahrenheit1, celsius1);
		System.out.println();
		
		if(celsius1 < 21) {
			System.out.printf("%.2f is too cold\n", celsius1);
		}else if (celsius1 > 21.10) {
			System.out.printf("%.2f is pretty warm\n", celsius1);
		}else {
			System.out.println("Ending program. Thank you....");
		}

	}
}
