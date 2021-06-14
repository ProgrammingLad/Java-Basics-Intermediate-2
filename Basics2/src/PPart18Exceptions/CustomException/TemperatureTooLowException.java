package PPart18Exceptions.CustomException;

public class TemperatureTooLowException extends TemperatureOutOfRangeException {

	public TemperatureTooLowException(String message) {
		super(message);
	}
}
