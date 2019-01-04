import java.util.Scanner;

public class Chapter4Problem10
{
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		double userNumber;
		double largest;
		double smallest;
		double sentinel = -99;

		System.out.println("Please enter a number: ");
		userNumber = keyboard.nextDouble();

		smallest = userNumber;
		largest = userNumber;

		while(userNumber != sentinel)
		{
			if(userNumber < smallest)
			{
				smallest = userNumber;
			}

			else if(userNumber > largest)
			{
				largest = userNumber;
			}

			System.out.println("Please enter another number, or enter -99 to end: ");
			userNumber = keyboard.nextDouble();
		}

		System.out.println("The smallest number you entered was: " + smallest + " and the largest number you entered was: " + largest);
	}
}