package PPPart24JavaCollections;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class PPPart21SetExercise {
	/*
	 * Compare Book1 and Book2
	 * 
	 * How many *unique* words are in each of these texts?
	 * 
	 * What words are only found in 1984? 
	 * What words are only found in Animal Farm?
	 * Print these out.
	 * 
	 * Print a list of all words that are found in both texts, sorted in
	 * alphabetical order
	 */

	public static void main(String[] args) {
		
		File fileBook1 = new File("Book1.txt");
		File fileBook2 = new File("Book2.txt");
		
		Set<String> wordsInBook1 = addWords(fileBook1);
		Set<String> wordsInBook2 = addWords(fileBook2);
		
		System.out.println("Number of words in Book 1: " + wordsInBook1.size());
		System.out.println("Number of words in Book 2: " + wordsInBook2.size());
		
		TreeSet<String> difference = new TreeSet<>(wordsInBook1);
		difference.removeAll(wordsInBook2);
		System.out.println("Number of words in book 1 that's not in book 2: " + difference.size());
		displayWords(difference);
		
		System.out.println("\n");
		
		TreeSet<String> intersection = new TreeSet<>(wordsInBook1);
		intersection.retainAll(wordsInBook2);
		System.out.println("Number of words that are in book 1 that is also in book 2: " + intersection.size());
		displayWords(intersection);
	}
	
	public static void displayWords(Set<String> words) {
		
		int numberOfWordInLine = 0;
		
		for(String word: words) {
			System.out.printf("%-15s ", word);
			
			if(++numberOfWordInLine % 10 == 0) {
				System.out.println();
			}
		}
		
		}
	
	private static SortedSet<String> addWords(File file){
		
		TreeSet<String> wordSet = new TreeSet<>();
		
		try(BufferedReader br = new BufferedReader(new FileReader(file))){
			
			String line;
			while((line = br.readLine()) != null) {
				String[] words = line.split("[^a-zA-Z]+");
				
				for(String word: words) {
					
					if(word.length() > 1) {
					wordSet.add(word.toLowerCase());
					}
				}
			}
		}
		catch(FileNotFoundException e) {
			System.out.println("Could not locate file: " + file);
		}
		catch(IOException e) {
			System.out.println("Could not read file: " + file);
		}
		
		return wordSet;
	}
}
