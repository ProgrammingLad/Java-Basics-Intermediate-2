package Part3Loops;

public class MoreLesson16Break {
	
	public static void main(String[] args) {
		
		/*
		 * Break can be used to break out of the LOOP
		 * Instead of declaring while(count1 < 10)
		 * We put an if statement and use break
		 */
		int count1 = 0;
		int count2 = -10;

		while (true) {
			if (count1 == 10) {
				break;
			}
			count1++;
			System.out.println(count1);
		}
		
		System.out.println();
		
		while (true) {
			if (count2 == 0) {
				break;
			}
			System.out.println(count2);
			count2++;
		}

	}
}
