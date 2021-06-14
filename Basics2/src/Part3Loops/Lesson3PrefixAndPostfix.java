package Part3Loops;

public class Lesson3PrefixAndPostfix {

	public static void main(String[] args) {

		int count1 = 5;
		int count2 = 2;

		/*
		 * DOES NOTHING AS IT ADDS 1 after 5 5++ Should be ++5
		 */

		System.out.println(count1++);

		// ++ from previous statement ++ ++5 = 7
		// (1 + 1) + 5 = 7
		System.out.println(++count1);

		// (1+ (1 + (5+1) ) + 2 = 10
		System.out.println(++count1 + count2);
		System.out.println("Done with first examples.........");
		System.out.println();

		int count3 = 1;
		int count4 = 6;
		
		// count3 = 2 because ++ is added BEFORE count3
		System.out.println(++count3);
		/*
		 * count3 = 6 because ++ is added after 6 Important!!: The next time we call
		 * count, it will be 7 SINCE: It has count++
		 */
		System.out.println(count4++);

		// 2 + 7
		System.out.println(count3 + count4);

	}
}
