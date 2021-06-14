package PPPart23Generics;

public class Array<E> {
	
	private E[] array;
	
	private int position = 0;
	@SuppressWarnings("unchecked")
	public Array(int size) {
		array = (E[])new Object[size];
	}
	
	public void add(E e) {
		
		if(position == array.length) {
			throw new ArrayIndexOutOfBoundsException();
		}
		
		array[position++] = e;
	}
	
	public void addAll(Array<? extends E> source) {
		for(int i = 0; i < source.size(); i++) {
			E item = source.getIndex(i);
			add(item);
		}
	}
	public E getIndex(int index) {
		return array[index];
	}
	
	public int size() {
		return position;
	}
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for(E obj: array) {
			sb.append(obj);
			sb.append(' ');
		} 
		return sb.toString();
	}

}
	