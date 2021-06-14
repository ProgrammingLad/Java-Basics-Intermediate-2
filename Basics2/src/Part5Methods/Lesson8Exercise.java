package Part5Methods;

public class Lesson8Exercise {

	public static void main(String[] args) {
		
		Lesson8Class WindowAttributes = new Lesson8Class();
		WindowAttributes.setColor("Black");
		WindowAttributes.setHeight(15);
		WindowAttributes.setlineNumber(100);
		WindowAttributes.setWidth(150);
		
		System.out.printf("Window color is: %s\nHeight of window is: %d\nLines in window: %d\nWidth of window: %d\n",
				WindowAttributes.getColor(), WindowAttributes.getHeight(), WindowAttributes.getlineNumber(), WindowAttributes.getWidth());

	}
}
