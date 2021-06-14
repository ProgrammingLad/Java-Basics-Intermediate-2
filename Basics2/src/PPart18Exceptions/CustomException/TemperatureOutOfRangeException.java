package PPart18Exceptions.CustomException;

public class TemperatureOutOfRangeException extends Exception {

	/*
	 * Specific exception that handles TemperatureOutOfRange
	 * One can create own extension
	 * Simply create a class and extend Exception
	 */
	private static final long serialVersionUID = 1L;

	public TemperatureOutOfRangeException(String message) {
		super(message);
	}
}
