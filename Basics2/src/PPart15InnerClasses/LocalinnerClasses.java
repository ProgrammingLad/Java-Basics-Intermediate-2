package PPart15InnerClasses;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;


public class LocalinnerClasses {

	public static void main(String[] args) {

		LocalinnerClasses ex = new LocalinnerClasses();
		ex.running();
	}

	public void running() {
		
		//Example of an inner class.
		class Printer implements Runnable {
			
			private String name;

			//Constructor
			public Printer() {
				name = "Eugene";
			}

			@Override
			//Runnable interface implementation
			public void run() {
				System.out.println(name);
			}	
		}
		
		//newPrinter().run();
		
		ScheduledExecutorService service = Executors.newScheduledThreadPool(1);
		service.scheduleAtFixedRate(new Printer(), 0, 1L, TimeUnit.SECONDS);	
	}
	
/*
 * Inner classes are classes INSIDE a method:
 *
 * For example: inside public void running(), there is a class called Printer.
 * Printer is an example of INNER CLASS, because its inside public void running()
 *
 * Printer implements interface Runnable.
 * Runnable interface has method to be implemented: which is public void run();
 * 
 * We created a Constructor for inner class Printer to display name.
 * In public void run(); - We are printing out the constructor
 *
 *
 * We implemented timer at the public void running() method OUTSIDE the inner class.
 * Method can be implemented by creating new Object of class name inside public void running().
 *
 * You have to create inner class Object so that it can be implemented in public void running();
 * Otherwise - It wont be printed
 * Example: new Printer().run() - LINE 35;
 * But its not needed since we have new Printer() at timer(LINE 38), which will print name.
 * 
 * Once inner class Object has been implemented inside public void running();
 * It can be printed out using LocalinnerClasses ex = new LocalinnerClasses();
 */
}


