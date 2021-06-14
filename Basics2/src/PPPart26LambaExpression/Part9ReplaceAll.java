package PPPart26LambaExpression;

import java.util.ArrayList;
import java.util.List;

public class Part9ReplaceAll {

	public static void main(String[] args) {
		
		List<Integer> numbers = new ArrayList<>(List.of(5, 10, 15, 20));
		
		numbers.replaceAll(n -> n*n);
		
		numbers.forEach(System.out::println);
		
		System.out.println();
		
		List<String> people = new ArrayList<>(List.of("Eugene", "Bryan", "Ed"));
		
		people.replaceAll(name -> "Hello " + name);
		people.forEach(System.out::println);
	}
}
