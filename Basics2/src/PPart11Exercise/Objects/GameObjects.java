package PPart11Exercise.Objects;


public class GameObjects implements Comparable<GameObjects> {

	private int id;
	private String name;

	private int[][] comparison = {
							//rock		 paper		scissors
			/* rock*/		{ 0,		   -1,			1},
			/* paper*/		{ 1,			0,			-1},
			/* scissors*/	{ -1,			1,			0}
	};
	
	
	public int compareTo(GameObjects other) {
		return comparison[id][other.id];
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	protected void setID(int id) {
		this.id = id;
	}
	
	protected int getID() {
		return id;
	}
	
	
	public String toString() {
		return name + " "; //+ id;
	}
}
