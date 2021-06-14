package PPPart26LambaExpression;

import java.util.ArrayList;
import java.util.List;

public class PPart10Exercise {

		// Remove all items outside the range 0-10
		// Add 100 to each item
		// Display the resulting list
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>(List.of(1, 5, 9, 1000, 3, 6, -20, 4));
		
		list.removeIf(n -> n > 10 || n < 0);
		list.replaceAll(n -> n + 100);
		
		list.forEach(System.out::println);
	}
}
