package Part4Arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Lesson3IteratingIntStream {

	public static void main(String[] args) {
		
		System.out.println("Names inside array string......");
		String[] names = {"Eugene", "Symone", "Reyes"};
		
		Arrays.stream(names).forEach(name -> {
			System.out.println(name);
		});
		System.out.println();
		
		System.out.println("Animals inside array string.....");
		String[] animals = {"Dog", "Cat", "Parrot"};
		
		Arrays.stream(animals).forEach(animal -> {
			System.out.println(animal);
		});
		System.out.println();
		
		//DESIRED OUTPUT = Hello There
		String[] names2 = {"Eugene", "Symone", "Reyes", "Hello", "There"};
		
		IntStream.range(3, 5).forEach(i -> {
			System.out.println(names2[i]);
		});
		
		System.out.println();
		
		//ITERATE THROUGH THE WHOLE THING
		int[] numbers = {3, 5, 7};
		
		IntStream.range(0, 3).forEach(i -> {
			System.out.println(numbers[i]);
		});
		
		System.out.println();
		//DESIRED OUTPUT = 7
		int count = 1;
		int count2 = 2;
		
		int[] numbers2 = {3, 5, 7};
		
		IntStream.range(count, count2).forEach(i ->{
			System.out.println(numbers2[i]);
		});
		
		
		
	}
}
