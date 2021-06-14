package PPPart23Generics;

public class Hierarchy {
	
	public static void main(String[] args) {
		
		/*
		 * An example of subtype polymorphism:
		 * Both Mammal and Cat is a subtype of Creature
		 * So we can call setObjects for both subclasses using Wrapper<Creature>
		 * 
		 * Example: If we set Wrapper<Mammal>
		 * We can only use either Mammal or Cat, not Creature
		 * 
		 * Example: If we set Wrapper<Cat>
		 * We can only use Cat
		 */
		HierarchyWrapper<Creature> wrapper = new HierarchyWrapper<Creature>();

		/*
		 * If we change Creature ming1 to Cat ming1
		 * It's not going to be allowed
		 * We have to follow what's inside <>
		 * Therefore <Creature>
		 */
		wrapper.setObject(new Mammal("Miiing"));
		Creature ming1 = wrapper.getObject();
		System.out.println(ming1);
		
		wrapper.setObject(new Cat("Mingming"));
		Creature ming = wrapper.getObject();
		System.out.println(ming);
	}
}
