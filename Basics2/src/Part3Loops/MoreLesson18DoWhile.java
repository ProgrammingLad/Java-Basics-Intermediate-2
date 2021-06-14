package Part3Loops;

public class MoreLesson18DoWhile {

	public static void main(String[] args) {

		int count = 0;

		System.out.println("Now running first loop......");
		do {
			System.out.printf("Count: %d\n", count);
		} while (count++ < 5);

		System.out.println();

		System.out.println("Now running second loop......");
		
		count = 0;
		do {
			System.out.printf("Count: %d\n", count);
		} while (count++ < 10);
	}
}
