package PPart19MoreBasicTypes;

public class IntegerTypes {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		/*
		 * Max values per Integer types
		 * 
		 */
		byte byteValue = 127; 
		short shortValue = 32767;
		int intValue = 423434;
		long longValue = 32324124124L;
		
		float floatValue = 23.70f;
		double doubleValue = 2333.33;
		/*
		 * How to find out min/max value of Integer types
		 */
		System.out.printf("Byte is %d bytes; min: %d, max %d\n", Byte.SIZE/8, Byte.MIN_VALUE, Byte.MAX_VALUE);
		System.out.printf("Short is %d bytes; min: %d, max %d\n", Short.SIZE/8, Short.MIN_VALUE, Short.MAX_VALUE);
		System.out.printf("Integer is %d bytes; min: %d, max %d\n", Integer.SIZE/8, Integer.MIN_VALUE, Integer.MAX_VALUE);
		System.out.printf("Long is %d nytes; min: %d, max %d\n", Long.SIZE/8, Long.MIN_VALUE, Long.MAX_VALUE);
	
		System.out.println("Float contains: " + Float.SIZE/8 + " bytes");
		System.out.println("Double countains: " + Double.SIZE/8 + " bytes");
		
		float example = 1.23456789123f;
		System.out.printf("%.15f\n", example);
		
		double example1 = 1.234567891234;
		System.out.printf("%.20f\n", example1);
	}
}
