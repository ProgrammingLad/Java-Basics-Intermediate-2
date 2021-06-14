package Part3Loops;

public class Lesson7Boolean {
	
	public static void main(String[] args) {
		
		boolean SunnyDay = false;
		
		if(SunnyDay) {
			System.out.println("Its sunny day");
		}else {
			System.out.println("No its not sunny day");
		}
		
		System.out.println();
		boolean condition2 = 4 < 5;
		System.out.println("condition 2: " + condition2);
		
		int i = 10;
		int j = 11;
		
		boolean condition3 = i == j;
		System.out.println(condition3);
		
		String name1 = "Eugene";
		String name2 = "Eugene";
		
		boolean condition4 = name1.equals(name2);
		System.out.println(condition4);
	}
}
