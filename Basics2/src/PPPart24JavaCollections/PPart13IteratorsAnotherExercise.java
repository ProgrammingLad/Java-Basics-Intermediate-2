package PPPart24JavaCollections;

import java.util.Iterator;

class Cars<E> implements Iterable<E>{

	private E[] cars;
	private int carsPositionInArray;
	private int numberOfCars;
	
	@SuppressWarnings("unchecked")
	public Cars(int sizeOfArray) {
		cars = (E[]) new Object[sizeOfArray];
	}
	
	
	private class CarsIterator implements Iterator<E>{
		
		private int readCarsInArray = 0;
		private int itemsRead = 0;
		
		public CarsIterator() {
			if(numberOfCars == cars.length) {
				readCarsInArray = carsPositionInArray;
			}
		}
		@Override
		public boolean hasNext() {
			return itemsRead < numberOfCars;
		}
		
		@Override
		public E next() {
			++itemsRead;
			
			if(readCarsInArray == cars.length) {
				readCarsInArray = 0;
			}
			
			return cars[readCarsInArray++];
		}
	}
	public void add(E car) {
		cars[carsPositionInArray++] = car;
	
		if(++numberOfCars > cars.length) {
			numberOfCars = cars.length;
		}
		
		if(carsPositionInArray == cars.length) {
			carsPositionInArray = 0;
		}
		
	}
	
	
	public E get(int index) {
		return cars[index];
	}
	
	public int size() {
		return cars.length;
	}
	@Override
	public Iterator<E> iterator() {
		return new CarsIterator();
	}
	
}

/*
 * Difference = If there are more than 4 cars inside an array
 * 
 * It will not reset the read position to array index 0
 */
public class PPart13IteratorsAnotherExercise {

	public static void main(String[] args) {
	
		Cars<String> c1 = new Cars<>(4);
		
		c1.add("Toyota");
		c1.add("Honda");
		c1.add("BMW");
		c1.add("Mercedes");
		c1.add("Audi");
		c1.add("Mitsubishi");
		
		for(var it = c1.iterator(); it.hasNext(); ) {
			var carChecker = it.next();
			System.out.println(carChecker);
		}
		
	/*
	 * If we want to use foreach WITHOUT the the class being a LIST
	 * We should implement iterable inside the class
	 * 
	 * Remember: If its not a LIST (ArrayList, linkedlist)
	 * We cannot use foreach
	 * So we implement iterable inside class Cars
	 */
		for(String n: c1) {
			System.out.println(n);
		}
	}
}
