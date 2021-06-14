package PPart18Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryWith {

	public static void main(String[] args) {

		
		try(Database db = new Database("asad1b")){
			db.getData();
		} catch (Exception e) {
			System.out.println("catching exception.....");
			System.out.println(e.getMessage());
		}
		
		System.out.println("\n");
		
		
		try(Scanner scanner = new Scanner(System.in)){
			System.out.println("Enter a number: ");
			
			int value = scanner.nextInt();
			System.out.println("You entered: " + value);
		}
		catch(InputMismatchException e){
			System.out.println("Thats not a number");
		}
	}
}
