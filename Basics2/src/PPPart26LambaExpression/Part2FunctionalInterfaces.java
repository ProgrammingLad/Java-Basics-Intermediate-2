package PPPart26LambaExpression;

@FunctionalInterface
interface Runner {
	void execute(String text);
}

@FunctionalInterface
interface Example {
	void execute();
}

@FunctionalInterface
interface Joiner {
	void join(String text1, String text2);
}

@FunctionalInterface
interface Greeting{
	String joining(String greeting, String name);
}

public class Part2FunctionalInterfaces {

	public static void main(String[] args) {

		/*
		 * If we have an interface without constructor We have to put () before output
		 */
		Example ex = () -> System.out.println("Hey");
		ex.execute();

		/*
		 * If we have an interface with constructor Put argument before output
		 */
		Runner run = text -> System.out.println(text);
		run.execute("Hello");

		running(run);
		
		/*
		 * Interface with two constructor
		 * Put the two arguments inside ()
		 */
		Joiner join = ((text1, text2)-> {
			System.out.println(text1 + " " + text2);
		});
		join.join("hey", "John");
		
		
		/*
		 * We have to return a string because
		 * joining argument in Greeting
		 * is a type of string
		 */
		Greeting joining = (greeting, name) -> {
			return greeting + " " + name;	
		};
		
		running2(joining);
		
		/*
		 * Basically the same thing, we just removed return method
		 */
		Greeting joining2 = (greeting, name) -> greeting + " " + name;
		
		running2(joining);
		
		
	}

	private static void running(Runner run) {
		run.execute("Hey");
	}
	
	private static void running2 (Greeting greet) {
		System.out.println(greet.joining("Hey", "Eugene"));
	}
}
