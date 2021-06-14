package Part3Loops;

import java.util.ArrayList;

public class MoreLesson14StringEquals {
	public static void main(String[] args) {
		
		ArrayList<String> text1 = new ArrayList<String>();
		text1.add("Eugene");
		
		ArrayList<String> text2 = new ArrayList<String>();
		text2.add("Eugene");
		
		/*
		 * Use .equals to compare String
		 * Use == to compare int
		 */
		System.out.println(text1 == text2);
		System.out.println(text1.equals(text2));
	}
}
