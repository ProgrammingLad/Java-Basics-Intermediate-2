package PPPart24JavaCollections;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class PPPart27MapsOfList {

	public static void main(String[] args) {
		
		/*
		 * Use LIST inside Map to define CATOGORIES OF BIKES
		 */
		
		Map<String, List<String>> bikeCategory = new HashMap<>();
		
		bikeCategory.put("Underbone", new LinkedList<String>(List.of("Raider150", "GTR150", "Sniper 155")));
		bikeCategory.put("Track bike", new LinkedList<String>(List.of("Ninja 400", "R3", "NK400")));
		bikeCategory.put("Big bike", new LinkedList<String>(List.of("R1", "H2","CBR1000")));
		
		bikeCategory.forEach((k, v) -> {
			System.out.println(k + ": " + v);
		});
		
		System.out.println();
		
		var bikes150 = bikeCategory.get("Underbone");
		var trackBikes = bikeCategory.get("Track bike");
		var bigBikes = bikeCategory.get("Big bike");
		
		System.out.println("Going through 150 category......");
		for(var bike:bikes150) {
			System.out.println(bike);
		}
		
		System.out.println();
		
		System.out.println("Going through track bikes.....");
		for(var bike: trackBikes) {
			System.out.println(bike);
		}
		
		System.out.println();
		
		System.out.println("Going through big bikes.....");
		for(var bike: bigBikes) {
			System.out.println(bike);
		}
	}
}
