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

class Ring<E> implements Iterable<E> {

	private E[] items;
	private int writePosition = 0;
	private int numberOfItems = 0;
	
	private class RingIterator implements Iterator<E> {
		
		private int readPosition = 0;
		
		@Override
		public boolean hasNext() {
			return readPosition < numberOfItems;
		}

		@Override
		public E next() {
			return items[readPosition++];
		}
	}

	@SuppressWarnings("unchecked")
	public Ring(int size) {
		items = (E[]) new Object[size];
	}

	public void add(E element) {
		items[writePosition++] = element;

		if (writePosition == items.length) {
			writePosition = 0;
		}

		if (++numberOfItems > items.length) {
			numberOfItems = items.length;
		}

	}

	public E get(int index) {
		return items[index];
	}

	public int size() {
		return items.length;
	}

	public Iterator<E> iterator() {
		return new RingIterator();
	}
}

public class PPart14Exercise {

	public static void main(String[] args) {

		Ring<Integer> r1 = new Ring<>(3);

		r1.add(2);
		r1.add(3);
		r1.add(7);
		r1.add(9);

		for(var it = r1.iterator(); it.hasNext(); ) {
			System.out.println(it.next());
		}

	}
}
