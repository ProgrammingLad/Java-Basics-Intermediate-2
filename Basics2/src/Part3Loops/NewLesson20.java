package Part3Loops;

import java.util.Scanner;

public class NewLesson20 {

	public static void main(String[] args) {
		
		/*
		 * Variables declared inside curly brackets remain inside curly brackets
		 * If you have the same variable name outside of curly bracket
		 * IT will not be a duplicate
		 */
		{
			System.out.println("Executing code inside curly brackets......");
			int value = 5;
			System.out.println(value);
		}
		
		System.out.println("Executing code outside curly brackets......");
		int value = 0;
		System.out.println(value);
		System.out.println();
		
		
		System.out.println("Moving on with the password.......");
		Scanner input = new Scanner(System.in);
		String password = null;
		
		do {
			System.out.println("Please input your password: ");
			password = input.nextLine();
		} while(!password.equals("Password"));
		input.close();
		
		System.out.println("successful... byeee");
		
			
	}
}
