package PPPart26LambaExpression;

import java.util.ArrayList;
import java.util.List;

public class Part6FilteringList {

	public static void main(String[] args) {

		List<Integer> numbers = new ArrayList<>(List.of(4, 1, 8, 5, 12));
		
		numbers.add(3);
		
		//Removes all numbers less than 6
		numbers.removeIf((n) -> {
			return n < 6;
		});
		
		//Simple way of writing it
		//numbers.removeIf(n -> n < 6);
		
		numbers.forEach(e -> System.out.println(e));
		
	}
}
