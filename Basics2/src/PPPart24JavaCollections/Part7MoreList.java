package PPPart24JavaCollections;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Part7MoreList {
	
	public static void main(String[] args) {
		
		List<Integer> list1 = new ArrayList<Integer>(List.of(15,6,75));
		Collections.sort(list1);
		/*
		 * One way of copying items from one list to another
		 * By passing it as a constructor
		 */
		//List<Integer> list2 = new ArrayList<Integer>(list1);

		/*
		 * Another way of passing items from one list to another
		 * By using: addAll method
		 */
		List<Integer> list2 = new ArrayList<>();
		list2.add(69);
		list2.addAll(list1);
		
		System.out.println("Iterating through list1....");
		list1.forEach(e -> {
			System.out.println(e);
		});
		
		System.out.println();
		System.out.println("Iterating through list2.....");
		list2.forEach(System.out::println);
		
	}
}
