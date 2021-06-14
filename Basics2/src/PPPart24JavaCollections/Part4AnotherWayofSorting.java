package PPPart24JavaCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee implements Comparable<Employee>{
	private String name;
	private int salary;
	
	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public String toString() {
		return name + ' ' + salary;
	}
	
	public int compareTo(Employee employee) {
		return name.compareTo(employee.name);
	}
	
}

public class Part4AnotherWayofSorting {

	public static void main(String[] args) {
		
		/*
		 * For method: Sorting by number if two names are equal
		 * Check: Part2CustomObjectsinArrayh
		 * In: class Person
		 * Method: compareTo
		 */
		
		ArrayList<Employee> employee = new ArrayList<Employee>();
		
		employee.add(new Employee("Eugene", 50000));
		employee.add(new Employee("Eugene", 40000));
		employee.add(new Employee("Eugene", 25000));
		employee.add(new Employee("Bryan", 150000));
		employee.add(new Employee("Bryan", 19000));
		
		Collections.sort(employee);
		
		System.out.println("Now sorting based on alphabetical name");
		employee.forEach(e ->{
			System.out.println(e);
		});
		System.out.println("\n");
		
		employee.sort(new Comparator<Employee>() {
			public int compare(Employee employee1, Employee employee2) {
				
				Integer salary1 = employee1.getSalary();
				Integer salary2 = employee2.getSalary();
				
				return salary2.compareTo(salary1);
			}
		});
		
		System.out.println("Now displaying based on salary, greatest to least......");
		employee.forEach(System.out::println);
	}
	
}
