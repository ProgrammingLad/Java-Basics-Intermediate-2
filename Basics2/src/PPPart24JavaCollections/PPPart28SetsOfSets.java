package PPPart24JavaCollections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class PPPart28SetsOfSets {
	
	public static void main(String[] args) {
		
		/*
		 * Create a set of anything
		 * Then add it inside a set
		 * 
		 * Then Add items to the list
		 */
		Set<Set<String>> setsOfSets = new HashSet<>();
		
		Set<String> schoolItems = new TreeSet<>();
		
		schoolItems.add("Books");
		schoolItems.add("Bag");
		schoolItems.add("Pencil");
		schoolItems.add("Crayons");
		
		setsOfSets.add(schoolItems);
		
		for(var item: setsOfSets) {
			System.out.println(item);
		}
		
		schoolItems.add("Ruler");
		
		for(var item: setsOfSets) {
			System.out.println(item);
		}
	}
	
}
