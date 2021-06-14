package PPPart25Rota;

import java.util.HashSet;
import java.util.Set;

import static PPPart25Rota.Skill.*;

public class VitalSkillSet extends HashSet<Skill>{
	
	private static final long serialVersionUID = 1L;
	
	private Set<Skill> vitalSkills = Set.of(PROGRAMMING, MANAGEMENT, RECEPTION);
	
	public boolean isComplete() {
		
		boolean complete = true;
		
		for(var skill: vitalSkills) {
			if(!contains(skill)) {
				complete = false;
			}
		}
		
		return complete;
	}

}
