package PPart18Exceptions;

import java.util.Scanner;

public class TryCatch {

	public static void main(String[] args) {
		
		int test = method();
		
		System.out.println(test);
			
	}

	/*
	 * Keep asking to enter a number If user did not enter a number Ask again and
	 * display invalid number
	 */
	public static int method() {
		
		Scanner scanner = new Scanner(System.in);
		
		boolean getNumber = false;
		
		int number = 0;
		
		do {
			System.out.println("Please enter a number: ");
			String line = scanner.nextLine();
			
			try {
				number = Integer.parseInt(line);
				System.out.print("You entered: ");
				getNumber = true;
			} catch (NumberFormatException e) {
				System.out.println("Invalid number");
			}
			
		} while(!getNumber);
		
		scanner.close();
		
		return number;
	}
}
