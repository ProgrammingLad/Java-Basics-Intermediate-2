package PPPart24JavaCollections;

import java.util.HashSet;
import java.util.Set;

public class PPart17SetsIntersection {

	public static void main(String[] args) {
		
		Set<String> sectionAStudents = new HashSet<>();
		sectionAStudents.add("Eugene");
		sectionAStudents.add("Jeungardo");
		sectionAStudents.add("Bryan");
		sectionAStudents.add("Ed");
		sectionAStudents.add("Raj");
		sectionAStudents.add("Mak");
		
		
		Set<String> sectionBStudents = new HashSet<>();
		sectionBStudents.add("Trebe");
		sectionBStudents.add("April");
		sectionBStudents.add("Kenneth");
		sectionBStudents.add("Eugene");
		sectionBStudents.add("Beng");
		sectionBStudents.add("Ed");
		
		//Combining students 1 & 2
		Set<String> union = new HashSet<>(sectionAStudents);
		union.addAll(sectionBStudents);
		System.out.println("Combining all students from Sections A & B: " + union);
		
		System.out.println();
		
		//Comparing duplicates from Section A to Section B
		Set<String> intersection = new HashSet<>(sectionAStudents);
		intersection.retainAll(sectionBStudents);
		System.out.println("We have found that these students are both in section A & B -- Displaying duplicate students from section A & B: " + intersection);
		
		System.out.println();
		
		//Students that does not HAVE duplicates
		Set<String> difference = new HashSet<>(sectionAStudents);
		difference.removeAll(sectionBStudents);
		System.out.println("Displaying students from section A that does not have a common name in Section A -- Section B students: " + difference);
		
		
	}
}
