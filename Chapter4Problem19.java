import java.util.Random;
import java.util.Scanner;

public class Chapter4Problem19
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		Random random = new Random();
		int colorIndex;

		
		String computerGeneratedColor = "";
		String userGeneratedColor = "";
		int userCorrectGuesses = 0;
		final int NUMBER_OF_QUESTIONS = 10;

		for (int questionNumber = 0; questionNumber < NUMBER_OF_QUESTIONS; questionNumber++)
		{
			colorIndex = random.nextInt(5);
			switch (colorIndex)
			{

				case 0: 
					computerGeneratedColor = "Red";
					break;
				case 1:
					computerGeneratedColor = "Green";
					break;
				case 2:
					computerGeneratedColor = "Blue";
					break;
				case 3:
					computerGeneratedColor = "Orange";
					break;
				case 4:
					computerGeneratedColor = "Yellow";
					break;
				default: 
					System.out.println("The number " + colorIndex + " is not matched with a color");
					break;
			}

			System.out.println("I have generated a color number " + questionNumber + 
				" (Red, Green, Blue, Orange, Yellow). What's your guess?");
			userGeneratedColor = keyboard.nextLine();

			if(userGeneratedColor.equalsIgnoreCase(computerGeneratedColor))
			{
				userCorrectGuesses = userCorrectGuesses + 1;
			}

			System.out.println("The computer selected " + computerGeneratedColor + " and you selected " + userGeneratedColor);
		}

		System.out.println("You were able to guess " + userCorrectGuesses + " of the colors the computer chose. Good job");
		
	}
}