package PPart17ImprovedRockPaperScissors;

import java.util.Random;
import java.util.Scanner;

public class Game {

	private GameObjects[] objects = GameObjects.values();

	
	private int wins;
	public void run(){
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		
		int count = 1;
		for(int i = 0; i < 3; i++) {
			System.out.println("Round " + count);
			
			
			System.out.printf("Pick an object: \n1. Rock\n2. Paper\n3. Scissors\n\nYour choice: ");
			int userInput = scanner.nextInt();
			System.out.println("\n");
			
			GameObjects obj1 = objects[userInput - 1];
			GameObjects obj2 = objects[random.nextInt(objects.length)];
			
			System.out.println("You chose: " + obj1);
			System.out.println("Commputer chose " + obj2);
			
			boolean win = obj1.beats(obj2);
			
			if(win) {
				System.out.println("You win");
				wins++;
			} else if (obj1 == obj2) {
				System.out.println("Its a draw");
			} 
			else {
				System.out.println("You lose");
				wins--;
			}
			
			System.out.println("\n");
			count++;
		}
	}
	
	public void displayWinner() {
		
		if(wins > 0) {
			System.out.println("Final Result: You won");
		} else if (wins < 0) {
			System.out.println("Final Result: You lose");
		} else {
			System.out.println("Final Result: Its a draw");
		}
	}
}
