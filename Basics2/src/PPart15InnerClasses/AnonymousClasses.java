package PPart15InnerClasses;

public class AnonymousClasses {

	private String name = "Joe";

	public static void main(String[] args) {
		
		new AnonymousClasses().start();
	}
	
	public void start() {
		Runnable runner = new Runnable() {
			public void run() {
				System.out.println(name);
			}
		};
		
		activate(runner);
		
		//Shortened version
		activate(new Runnable() {
			public void run() {
				System.out.println(name);
			}
		});
	}
	
	public void activate(Runnable action) {
		action.run();
	}
}
