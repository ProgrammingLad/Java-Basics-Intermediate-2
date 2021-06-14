package PPart19MoreBasicTypes;

public class PrimiteTypes {

	public static void main(String[] args) {
		
		/*
		 * boolean 	Boolean
		 * char 	Character
		 * 
		 * byte 	Byte
		 * short 	Short
		 * int 		Integer
		 * long 	Long
		 * 
		 * float 	Float
		 * double 	Double
		 * 
		 */
		
		
		Integer intValue1 = 128;
		Integer intValue2 = 128;
		
		/*
		 * Take away:
		 * Do not USE == if comparing non primitive types
		 * Always use .equals
		 */
		System.out.println(intValue1 == intValue2);
		System.out.println(intValue1.equals(intValue2));
		
		int[] numbers = {1,5,9,23};
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		for(int number: numbers) {
			max = number > max ? number : max;
		}
		
		for(int number: numbers) {
			min = number < min ? number: min;
		}
		
		System.out.println(max);
		System.out.println(min);
		
		/*
		 * If we want to convert String to int
		 * We use Integer.parseInt
		 * If we try to convert a string thats not a number
		 * For example: Integer.parseInt("SixetyNine")
		 * It will provide us an exception error
		 */
		int intValue = Integer.parseInt("60");
		System.out.println(intValue);
		
		String binString = String.format("%8s", Integer.toBinaryString(11)).replace(' ', '0');
		System.out.println(binString);
		

	}
}
