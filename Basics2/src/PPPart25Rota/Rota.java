package PPPart25Rota;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Rota {

	List<Person> people;
	List<Set<Person>> days = new ArrayList<>();
	
	private int peopleListPosition = 0;
	
	public Rota(List<Person> people) {
		this.people = people;
		
		nextWeek();
	}
	
	public void nextWeek() {
		
		days.clear();
		
		for(int day = 0; day < Days.values().length; day++) {
			populateDay(day);
		}
	}
	
	private void populateDay(int day) {
		VitalSkillSet vitalSkills = new VitalSkillSet();
		
		Set<Person> workingToday = new HashSet<Person>();
		
		for(int i = 0; i < people.size(); i++) {
			
			Person person = people.get(peopleListPosition++);
			
			if(peopleListPosition == people.size()) {
				peopleListPosition = 0;
			}
			
			if (person.isOnHoliday()) {
				continue;
			}
			
			Set<Skill> skills = person.getSkills();
			
			vitalSkills.addAll(skills);
			
			workingToday.add(person);
			
			if(vitalSkills.isComplete()) {
				break;
			}
			
		}
		
		days.add(workingToday);
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < days.size(); i++){
			Days dayName = Days.values()[i];
			
			System.out.println(dayName);
			
			Set<Person> peopleWorking = days.get(i);
			
			for(Person person: peopleWorking) {
				System.out.println(person);
			}
					
			System.out.println();
		}
		
		return sb.toString();
	}
}
