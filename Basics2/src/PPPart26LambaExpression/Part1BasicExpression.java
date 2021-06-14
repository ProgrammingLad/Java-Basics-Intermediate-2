package PPPart26LambaExpression;

import java.util.List;

public class Part1BasicExpression {

	public static void main(String[] args) {
		
		List<String> list = List.of("one", "two", "three");
		
		list.forEach(e ->{
			System.out.print(e);
			System.out.print(" ");
		});
	}
}
