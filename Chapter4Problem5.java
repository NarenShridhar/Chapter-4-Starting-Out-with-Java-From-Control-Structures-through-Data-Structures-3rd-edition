import java.util.Scanner;

public class Chapter4Problem5
{
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		String userEntry;
		char userChar;
		int count = 0;

		System.out.println("Enter a word of your choice: ");
		userEntry = keyboard.nextLine();

		System.out.println("Enter a character of your choice to search for in the word you just entered: ");
		userChar = keyboard.next().charAt(0);

		for (int i = 0; i < userEntry.length(); i++)
		{
			if(userEntry.charAt(i) == userChar)
			{
				count++;
			}
		}

		System.out.println("The number of times " + userChar + " was found in " + userEntry + " was " + count + " times.");
	}
}