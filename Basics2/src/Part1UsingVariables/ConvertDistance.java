package Part1UsingVariables;

public class ConvertDistance {
	
	public static void main(String[] args) {
		
		/*
		 * Check Meters to KM
		 * Question: How many Meters are there in (X) Kilometers?
		 * Play with Kilometers value
		 */
		int kilometer = 9;
		int meter = 1;
		int convertMtoKM = (meter * kilometer) * 1000;
		
		System.out.println("Question 1: How many Meters are there in Kilometers");
		System.out.println("1. " + convertMtoKM + " meters is " + kilometer + " kilometers");
		System.out.println();
		
		/*
		 * Check KM to M
		 * Question: How many Kilometers are there in (X) Meters?
		 * Play with M value
		 */
		int meter1 = 50000;
		int kilometer1 = 1 * 1000;
		int meterTimeskilometer1 = meter1 / kilometer1;
		System.out.println("Question 2: How many Kilometers are there in Meters");
		System.out.println("2. " + meterTimeskilometer1 + " kilometers is " + meter1 + " meters");
	}
}
