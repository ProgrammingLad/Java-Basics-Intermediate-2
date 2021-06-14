package Part9MoreProjects;

class Employee {
	
	protected String name;
	protected String delegation;
	
	
	public void work() {
		System.out.println(delegation + " is now working.....");
	}
	
	public void onBreak() {
		System.out.println(delegation + " is now on break.....");
	}
	
	public void lunch() {
		System.out.println(delegation + " is out for lunch....");
	}
	
	public void eos() {
		System.out.println(delegation + " shift has ended......");
	}
	
	public String toString() {
		return delegation + " has arrived";
	}
	
	public String PrintMe() {
		return name;
	}
	
}

class Manager extends Employee {
	
	public Manager() {
		delegation = "Manager";
	}
	public void meeting() {
		System.out.println("Manager in on a meeting......");
	}
	
	public void townHall() {
		System.out.println("Manager is now on a townhall....");
	}

}

class IT extends Employee{
	
	public IT(String name) {
		this.name = name;
		delegation = "Sys Admin";
	}
	
	public void fixDatabase() {
		System.out.println(delegation + " is now fixing database......");
	}
	
	public void install() {
		System.out.println(delegation + " reformatting pc.....");
	}
}
public class SampleDatabase {

	public static void main(String[] args) {
	
		Employee manager1 = new Manager();
		System.out.println(manager1);
		manager1.work();
		manager1.onBreak();
		manager1.work();
		Manager managerActions = (Manager)manager1;
		managerActions.meeting();
		manager1.lunch();
		manager1.work();
		managerActions.townHall();
		manager1.eos();
		
		System.out.println();
		
		Employee IT1 = new IT("Eugene");
		System.out.println(IT1.PrintMe() + ": " + IT1);
		IT1.work();
		IT1.onBreak();
		IT1.work();
		IT itRoles = (IT)IT1;
		itRoles.fixDatabase();
		IT1.lunch();
		IT1.work();
		itRoles.install();
		IT1.eos();
		
		
		
		
	}
}
