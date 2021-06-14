package Part3Loops;

import java.util.stream.IntStream;

public class NewLesson26IntStream {

	public static void main(String[] args) {
		IntStream.range(0, 5).forEach(i ->{
			System.out.println(i);
		});
		
		IntStream.range(5, 10).forEach(i -> {
			System.out.println(i);
		});
		
		IntStream.range(10, 15).forEach(i -> {
			System.out.println(i);
		} );
		
		IntStream.range(15, 20).forEach(i -> {
			System.out.println(i);
		});
		
		IntStream.range(20, 26).forEach(i -> {
			System.out.println(i);
		});
		
		IntStream.range(26, 33).forEach(i -> {
			System.out.println(i);
		});
		
		IntStream.range(33, 74).forEach(i -> {
			System.out.println(i);
		});
		
		IntStream.range(74, 101).forEach(i -> {
			System.out.println(i);
		});
	}
}
