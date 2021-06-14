package PPPart24JavaCollections;

import java.util.LinkedHashSet;
import java.util.Set;

public class PPart18LinkedHashSet {

	public static void main(String[] args) {

		/*
		 * Linked hashset retains the position of the items
		 * In exactly the order you put the items in
		 */
		Set<String> fruits = new LinkedHashSet<>();

		fruits.add("apple");
		fruits.add("cherry");
		fruits.add("watermelon");
		fruits.add("banana");
		fruits.add("strawberry");

		for (String fruit : fruits) {
			System.out.println(fruit);
		}

	}
}
