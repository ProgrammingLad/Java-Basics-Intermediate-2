package Part3Loops;

import java.util.Scanner;

public class NewLesson21DoWhilePassword {

	public static void main(String[] args) {
		
		String username = null;
		String password = null;
		Scanner input = new Scanner(System.in);
		
		do {
			System.out.print("Please enter your username: ");
			username = input.nextLine();
		}while(!username.equals("Eugene"));
		System.out.println("Correct username......");
		
		System.out.println();
		
		do {
			System.out.print("Please enter your password: ");
			password = input.nextLine();
		}while(!password.equals("Reyes"));
		
		input.close();
		System.out.println("Access Granted..........");
		
	}
}
