package PPPart24JavaCollections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

class ProgrammingSkills extends HashSet<String>{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public boolean isAtrueProgrammer() {
		return this.contains("Java") && this.contains("Python");
	}
}

class Programmer {
	private String name;
	
	public Programmer(String name) {
		this.name = name;
	}
	
	public String toString() {
		return name;
	}
	
}

public class PPPart29SimplifyingSetsOfSets {

	public static void main(String[] args) {

		/*
		 * 	Create a class and assign a name
		 * 	Make second class as a Set
		 * 
		 *  Put class and class/set inside a Map
		 *  
		 *  Make first class have a constructor name
		 *  Make the second class/set have the skills
		 *  
		 *  Iterate through it using a for each loop.
		 *  
		 *  Also make a boolean to check if second class/set is complete.
		 */
		Map<Programmer, ProgrammingSkills> programmer = new HashMap<>();
		
		Programmer p1 = new Programmer("Eugene");
		
		ProgrammingSkills ps1 = new ProgrammingSkills();
		ps1.add("Java");
		ps1.add("Python");
		
		programmer.put(p1, ps1);
		
		for(var prog: programmer.entrySet()) {
			var key = prog.getKey();
			var value = prog.getValue();
			
			System.out.println("Name: " + key + "\t Skills: " + value);
		}
		
		System.out.println(ps1.isAtrueProgrammer());
		
		
	}
}
