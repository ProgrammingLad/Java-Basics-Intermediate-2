package Part3Loops;

public class NewLesson24CaseInsensitivity {
	public static void main(String[] args) {
		String name = "Joe";
		
		System.out.println("1. My name is Joe");
		
		if(name.equalsIgnoreCase("JOE")) {
			System.out.println("2. My name is Joe");
		}
		
		System.out.printf("3. Number of characters in '%s' is %d\n", name, name.length());
	}
}
