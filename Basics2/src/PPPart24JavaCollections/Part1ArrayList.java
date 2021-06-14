package PPPart24JavaCollections;

import java.util.ArrayList;

public class Part1ArrayList {
	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(2);
		list.add(3);
		list.add(0);
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2) + "\n");
		
		/*
		 * Different ways of iterating through the list
		 */
		
		for(int i = 0; i < list.size(); i++) {
			Integer n = list.get(i);
			System.out.println(i + ": " + n);
			
		}
		
		System.out.println();
		
		for(Integer number: list) {
			System.out.println(number);
		}
		
		System.out.println();
		
		list.forEach(System.out::println);
		
		System.out.println();
		
		list.forEach(e -> {
			System.out.println(e);
		});
		
		
		
	}
}
