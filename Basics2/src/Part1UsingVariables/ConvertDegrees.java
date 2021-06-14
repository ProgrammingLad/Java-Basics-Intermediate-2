package Part1UsingVariables;

public class ConvertDegrees {
	
	public static void main(String[] args) {
		
		/*
		 * If you want the decimal to be displayed as well
		 * Make sure to use double and put AT LEAST ONE DECIMAL at the equation
		 * Will automatically display output as double
		 * Example = 5.0
		 */
		int fahrenheit1 = 101;
		int celsius1 = (fahrenheit1 - 32) * 5 / 9;
		System.out.println("1. " + fahrenheit1 + " degrees fahrenheit is " + celsius1  + " degrees celsius");
		System.out.println();
		
		System.out.println("Now displaying exact conversion with decimal...........");
		int fahrenheit2 = 101;
		double celsius2 = (fahrenheit2 - 32) * 5.0 / 9;
		System.out.println("2. " + fahrenheit2 + " degrees fahrenheit is " + celsius2 + " degrees celsius" );
		
	}
}
