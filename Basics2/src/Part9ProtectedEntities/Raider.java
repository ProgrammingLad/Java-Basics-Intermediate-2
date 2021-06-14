package Part9ProtectedEntities;

public class Raider extends Motor{

	public Raider(String name) {
		this.name = name;
		CC = 150;
	}
	
	public void dailyUse() {
		System.out.println("Going to work........");
	}
}
