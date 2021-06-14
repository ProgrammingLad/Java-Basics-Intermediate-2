package Part7Boolean;

public class BooleanOr {

	public static void main(String[] args) {

		
		boolean isRaining = true;
		boolean mightRain = true;
		boolean takeUmbrella = false;
		
		if(isRaining && mightRain) {
			takeUmbrella = true;
		}
		
		System.out.println(takeUmbrella);
		
		takeUmbrella = false;
		System.out.println(takeUmbrella);
		
		mightRain = false;
		
		takeUmbrella = isRaining && mightRain ? true: false;
		
		System.out.println(takeUmbrella);
	}
}
