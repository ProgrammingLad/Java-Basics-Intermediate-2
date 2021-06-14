package Part2UsingStrings;

public class Lesson2FormatSpecifiers {
		
		public static void main(String[] args) {
			
			/*
			 * for format specifiers:
			 * use %d if it has NO DECIMAL and %f if it has DECIMAL
			 */
			
			/*
			 * This method is used so you can supply arguments inside a string
			 * Example: ("%d %d", argument1, argument 2)
			 * Instead of doing (" " + " " + " ");
			 */
			int fahrenheit1 = 101;
			int celsius1 = (fahrenheit1 - 32) * 5 / 9;
			System.out.printf("1. %d degrees fahrenheit is %d degrees celsius", fahrenheit1, celsius1);
			
			System.out.println();
			System.out.println();
			System.out.println("Now displaying exact conversion with decimal...........");
			
			int fahrenheit2 = 101;
			double celsius2 = (fahrenheit2 - 32) * 5.0 / 9;
			System.out.printf("2. %d degrees fahrenheit is  %.2f degrees celsius", fahrenheit2, celsius2);
			
				
		}
	}