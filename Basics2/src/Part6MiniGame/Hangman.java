package Part6MiniGame;

import java.util.Scanner;

public class Hangman {

	private boolean running = true;
	private RandomWord word = new RandomWord();
	private Scanner scanner = new Scanner(System.in);
	private int triesRemaining = 5;
	private char lastGuess;

	public void run() {

		do {

			displayWord();
			getUserInput();
			checkUserInput();

		} while (running);

	}

	private void checkUserInput() {

		boolean isCorrect = word.guess(lastGuess);

		if (isCorrect) {
			if (word.isComplete()) {
				System.out.println("You have won");
				System.out.println("The word is: " + word);
				running = false;
			}
		} else if (!isCorrect){
			triesRemaining--;

			if (triesRemaining == 0) {
				System.out.println("You lost");
				running = false;
			}
		}

	}

	private void getUserInput() {
		System.out.println();

		System.out.println("Please enter your guess: ");
		String userInput = scanner.nextLine();

		lastGuess = userInput.charAt(0);

	}

	public void displayWord() {
		System.out.println("Attempts remaining: " + triesRemaining);

		System.out.println(word);
	}

	public void close() {
		scanner.close();
	}
}
