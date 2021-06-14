package Part4Arrays;

public class Lesson6MultidimensionalArrays {
	public static void main(String[] args) {

		String[][] names = { { "Eugene", "Symone", "Reyes" }, { "Eidel", "Weiss", "Gascon" }, { "Bryan", "John", "Lontoc" } };

		System.out.println("First iteration.........");
		for (int i = 0; i < names.length; i++) {
			String[] nameArray = names[i];

			for (int j = 0; j < nameArray.length; j++) {
				System.out.printf("%s \t", nameArray[j]);
			}
			System.out.println();
		}
		
		System.out.println();
		
		System.out.println("Second iteration........");
		for (int k = 0; k < names.length;k++ ) {
			for(int l = 0; l < names[k].length; l++) {
				System.out.printf("%s \t",names[k][l]);
			}

		System.out.println();
		}
		
		System.out.println();
		
		System.out.println("Third iteration.........");
		for (int a = 0; a < names.length; a++) {
			String[] namesArray = names[a];
			
			for (int b = 0; b < namesArray.length; b++) {
				System.out.printf("%s \t",namesArray[b]);
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Fourth iteration.........");
		for (int c = 0; c < names.length; c++) {
			for(int d = 0; d < names[c].length; d++) {
				System.out.printf("%s \t", names[c][d]);
			}
		System.out.println();
		}

	}
}
