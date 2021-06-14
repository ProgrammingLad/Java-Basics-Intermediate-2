package Part3Loops;

public class Lesson2IncrementAndDecrement {
	
	public static void main(String[] args) {
		int count = 0;
		System.out.println(count);
		
		count = count +2;
		System.out.println(count);
		
		count += 2;
		System.out.println(count);
		
		count++; 
		System.out.println(count);
		
		++count;
		System.out.println(count);
		
		count = count -2;
		System.out.println(count);
		
		count -= 2;
		System.out.println(count);
		
		count--;
		System.out.println(count);
		
		--count;
		System.out.println(count);
		
		System.out.println();
		System.out.println("Starting loop........");
		while(count < 10) {
			System.out.println(count);
			++count;
		}
		
	}
}
