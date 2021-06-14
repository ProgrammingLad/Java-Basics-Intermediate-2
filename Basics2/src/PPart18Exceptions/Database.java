package PPart18Exceptions;

public class Database implements AutoCloseable {
	
	String connectionString;

	public Database(String connectionString) throws Exception {
		
		System.out.println("Opening connection to " + connectionString);
	
		
		if(connectionString == null) {
			throw new Exception("Cannot connect to " + connectionString);
		}
	
		this.connectionString = connectionString;
		
		System.out.println("Connection to " + connectionString + " succesful");
		
	}
	
	public void getData() throws Exception {
		
		System.out.println("Getting data from " + connectionString);
		if(connectionString.length() < 3) {
			throw new Exception("Cannot get data from " + connectionString);
		}
	
		
	}

	public void close() throws Exception {
		System.out.println("Closing db connection......");
		
		if(connectionString.length() > 5) {
			throw new Exception("Cannot close connection to " + connectionString);
		}
		
		System.out.println("Connection to " + connectionString + " succesfully closed");
	}
}
