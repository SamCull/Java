package week2.lab1;

//Implements a Thermometer class.
//Stores the current temperature in Celcius
public class Thermometer
{ // begin Thermometer
	private double celsius;	// more about private later
							// celsius is accessible to all methods in this class
	
	public Thermometer()			// constructor method #1
	{
		setCelsius(0);		
	}
		
	public Thermometer(double cel)	// constructor method #2
	{
		setCelsius(cel);
	}

	public void setCelsius(double cel)
	{
		celsius = cel;		
	}

	public double getCelsius()
	{
		return celsius;
	}
	
	public void setFahrenheit(double fahrenheit)
	{
		celsius = (((fahrenheit -32) *5) /9);
	}
	
	public double getFahrenheit()
	{
		return(((celsius* 9) /5) + 32);
	}
} // end class Thermometer