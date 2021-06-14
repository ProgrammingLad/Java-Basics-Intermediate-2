package PPart19MoreBasicTypes;

public class ModOperators {

	public static void main(String[] args) {
		
		int value1 = 123;
		int value2 = 10;
		
		System.out.println(value1/value2 + "\n");
		
		System.out.println((double)value1/value2 + "\n");
		
		System.out.println(value1 % value2 + "\n");
		
		for(int i = 0; i < 1_000; i++) {
			if(i % 100 == 0) {
				System.out.println("Processed " + i + " lines");
			}
		}

	}
}
