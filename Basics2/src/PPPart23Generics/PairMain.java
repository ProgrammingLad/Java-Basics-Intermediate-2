package PPPart23Generics;

public class PairMain {

	public static void main(String[] args) {
		
		Pair<Integer, Cat> pair = new Pair<Integer, Cat>(1, new Cat("Ming"));
		
		System.out.println(pair.getValue1());
		System.out.println(pair.getValue2());
		
		System.out.println(pair);
	}
}
