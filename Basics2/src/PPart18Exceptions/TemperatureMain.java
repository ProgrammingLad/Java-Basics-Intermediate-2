package PPart18Exceptions;

import PPart18Exceptions.CustomException.TemperatureOutOfRangeException;
import PPart18Exceptions.CustomException.TemperatureTooHighException;
import PPart18Exceptions.CustomException.TemperatureTooLowException;

public class TemperatureMain {

	public static void main(String[] args) {

		/*
		 * This will not work if you put TemperatureOutOfRangeException at the VERY TOP
		 * Because it already will catch both TooLow and TooHigh exceptions
		 * Meaning that the code is NOT NEEDED anyway, Java will throw it away
		 */
		
		Temperature temp = new Temperature();

		try {
			temp.setTemperature(31);
		} 
		catch(TemperatureTooHighException|TemperatureTooLowException e) {
			System.out.println(e.getMessage());
		} 
		catch (TemperatureOutOfRangeException e) {
			System.out.println(e.getMessage());
		}
		catch (Exception e) {
			System.out.println("An Exception has occured");
		} 
		finally {
			System.out.println("In final block....");
		}
	}
}
