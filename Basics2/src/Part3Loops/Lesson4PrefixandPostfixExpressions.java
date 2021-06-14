package Part3Loops;

public class Lesson4PrefixandPostfixExpressions {
	public static void main(String[] args) {
		
		int otters = 5;
		int giraffes = 10;
		int elephants = 3;
		
		int animals = otters++ + otters;
		int animals2 = --elephants + ++otters + giraffes++ + elephants;
		
		System.out.printf("Otters: %d\nGiraffes: %d\nElephants:%d\n", otters, giraffes, elephants);
		System.out.printf("New value of Otters: %d\n", animals);
		System.out.printf("Value of animals is: %d\n", animals2);
		System.out.printf("New value of Otters: %d\n", otters);
		
	}
}
