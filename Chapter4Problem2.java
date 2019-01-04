import java.util.Scanner;
import java.io.*;

public class Chapter4Problem2
{
	public static void main (String[] args) throws IOException
	{
		int milesPerHour;
		int hoursTraveled = 1;
		int userHoursTraveled;
		int distanceTraveled;
		String filename;

		Scanner keyboard = new Scanner(System.in);

		System.out.println("Enter the miles per hour of your vehicle: ");
		milesPerHour = keyboard.nextInt();

		System.out.println("Enter the hours traveled: ");
		userHoursTraveled = keyboard.nextInt();

		//System.out.println("Enter the filename: ");
		//filename = keyboard.nextLine();

		PrintWriter outputFile = new PrintWriter("/Users/NarenShridhar/Documents/JavaPrograms/ChapterFourProgrammingChallenges/filename.txt");

		if(userHoursTraveled < 1 || milesPerHour < 0)
		{
			System.out.println("This is an invalid entry");
		}

		else if(userHoursTraveled >= 1 && milesPerHour > 0)
		{
			for(hoursTraveled = 1; hoursTraveled <= userHoursTraveled ; hoursTraveled++)
				{
					distanceTraveled = hoursTraveled * milesPerHour;
					
					outputFile.println("Hours Traveled are: " + hoursTraveled + "\t + Distance Traveled is: " + distanceTraveled);
				}

			outputFile.close();
      		System.out.println("Data written to the file.");
		}
	}
}