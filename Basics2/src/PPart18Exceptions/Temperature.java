package PPart18Exceptions;

import PPart18Exceptions.CustomException.TemperatureOutOfRangeException;
import PPart18Exceptions.CustomException.TemperatureTooHighException;
import PPart18Exceptions.CustomException.TemperatureTooLowException;

public class Temperature  {
	
	public void setTemperature(int temperature) throws TemperatureOutOfRangeException  {
		
		tempController(temperature);
		
		System.out.println("You have set the temperature to: " + temperature);
	}
	
	private void tempController(int temperature) throws TemperatureOutOfRangeException {
		if(temperature > 30) {
			throw new TemperatureTooHighException("Temperature above maximum threshold");
		} else if(temperature < 0 ) {
			throw new TemperatureTooLowException("Temperature below minimum threshold");
		}
	}

}
