package Part4Arrays;

public class Lesson8Point1AlternateSolution {

	public static void main(String[] args) {
		
		int[][] numbers = {
				{5, 10, 15},
				{2, 4, 6},
				{4, 8, 12}
		};
		
		int total = 0;
		
		for (int i = 0; i < 3; i++) {
			System.out.println(numbers[i][i]);
			total += numbers[i][i];
		}
		
		System.out.println();
		System.out.printf("Sum of diagonal numbers are: %d",total);
	}
}
