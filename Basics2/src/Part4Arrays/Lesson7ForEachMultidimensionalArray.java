package Part4Arrays;

public class Lesson7ForEachMultidimensionalArray {

	public static void main(String[] args) {
		
		String[][] names = {
				{"Eugene", "Symone", "Reyes"},
				{"Eugene", "Symone", "Reyes"},
				{"Eugene", "Symone", "Reyes"}
		};
		
		for(String[] name:names) {
			for(String subArray: name) {
				System.out.printf("%s \t", subArray);
			}
			System.out.println();
		}
	}
}
