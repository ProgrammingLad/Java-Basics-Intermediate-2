package PPPart24JavaCollections;

import java.util.HashSet;

public class PPart15HashSets {

	public static void main(String[] args) {
		
		/*
		 * SETS are used if you do not want 
		 * Any DUPLICATES inside set
		 * 
		 * Hashset also has a method to find whether 
		 * a value is inside your set
		 * See example below
		 * 
		 * Important note: Hash set order is not guaranteed if you print them out
		 */
		
		HashSet<String> fruits = new HashSet<>();	
		
		fruits.add("apple");
		fruits.add("watermelon");
		fruits.add("orange");
		fruits.add("banana");
		fruits.add("orange");
		
		System.out.println("finding for apple.......");
		System.out.println(fruits.contains("apple"));
		System.out.println();
		
		
		System.out.println("finding for fruit.... pear");
		if(fruits.contains("pear")) {
			System.out.println("We found the fruit");
		} else {
			System.out.println("Fruit not found");
		}
		
		System.out.println();
		
		for(var fruit: fruits) {
			System.out.println(fruit);
		}
	}
}
