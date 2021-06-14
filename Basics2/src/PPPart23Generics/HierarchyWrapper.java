package PPPart23Generics;

public class HierarchyWrapper<E>{

	private E object;
	
	public void setObject(E object) {
		this.object = object;
	}
	
	public E getObject() {
		return object;
	}
}
