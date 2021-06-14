package Part3Loops;

public class MoreLesson19NotOperator {

	public static void main(String[] args) {

		/*
		 * This Reverses what's inside the ( ) Example (5 < 9) is TRUE (!(TRUE))
		 * (FALSE(true)) = FALSE
		 */
		System.out.println(!(5 == 9));

		int value1 = 4;
		int value2 = 3;

		if (value1 != value2) {
			System.out.println("Values are not equal");
		}

		String name1 = "Eugene";
		String name2 = "Symone";

		if (name1.equals(name2)) {
			System.out.println("They have the same name");
		} else if (!name1.equals(name2)) {
			System.out.println("They don't the same name");
		}

		System.out.println(name1.equals(name2));
		System.out.println(name1.equals(name2) == true);
		System.out.println(name1.equals(name2) != false);
	}
}
