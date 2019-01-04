import java.util.Scanner;

public class Chapter4Problem8
{
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		int numberOfYears = -1;
		final int MONTHS_IN_A_YEAR = 12;
		int inchesOfRainfallPerMonth = -1;
		int totalNumberOfMonths = 0;
		int totalInchesOfRainfall = 0;
		double averageRainfall;

		while(numberOfYears < 1)
		{
			System.out.println("Enter the number of years: ");
			numberOfYears = keyboard.nextInt();
		}

		for (int years = 1; years <= numberOfYears; years++)
		{
			for (int months = 1; months <=  MONTHS_IN_A_YEAR; months++)
			{	
				while(inchesOfRainfallPerMonth < 0)
				{
					System.out.println("Enter the number of inches of rainfall for month: " + months + ", year " + years);
					inchesOfRainfallPerMonth = keyboard.nextInt();

				}

				totalInchesOfRainfall = totalInchesOfRainfall + inchesOfRainfallPerMonth;
				totalNumberOfMonths = totalNumberOfMonths + 1;
				inchesOfRainfallPerMonth = -1;

			}
		}

		
		averageRainfall = totalInchesOfRainfall/totalNumberOfMonths;

		System.out.println("The total number of months was: " + totalNumberOfMonths);
		System.out.println("The total inches of rainfall was: " + totalInchesOfRainfall);
		System.out.println("The average rainfaill was: " + averageRainfall);
	}
}