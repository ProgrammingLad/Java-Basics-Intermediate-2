package Part7Boolean;

public class BooleanAnd {
	public static void main(String[] args) {

		boolean isRaining = true;
		boolean haveUmbrella = true;

		boolean takeUmbrella = false;


		if(isRaining && haveUmbrella) {
			takeUmbrella = true;
			System.out.println(takeUmbrella);
		} 
		
		takeUmbrella = isRaining && haveUmbrella ? true: false;
		
		System.out.println(takeUmbrella);
		
	}
}
