package PPart15InnerClasses;

public class FreestyleExercise implements Runnable {

	private String name = "Mickey Mouse";

	public static void main(String[] args) {
		
		FreestyleExercise m1 = new FreestyleExercise();
		m1.start();
	
	}
	
	public void start() {
	
		//first method
		//public void activate
		System.out.println("First method.");
		Runnable runner = new Runnable() {
			public void run() {
				System.out.println(name);
			}
		};
		
		activate(runner);
		
		
		System.out.println();
		System.out.println("Second method.");
		//Second method
		//public void activate
		activate(new Runnable() {
			public void run() {
				System.out.println(name);
			}
		});
		
		
		System.out.println();
		System.out.println("Third method.");
		//Third method
		//Inner class
		class Print implements Runnable{
			
			public void run() {
				System.out.println(name);
			}
		}
		
		new Print().run();
		
		System.out.println();
		System.out.println("Fourth method.");
		
		//Fourth method
		//FreestyleExercise implements Runnable
		activate(this);
	}
	
	
	public void activate(Runnable runnable) {
		runnable.run();
	}
	
	public void run() {
		System.out.println(name);
	}
	
}
