package PPart12Overloading;

public class Person {
	
	/*
	 * You can create multiple person()
	 * One with constructor and one without.
	 */
	String name;
	int age;
	
	public Person() {
		this("Eugene", 24);
		System.out.println("No parameter constructor");
	}
	
	public Person(String name) {
		this(24);
		
		System.out.println("Person with constructor name");
	}
	
	public Person(int age) {
		this("Eugene", 24);
		
		System.out.println("Person with constructor age");
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		
		System.out.println("Main constructor");
	}
	
	
	public String toString() {
		return name + " " + age;
	}
}
