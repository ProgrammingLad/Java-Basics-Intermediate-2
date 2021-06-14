package Part3Loops;

import java.util.Scanner;

public class NewLesson26MoreExercies {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String START = "Start";
		String STOP = "STOP";
		String QUIT = "Quit";
		
		boolean running = true;
		while (true) {
			System.out.println("Please enter a command: ");
			String input = scanner.nextLine();
			if (input.length() != 0) {
				if (input.equalsIgnoreCase(START)) {
					System.out.println("Machine starting");
					break;
				} else if (input.equalsIgnoreCase(STOP)) {
					System.out.println("Machine stopping");
					break;
				} else if (input.equalsIgnoreCase(QUIT)) {
					running = false;
					break;
				} else {
					System.out.println("Unrecognized command");
					System.out.println();
				}
			} 
		}			scanner.close();
		
		if(!running) {
			System.out.println("Exiting");
		}
		
	}
}
