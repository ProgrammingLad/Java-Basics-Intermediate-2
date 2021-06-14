package PPPart24JavaCollections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/*
 * Use HashMap, LinkedHashMap, TreeMap
 * 
 * Make 'People' the key
 * 
 * Create a method that accepts a map, adds item to the map and prints the map.
 * 
 */
class People implements Comparable<People> {
	private String name;

	public People(String name) {
		this.name = name;
	}

	public String toString() {
		return name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		People other = (People) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public int compareTo(People people) {
		return name.compareTo(people.name);
	}
}

/*
 * 	Important NOTE!!!
 * 	Everytime we use MAPS or SETS
 * 	ALWAYS GENERATE HASHCODE AND EQUALS!!
 * 
 * 	The purpose of using MAPS or SETS is to avoid duplicates
 * 	Hashcode and Equals will eliminate any duplicates
 * 
 * 
 * 	Also: TreeMap implements Comparable
 * 	That is why we had to implement Comparable<People>
 * 	If we do not implement Comparable:
 * 	It will have a class cast exception BECAUSE
 * 
 * 	We are comparing CLASS which is class People
 * 	We cannot compare CLASS or OBJECTS
 * 	Without implementing Comparable & compareTo manually
 * 
 */
public class PPPart25IteratingthroughMaps {

	public static void main(String[] args) {
		
		System.out.println("Iterating through HashMap.....");
		Map<People, Integer> people1 = new HashMap<>();
		addPeople(people1);
		printPeople(people1);
		
		System.out.println();
		
		System.out.println("Iterating through LinkedHashMap.....");
		Map<People, Integer> people2 = new LinkedHashMap<>();
		addPeople(people2);
		printPeople(people2);
		
		System.out.println();
		
		System.out.println("Iterating through TreeMap.....");
		Map<People, Integer> people3 = new TreeMap<>();
		addPeople(people3);
		printPeople(people3);
		
	}
	
	public static void addPeople(Map<People, Integer> map) {
		
		map.put(new People("Eugene"), 24);
		map.put(new People("Bryan"), 29);
		map.put(new People("Kenneth"), 32);
		map.put(new People("Jeun"), 26);
	}
	
	public static void printPeople(Map<People, Integer> map) {
		
		map.forEach((k,v) ->{
			System.out.println("Name: " + k + " \tAge: " + v);
		});
	}
}
