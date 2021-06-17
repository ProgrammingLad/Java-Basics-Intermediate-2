package Part5Methods;

import java.util.Scanner;

public class Lesson3Point1Class {

	Scanner scanner = new Scanner(System.in);
	boolean running = true;

	public String[] options = { "1. View database", "2. Add new item", "3. Delete item", "4. Quit program" };

	public void display() {
		System.out.println("Choose an option: ");

		for (int i = 0; i < options.length; i++) {
			System.out.println(options[i]);
		}
		
		System.out.println();
		
		while (true) {
			if (running = true) {
				System.out.print("Please choose an option: ");
				int userOption = scanner.nextInt();
				
				if (userOption == 1) {
					System.out.println("Viewing database");
				} else if (userOption == 2) {
					System.out.println("Adding new item");
				} else if (userOption == 3) {
					System.out.println("Deleting data");
				} else if (userOption == 4) {
					running = false;
					break;
				}
				
				System.out.println();
			} 
		} 
	

		
		if(!running) {
			System.out.println("Exiting program.... Goodbye!");
		}
	}
}

/*
 * for (String menu: options) { System.out.printf("%s\n",menu); }
 */