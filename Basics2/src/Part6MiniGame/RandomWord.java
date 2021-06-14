package Part6MiniGame;

import java.util.Random;

public class RandomWord {

	private String[] words = { "Eugene", "Abram", "Bryan", "Kenneth", "April" };
	
	private String chosenWord;
	Random random = new Random();
	private char[] characters;

	public RandomWord() {

		chosenWord = words[random.nextInt(words.length)];
		characters = new char[chosenWord.length()];
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();

		for (char character : characters) {
			sb = character == '\u0000' ? sb.append("_") : sb.append(character);
			sb.append(" ");
		}

		return sb.toString();
	}


	public boolean isComplete() {
		
		for (char character : characters) {
			if (character == '\u0000') {
				return false;
			}
		}
		return true;
	}


	public boolean guess(char c) {

		boolean correct = false;

		for (int i = 0; i < chosenWord.length(); i++) {
			if (c == chosenWord.charAt(i)) {
				characters[i] = c;
				correct = true;
			}
		}

		return correct;
	}
}
