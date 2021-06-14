package PPart18Exceptions;


public class Autocloseable {

	public static void main(String[] args) {
		
		Database db; 
		
		try {
		db = new Database(null);
		db.getData();
		db.close();
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}
