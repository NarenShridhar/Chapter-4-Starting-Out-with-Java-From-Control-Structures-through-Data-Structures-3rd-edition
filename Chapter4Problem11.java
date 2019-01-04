public class Chapter4Problem11
{
	public static void main (String[] args)
	{
		double startingCelsiusTemperature = 0;
		final double MAX_CELSIUS_TEMPERATURE = 20;
		double fahrenheitTemperature;

		for (int celsiusTemperature = 0; celsiusTemperature <= MAX_CELSIUS_TEMPERATURE; celsiusTemperature++)
		{
			fahrenheitTemperature = (1.8 * celsiusTemperature) + 32;
			System.out.println("Celsius temperature: " + celsiusTemperature + "\t Fahrenheit temperature: " + fahrenheitTemperature);
		}
	}
}