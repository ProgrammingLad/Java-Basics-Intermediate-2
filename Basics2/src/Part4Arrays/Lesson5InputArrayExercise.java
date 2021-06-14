package Part4Arrays;

import java.util.Scanner;

/*
 * Exercise: 
 * Ask a user to type number 3 times
 * Print 3 numbers entered
 * Show total value of 3 numbers
 */

public class Lesson5InputArrayExercise {
	public static void main(String[] args) {
		
		int[] numbers = new int[3];
		
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Please enter a number: ");
			
			numbers[i] = scanner.nextInt();
		}
		scanner.close();
		
		System.out.println();
		System.out.println("Listing user input..........");
		
		
		int count = 1;
		int total = 0;
		for(int number: numbers) {
			System.out.printf("%d. input by user: %d\n", count, number);
			count++;
			total += number;
		}
		
		System.out.printf("Total value: %d\n", total);
	
		
		
	}
}


//sysoutf (%d %d %d, a, b, c)
//Sysoout (A + b + c)
