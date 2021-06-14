package PPPart24JavaCollections;

import java.util.TreeSet;

class Person2 implements Comparable<Person2>{
	private String name;
	
	public Person2(String name) {
		this.name = name;
	}
	
	public String toString(){
		return name;
	}

	@Override
	public int compareTo(Person2 person) {
		return name.compareTo(person.name);
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
		Person2 other = (Person2) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
}

public class PPart19TreeSet {

	public static void main(String[] args) {

		/*
		 * Important NOTE:
		 * If we are going to store an object
		 * ITS GOOD PRACTICE TO ALWAYS
		 * Implement hashcode and equals
		 */
		TreeSet<Person2> people = new TreeSet<>();
		
		people.add(new Person2("Eugene"));
		people.add(new Person2("Bryan"));
		people.add(new Person2("Ed"));
		people.add(new Person2("Kenneth"));
		people.add(new Person2("Jeungardo"));
		
		people.forEach(System.out::println);
	}
}
