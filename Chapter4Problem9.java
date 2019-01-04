import java.util.Scanner;

public class Chapter4Problem9
{
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		double startingNumberOfOrganisms = 1;
		double averageDailyPopulationIncreasePercentage = -1;
		double averageDailyPopulationIncreaseNumber = 0;
		double numberOfDaysMultipliedFor = 0;

		while(startingNumberOfOrganisms < 2)
		{
			System.out.println("What is the starting number of organisms?");
			startingNumberOfOrganisms = keyboard.nextDouble();

			while(averageDailyPopulationIncreasePercentage < 0)
			{
				System.out.println("What is the average daily population increase as a percentage?");
				averageDailyPopulationIncreasePercentage = keyboard.nextDouble();
				averageDailyPopulationIncreaseNumber = averageDailyPopulationIncreasePercentage/100;

				while(numberOfDaysMultipliedFor < 1)
				{
					System.out.println("What is the amount of days the species will multiply for?");
					numberOfDaysMultipliedFor = keyboard.nextDouble();
				}
			}
		}

		for (int day = 1; day <= numberOfDaysMultipliedFor; day++)
		{
			startingNumberOfOrganisms = startingNumberOfOrganisms + (startingNumberOfOrganisms * averageDailyPopulationIncreaseNumber);
			System.out.println("For day " + day + " the number of organisms is " + startingNumberOfOrganisms);
		}
	}
}