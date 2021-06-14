package Part5Methods;

public class Lesson6Calculator {

	public static void main(String[] args) {

		Lesson6CalculatorClass calculator = new Lesson6CalculatorClass(); 
		
		System.out.println("Squaring....");
		int squared = calculator.squared(8);
		System.out.println(squared);
		
		System.out.println();
		System.out.println("Adding....");
		int addition = calculator.add(10,5);
		System.out.println(addition);
		
		System.out.println();
		System.out.println("Subtracting....");
		int subtraction = calculator.minus(37, 17);
		System.out.println(subtraction);
		
		System.out.println();
		System.out.println("Multiplying....");
		int multiply = calculator.multiply(10, 10);
		System.out.println(multiply);
		
		System.out.println();
		System.out.println("Dividing....");
		int divide = calculator.divide(100, 10);
		System.out.println(divide);
	}

}
