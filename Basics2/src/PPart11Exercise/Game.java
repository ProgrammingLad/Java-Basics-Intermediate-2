package PPart11Exercise;

import java.util.Random;
import java.util.Scanner;

import PPart11Exercise.Objects.GameObjects;
import PPart11Exercise.Objects.Paper;
import PPart11Exercise.Objects.Rock;
import PPart11Exercise.Objects.Scissors;

public class Game {

	private GameObjects[] objects = { new Rock(), new Paper(), new Scissors() };
	private Random random = new Random();

	/*
	 * 0. Lose 1. Draw 2. Winner
	 */

	int wins = 0;

	public void run() {
		Scanner scanner = new Scanner(System.in);
		String[] result = { "You lose this round", "It's a draw", "You won this round" };
		
		int rounds = 1;
		
		for (int i = 0; i < 3; i++) {
			
			System.out.println("Round: "  + rounds);
			rounds++;
			System.out.println("Choose an object: ");
			System.out.println("1. Rock");
			System.out.println("2. Paper");
			System.out.println("3. Scissors");
			System.out.print("Please choose your option: ");
			int objectIndex = scanner.nextInt();
			System.out.println();

			GameObjects obj1 = objects[random.nextInt(objects.length)];
			GameObjects obj2 = objects[objectIndex - 1];

			System.out.println("You chose: " + obj2);

			System.out.println("The computer chose: " + obj1);

			int comparison = obj2.compareTo(obj1);

			System.out.println(result[comparison + 1]);
	
			wins += comparison;

			System.out.println("\n");
		}

		scanner.close();
	}

	public void displayWinner() {
		System.out.print("Result: ");
		if (wins > 0) {
			System.out.println("You win");
		} else if (wins < 0) {
			System.out.println("You lose");
		} else {
			System.out.println("Its a draw");
		}
	}

}
