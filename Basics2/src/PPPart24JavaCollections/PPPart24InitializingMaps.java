package PPPart24JavaCollections;

import java.util.HashMap;
import java.util.Map;

import static java.util.Map.entry;

public class PPPart24InitializingMaps {

	public static void main(String[] args) {

		// @formatter:off
		HashMap<String, String> months = new HashMap<>(Map.ofEntries(
				entry("1", "January"),
				entry("2", "February"),
				entry("3", "March"),
				entry("4", "April")
		));
		
		// @formatter:on
		
		months.forEach((k, v) ->{
			System.out.println(k + ": " + v);
		});
		
		System.out.println();
		
		var it = months.entrySet().iterator();
		
		while(it.hasNext()) {
			var entry = it.next();
			
			var k = entry.getKey();
			var v = entry.getValue();
			
			System.out.println(k + ": " + v);
		}
		
		System.out.println();
		
		for(var entry: months.entrySet()) {
			var k = entry.getKey();
			var v = entry.getValue();
			
			System.out.println(k + ": " + v);
		}
		
	}
}
