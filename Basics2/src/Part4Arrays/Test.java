package Part4Arrays;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		int[][] table = new int [12][12];
		
		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table[i].length; j++) {
				table[i][j] = (i+1) * (j+1);
			}
		}
		
		for (int[] array: table) {
			for (int number: array) {
				System.out.printf("%4d", number);
			}
			System.out.println();
		}
		
	}
}
