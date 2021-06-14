package Part1UsingVariables;

public class DebuggingTips {

	public static void main(String[] args) {
		/*
		 * Always do sysout and put numbers infront to check output of every line
		 * Good debugging practice
		 */
		
		int dogs = 8;
		int cats = 3;
		
		
		System.out.println("1. Dogs: " + dogs);
		System.out.println("1. Cats: " + cats);

		dogs = cats;
		cats = 10;
		System.out.println();
		System.out.println("2. Dogs: " + dogs);
		System.out.println("2. Cats: " + cats);
	}
}
