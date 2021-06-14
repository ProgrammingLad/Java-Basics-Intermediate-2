package Part4Arrays;

public class Lesson2IteratingThroughArrays {

	public static void main(String[] args) {

		int[] numbers = {2, 5, 8}; 
		String[] names = {"Eugene", "Symone"};
		
		
		/*
		for(Integer number: numbers){
			System.out.println(number);
		}
		System.out.println();
		
		
		for(String name: names) {
			System.out.println(name);
			*/
		System.out.println("Iterating through Integer array.....");
		
		for (int j = 0; j < numbers.length;j++) {
			System.out.printf("%d. %d \n", j , numbers[j]);
		}
			
		System.out.println();
		
		System.out.println("Iterating through String array.....");
		
		for(int i = 0; i < names.length; i++) {
			System.out.printf("%d. %s \n", i, names[i]);
		}
		
		
		
	}
}
