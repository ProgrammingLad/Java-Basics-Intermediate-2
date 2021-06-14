package PPPart23Generics;

public class ArrayMain {
	
	public static void main(String[] args) {
		
		Array<Mammal> mammals = new Array<>(3);
		mammals.add(new Mammal("Dolphin"));
		mammals.add(new Mammal("Elephant"));
		
		Mammal getMammal1 = mammals.getIndex(0);
		Mammal getMammal2 = mammals.getIndex(1);
		
		System.out.println(getMammal1);
		System.out.println(getMammal2);
		System.out.println("\n");
		
		
		Array<Cat> cats = new Array<>(2);
		cats.add(new Cat("Ming"));
		cats.add(new Cat("Mingming"));
		
		
		Cat getCat1 = cats.getIndex(0);
		Cat getCat2 = cats.getIndex(1);
		
		System.out.println(getCat1);
		System.out.println(getCat2);
		System.out.println("\n");
		
		/*
		 * This is how you find a text inside an array
		 */
		Cat catFind = find(cats, "Mingming");
		System.out.println(catFind);
		
		Mammal mammalFind = find(mammals, "Dolphin");
		System.out.println(mammalFind);
		System.out.println();
		
		//Feeding mammals before calling add mammal method
		System.out.println("Now displaying add mammal method before calling feed all mammals");
		feedAll(mammals);
		System.out.println();
		System.out.println("Feeding cats");
		feedAll(cats);
		System.out.println("\n");
		
		//Feeding mammals after calling add mammal method
		System.out.println("Now displaying add mammal method after calling feed all mammals");
		addCat(mammals);
		feedAll(mammals);
		System.out.println();
		
		Array<Creature> creature = new Array<>(2);
		addCat(creature);
		
		System.out.println("Successfully added Cat to creatures");
		Creature c1 = creature.getIndex(0);
		System.out.println(c1);
		
	}
	
	/*
	 *Look at ArrayMain.java to check documentation and methods
	 *
	 * Public void size has been created so we can iterate through the whole array
	 * using array.length
	 * 
	 */
	
	/*
	 * This is how you find a text inside an array
	 * First: 	Specify type: 						Array<T>
	 * Second: 	Specify the super class: 			Creature
	 * Third: 	Specify what you want to find: 		String
	 * Fourth:	Iterate through the whole array		for loop
	 * Fifth: 	compare toString method and text	.equals
	 * Sixth: 	return value
	 * 
	 * If value is not found: return null
	 * 
	 * Note: <creatureFinder> can be named anything
	 * Tip: Specify what it does for clearer code.
	 */
	public static <creatureFinder> creatureFinder find(Array<creatureFinder> Creature, String text) {
		
		for(int i = 0; i < Creature.size(); i++) {
			creatureFinder value = Creature.getIndex(i);
			
			if(value.toString().equals(text)) {
				System.out.println("We found the cat");
				return value;
			}
		}
		
		return null;
	}
	
	/*
	 * Method Hierarchy: Look for reference: Top to bottom(Super to sub classes)
	 * Super Class: Creature
	 * Mammal extends Creature
	 * Cat 	extends	Mammal 
	 */
	
	/*
	 * Note: This passes method from super class to sub classes
	 * 
	 * This is how you pass a method to all subclasses using generics
	 * First: 		Use wildcard (?)
	 * Second:		extend the superclass and give it a variable name
	 * Note:		Variable name can be any name, but to avoid confusion, specify the appropriate variable name
	 * 
	 * Third: 		Iterate through the entire Array
	 * Fourth: 		Call superclass and variable name
	 * Fifth:		Call feed method from Superclass
	 *
	 */
	public static void feedAll(Array<? extends Creature> creatures) {
		for(int i = 0; i < creatures.size(); i++) {
		Creature creature = creatures.getIndex(i);
		creature.feed();
		}
	}
	
	/*
	 * Note: This passes method from sub class to all super classes: Mammal & Creature
	 * 
	 * This works exactly like feedAll
	 * Since both mammal and creature are super classes of cat
	 * We now can add Cat to Mammal and Creature
	 */
	public static void addCat(Array<? super Cat>cats) {
		cats.add(new Cat("Tiger"));
	}
	
}
