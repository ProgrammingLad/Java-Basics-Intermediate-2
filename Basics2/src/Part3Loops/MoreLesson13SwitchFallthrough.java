package Part3Loops;

import java.util.Scanner;

public class MoreLesson13SwitchFallthrough {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Do you want to proceed (Y/N): ");
		String input = scanner.nextLine();
		scanner.close();
		
		switch (input) {
		case "Y":
			System.out.println("Proceeding......");
			break;
		case "N":
			System.out.println("Not proceeding.......");
			default:
			System.out.println("Unrecognized option - Please enter either Y or N");
			break;
		}
	}	
}
