package PPPart24JavaCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class PPart13Iterators {

	public static void main(String[] args) {

		var<Integer> numbers = new ArrayList<Integer>(List.of(10, 5, 20, 15, 14));

		System.out.println("Current list.....");
		for (Integer number : numbers) {
			System.out.println(number);
		}
		System.out.println();

		var it = numbers.listIterator();

		while (it.hasNext()) {
			var numberChecker = it.next();

			if (numberChecker == 20) {
				System.out.println("Found 20, removing 20 from the list.....");
				it.remove();
			} else if (numberChecker == 15) {
				System.out.println("Found 15, now adding 16 to the list.....");
				it.add(16);
			} else if (numberChecker == 5) {
				System.out.println("Found 5, changing value from 5 to 50");
			}
		}
		
		System.out.println();
		System.out.println("Now displaying updated list.....");
		for(Integer number: numbers) {
			System.out.println(number);
		}
		System.out.println();
		
		Collections.sort(numbers);
		System.out.println("Now sorting number from least to greatest.....");
		numbers.forEach(System.out::println);
	}
}
