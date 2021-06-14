package PPPart24JavaCollections;

import java.util.HashMap;

public class PPPart22HashMaps {

	public static void main(String[] args) {
		
		HashMap<Integer, String> people = new HashMap<>();
		
		/*
		 * HashMap is used to look up things
		 * Very fast
		 * 
		 * You can't have two items in a Map with the same key
		 */
		people.put(0, "Eugene");
		people.put(9, "Kenneth");
		people.put(4, "Bryan");
		people.put(7, "John");
		people.put(2, "Edjester");
		
		System.out.println(people.get(4));
		
		people.forEach((k, v) ->{
			System.out.println(k + ": " + v);
		});
		
		
	}
}
