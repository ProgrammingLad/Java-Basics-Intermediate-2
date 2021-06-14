package PPPart24JavaCollections;

import java.util.Iterator;

/*
 * Create a generic class that can store objects of any type.
 * 
 * The class should use an internal array to store the objects.
 * The size of the internal array should be specified by the constructor
 * 
 * The class should have add(), get() and size() methods.
 * 
 * The add() method accepts any object to add, and may be called
 * as many times as is desired
 * 
 * The get() method accepts an index and returns the item at the given 
 * index in the array.
 * 
 * The size() method returns the number of items presently in the internal array.
 * 
 * If more items are added than can be fitted in the array,
 * the class starts overwriting items at the start of the array.
 * 
 * Example:
 * Internal buffer of size 3
 * 
 * First three items are stored at indexes 0-2.
 * 
 * Fourth item overwrites item at index 0
 * Fifth item overwtires item at index 1
 */


/*
 * We have created OUR OWN ARRAYLIST
 * WE cannot iterate through it using for each loop
 * AS ITS NOT A LIST
 * 
 * We also implemented our own iterator
 */
class Motors<E> implements Iterable<E>{

	private E[] motors;
	private int motorPositionInArray = 0;
	private int numberOfMotors = 0;
	
	private class MotorsIterator implements Iterator<E>{
		
		private int readMotorPosition = 0;
		@Override
		public boolean hasNext() {
			return readMotorPosition < numberOfMotors;
		}
		
		
		@Override
		public E next() {
			return motors[readMotorPosition++];
		}
		
	}
	@SuppressWarnings("unchecked")
	public Motors(int motornumbers) {
		motors = (E[]) new Object[motornumbers];
	}
	
	public void add(E motor) {
		motors[motorPositionInArray++] = motor;
		
		if(++numberOfMotors > motors.length) {
			numberOfMotors = motors.length;
		}
		
		if(motorPositionInArray == motors.length) {
			motorPositionInArray = 0;
		}
		
		
	}
	
	public E get(int index) {
		return motors[index];
	}
	
	public int size() {
		return motors.length;
	}
	
	@Override
	public Iterator<E> iterator() {
		return new MotorsIterator();
	}
	
}


public class PPart13IteratorsAdditionalExercise {

	public static void main(String[] args) {
		
		/*
		 * Explanation:
		 * 
		 * Maximum number of motors in array is (4)
		 * If we have more than 4 motors inside the array
		 * 
		 * Example: We have 5 motors instead of 4
		 * The 5th motor is placed BACK IN INDEX 0.
		 */

		
		/*
		 * Index explanation:
		 * (number of motor), (arrayIndex)
		 */
		
		Motors<String> m1 = new Motors<>(4);
		
		/*Index*/
		/*1, 0*/	m1.add("Ninja");
		/*2, 1*/	m1.add("H2");
		/*3, 2*/	m1.add("ZX6R");
		/*4, 3*/	m1.add("ZX25R");
		/*5, 4*/	m1.add("Ninja400");
	
		System.out.println("Iterating through the made up arraylist.....");
		for(int i = 0; i < m1.size(); i++) {
			System.out.println(m1.get(i));
		}
		
		System.out.println();
		System.out.println("Finding for ninja 400");
		
		for(var it = m1.iterator(); it.hasNext(); ) {
			var motorChecker = it.next();
			if(motorChecker.equals("Ninja400")) {
				System.out.println("We found Ninja400");
			} else {
				System.out.println("Not found");
			}
		}
		System.out.println();
		/*
		 * If we want to use foreach WITHOUT the the class being a LIST
		 * We should implement iterable inside the class
		 * 
		 * Remember: If its not a LIST (ArrayList, linkedlist)
		 * We cannot use foreach
		 * So we implement iterable inside class Motors
		 */
		
		for(String motor: m1) {
			System.out.println(motor);
		}
	}
}
