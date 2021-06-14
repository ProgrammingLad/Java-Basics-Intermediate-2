package PPPart26LambaExpression;

import java.util.function.Predicate;

public class Part5Predicate {

	public static void main(String[] args) {

		Predicate<String> p1 = new Predicate<>() {

			public boolean test(String s) {
				return s.length() < 4;
			}
		};

		System.out.println(p1.test("one"));
		System.out.println(p1.test("three"));

		
		
		Predicate<String> p2 = text -> text.length() < 4;

		System.out.println(p2.test("one"));
		System.out.println(p2.test("three"));
		
	}
}
