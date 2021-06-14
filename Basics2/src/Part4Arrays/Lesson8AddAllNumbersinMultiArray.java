package Part4Arrays;

/*
 *1. Create a multidimensional array of int
 *2. Make it 3 x 3
 *3. Loop through it and output all the values on the diagonal
 *4. from top left to bottom right
 *5. Add up these values and print the total
*/
public class Lesson8AddAllNumbersinMultiArray {

	public static void main(String[] args) {
	
		int[][] numbers = {
				{5, 10, 15},
				{2, 4, 6},
				{4, 8, 12}
		};
		
		int count = 0;
		
		System.out.println("Displaying all numbers in Multidimensionalarrays.....");
		for (int i = 0; i < 1; i++) {
			for(int j = 0; j < 1 ; j++) {
				System.out.printf("%d \n",numbers[i][j]);
				count += numbers[i][j];
			}
		}
		
		for (int a = 1; a < 2; a++) {
			for (int b = 1; b < 2; b++) {
				System.out.printf("%d \n", numbers[a][b]);
				count += numbers[a][b];
			}
		}
		
		for (int c = 2; c < 3; c++) {
			for (int d = 2; d < 3; d++) {
				System.out.printf("%d \n", numbers[c][d]);
				count += numbers[c][d];
			}
		}
		
		System.out.println();
		System.out.printf("Total value of all these numbers are: %d\n", count);
		
		//Supposed to output 8
		for (int z = 2; z < 3; z++) {
			for (int d = 1; d < 2; d++) {
				System.out.printf("%d \n", numbers[z][d]);
			}
		}
		
		
	}
}
