import java.util.Scanner;

public class Chapter4Problem20
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		int userInteger = 0;
		String characterX = "X";

		System.out.println("Enter a positive integer no greater than 15: ");
		userInteger = keyboard.nextInt();

		while(userInteger <= 0 || userInteger > 15)
		{
			System.out.println("Invalid entry, enter a positive integer no greater than 15.");
			userInteger = keyboard.nextInt();
		}

		for (int row = 1; row <= userInteger; row++)
		{
			for (int column = 1; column <= userInteger; column++)
			{
				System.out.print(characterX);
			}
			System.out.println(characterX);
		}
	}
}