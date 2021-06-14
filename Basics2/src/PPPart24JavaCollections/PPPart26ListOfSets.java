package PPPart24JavaCollections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PPPart26ListOfSets {

	public static void main(String[] args) {
		
		List<Set<String>> motorToUse = new ArrayList<>();
		
		motorToUse.add(new HashSet<>(Set.of("ZX25R")));
		motorToUse.add(new HashSet<>(Set.of("Ninja")));
		motorToUse.add(new HashSet<>(Set.of("CBR1000")));
		motorToUse.add(new HashSet<>(Set.of("GTR 150")));
		motorToUse.add(new HashSet<>(Set.of("Mio 125 Soul I")));
		
		motorToUse.forEach(System.out::println);
	}
}
