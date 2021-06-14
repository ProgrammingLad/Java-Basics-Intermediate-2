package PPPart24JavaCollections;

public class Part8StaticMethodsinList implements Part8Interface {

	public static void main(String[] args) {
		
		System.out.println("Now displaying Part8Interface.....");
		Part8Interface.run();
		System.out.println();
		
		System.out.println("Now displaying instance variable & public void running....");
		new Part8StaticMethodsinList().running("running");
		System.out.println();
	
		new Part8StaticMethodsinList().runningAgain(69, 2, "running1", "running2", "running3", "running4");
	}
	
	
	
	public void running(String text) {
		System.out.println(text);
	}
	
	/*
	 * The ... after String makes it somewhat an array
	 * So you have to loop through it to iterate texts in array
	 * 
	 * If we are going to add any other parameter in constructor
	 * Example: int value, int whatever
	 * that method always NEEDS always come first
	 * If we try to add another parameter AFTER String... texts
	 * It will have an error
	 * 
	 * String... texts ALWAYS NEEDS to be last
	 * Thats the rules.
	 */
	public void runningAgain(int value, int whatever,String... texts) {
		for(String t: texts) {
			System.out.println(t);
		}
	}
}
