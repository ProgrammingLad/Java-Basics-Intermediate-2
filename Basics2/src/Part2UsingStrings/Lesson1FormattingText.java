package Part2UsingStrings;

public class Lesson1FormattingText {
	public static void main(String[] args) {
		
		String text = "Can you seperate me from the other line? \nI mean this line";
		System.out.println(text);
		System.out.println();
		System.out.println("Next exercise........");
		
		/*
		 * Output this using one line:
		 * 		Select an option:
		 * 				1. Add an entry
		 * 				2. View the database
		 * 				3. Exit
		 */
		String text1 = "\tSelect an option:\n\t\t1. Add an Entry\n\t\t2. View the database \n\t\t3. Exit";
		System.out.println(text1);
	}	
}
