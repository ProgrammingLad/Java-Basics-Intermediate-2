package PPPart24JavaCollections;

import java.util.ArrayList;
import java.util.Collections;

class Person implements Comparable<Person> {
	
	private String name;
	private Integer age;
	public Person(String name, Integer age) {
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return name + ' ' + age;
	}
	
	public int compareTo(Person person) {
		
		/*
		 * If person has same name
		 * Compare age and print out youngest to oldest
		 */
		if(name.equals(person.name)) {
			return age.compareTo(person.age);
		}
		
	return name.compareTo(person.name);
	}
	
	
}
public class Part2CustomObjectsinArray {

	public static void main(String[] args) {
		
		ArrayList<Person> people = new ArrayList<>();
		
		people.add(new Person("Eugene", 32));
		people.add(new Person("Eugene", 19));
		people.add(new Person("Bryan", 49));
		people.add(new Person("Bryan", 29));
		people.add(new Person("Bryan", 46));
		people.add(new Person("Jester", 37));
		people.add(new Person("Kenneth", 36));
		
		people.forEach(System.out::println);
		
		//This will replace Jester with April.
		people.set(5, new Person("April", 39));
		
		Collections.sort(people);
		
		System.out.println();
		System.out.println("Now displaying updated list with April and sorted & compare age......");
		people.forEach(e -> {
			System.out.println(e);
		});
	}
	
	
}
