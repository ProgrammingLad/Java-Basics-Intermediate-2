package Part3Loops;

public class Lesson8BooleanEquality {
	
	public static void main(String[] args) {
		
		String name1 = "Eugene";
		String name2 = "Eugene";
		
		int j = 10;
		int i = 5;
		
		System.out.printf("Does name1 and name2 contain the same value: %b\n", name1 == name2);
		
		System.out.printf("Are both numbers equal? %b\n", j > i); 
		
		System.out.printf("Is j greater than i? %b\n", j > i);
	}
}
