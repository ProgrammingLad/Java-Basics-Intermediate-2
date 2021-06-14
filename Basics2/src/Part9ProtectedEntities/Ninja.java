package Part9ProtectedEntities;

public class Ninja extends Motor {

	public Ninja(String name) {
		this.name = name;
		CC = 400;
	}
	
	public void autoBlip() {
		System.out.println("Activating auto blip...........");
	}
}
