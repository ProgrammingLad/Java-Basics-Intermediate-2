package PPPart23Generics;

public class Test<E> {
	
	private E[] array;
	
	private int position = 0;
	
	@SuppressWarnings("unchecked")
	public Test(int size) {
		array = (E[]) new Object[size];
	}
	
	public E setObject(E e) {
		return array[position++] = e;
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
			sb.append(obj).append(' ');
		}
		
		return sb.toString();
	}

}
