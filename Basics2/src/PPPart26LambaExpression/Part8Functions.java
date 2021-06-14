package PPPart26LambaExpression;

import java.util.function.UnaryOperator;

public class Part8Functions {

	public static void main(String[] args) {
		
		new Part8Functions().run();
	}

	public void run() {
		calculateAndPrint(7, n -> n + 7);
		calculateAndPrint(7, n -> 0);
	}
	
	protected void calculateAndPrint(int value, UnaryOperator<Integer> procedure) {
		
		int result = procedure.apply(value);
		
		System.out.println(result);
	}
		
}
