package Part4Arrays;

public class Lesson9MultiplicationTableExercise {

	public static void main(String[] args) {
		
		int[][] multiplicationTable = new int [12][12];
		
		for (int i = 0; i < multiplicationTable.length; i++) {
			for (int j = 0; j < multiplicationTable[i].length; j++) {
				multiplicationTable[i][j] = (i + 1) * (j + 1);
			} 
		}
		
		for(int[] array: multiplicationTable) {
			for(int number: array) {
				System.out.printf("%5d", number);
			}
			System.out.println();
		}
		
	}
}
