package PPPart24JavaCollections;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class Part6LinkedList {
	
	public static void main(String[] args) {
		
		LinkedList<String> texts = new LinkedList<>();
		
		texts.add("Eugene");
		texts.add("Bry");
		texts.add("Kenneth");
		texts.add("Ed");
		texts.add("Jeungardo");
		
		Collections.sort(texts, new Comparator<String>() {
			public int compare(String o1, String o2) {
				int value1 = o1.length();
				int value2 = o2.length();
				
				if(value1 > value2) {
					return 1;
				} else if (value1 < value2){
					return -1;
				}
			return 0;
			}

		});
		
		texts.forEach(e ->{
			System.out.println(e);
		});
		
	}	
}
