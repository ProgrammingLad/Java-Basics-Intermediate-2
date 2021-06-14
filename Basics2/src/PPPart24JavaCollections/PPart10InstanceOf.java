package PPPart24JavaCollections;

class Player {
	
}

class NBAPlayer extends Player{
	
}
public class PPart10InstanceOf {

	public static void main(String[] args) {
		
		/*
		 * Check output for more info
		 * 
		 * Instance of checks what type of Object is a variable
		 * 
		 * For example: 
		 * p1 is Player Object
		 * p2 is referring to p1 which is a Player Object
		 * p2 will be a Player Object
		 * 
		 * We stated Object in p2 simply because
		 * We want to compare it to Integer
		 * 
		 * NBAPlayer is a type of Player Object
		 * Since NBAPlayer extends Player
		 * Sub-type polymorphism
		 */
		Player p1 = new Player();
		Object p2 = p1;
		
		NBAPlayer n1 = new NBAPlayer();
		
		System.out.println(p1 instanceof Player);
		
		System.out.println(p2 instanceof Player);
		
		System.out.println(p2 instanceof Integer);
		
		System.out.println(n1 instanceof Player);
	}
}
