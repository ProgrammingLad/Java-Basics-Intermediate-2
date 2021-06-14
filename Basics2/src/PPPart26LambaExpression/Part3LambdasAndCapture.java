package PPPart26LambaExpression;

@FunctionalInterface
interface Increment {
	void increase();
}

public class Part3LambdasAndCapture {

	private int value = 0;

	public static void main(String[] args) {
		
		new Part3LambdasAndCapture().runApp();
		
	}
	
	public void runApp() {
		
		Increment r = () -> {
			System.out.println(value++);
		};
		
		r.increase();
		r.increase();
	}

}
