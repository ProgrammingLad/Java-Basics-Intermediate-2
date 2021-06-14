package PPPart24JavaCollections;

import java.util.ArrayList;
import java.util.Collections;

public class Part3SortingList {

	public static void main(String[] args) {
		
		ArrayList<Double> numbers = new ArrayList<>();
		
		numbers.add(69.2);
		numbers.add(101.20);
		numbers.add(101.21);
		numbers.add(10.2);
		
		numbers.forEach(System.out::println);
		System.out.println();
		
		Collections.sort(numbers);
		
		System.out.println("Now displaying sorted numbers....");
		numbers.forEach(e -> {
			System.out.println(e);
		});
	}
}
