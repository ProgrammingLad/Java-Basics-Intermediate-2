package PPPart26LambaExpression;

import java.util.ArrayList;
import java.util.List;

public class Part7FilteringListStrings {

	public static void main(String[] args) {

		List<String> people = new ArrayList<>();
		people.add("Eugene");
		people.add("Bryan");
		people.add("Kenneth");
		people.add("Ed");
		people.add("April");

		people.forEach(e -> {
			System.out.println(e);
		});
		System.out.println();

		people.removeIf((name) -> name.equals("April"));

		System.out.println("Now removing April from the list.........");
		people.forEach(e -> {
			System.out.println(e);
		});
		System.out.println();
		
		people.removeIf(name -> name.length() <= 2);
		
		System.out.println("Now removing names with 2 or less letters");
		people.forEach(e -> System.out.println(e));

	}
}
