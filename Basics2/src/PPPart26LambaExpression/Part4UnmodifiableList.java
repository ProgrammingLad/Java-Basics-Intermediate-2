package PPPart26LambaExpression;

import java.util.List;

public class Part4UnmodifiableList {

	public static void main(String[] args) {
		
		People people = new People();
		
		List<String> listOfPeople = people.getPeople();
		listOfPeople.forEach(System.out::println);
		System.out.println();
		
		/*
		 * Check People.java
		 * We have declared under People() 
		 * that people is unmodifiable list.
		 */
		System.out.println("Now removing Marc from the list....");
		listOfPeople.remove(1);
		listOfPeople.forEach(System.out::println);
		
		
	}
}
