import java.util.Scanner;
import java.io.*;

public class Chapter4Problem14
{
	public static void main (String[] args) throws IOException
	{
		Scanner keyboard = new Scanner (System.in);
		String fileToOpen;
		int lineNumber = 1;

		System.out.println("What is the name of the file?");
		fileToOpen = keyboard.nextLine();

		File fileOpened = new File(fileToOpen);

		while(!fileOpened.exists())
		{
			System.out.println("The filename you entered does not exist. \nPlease enter another filename. ");
			fileToOpen = keyboard.nextLine();
			fileOpened = new File(fileToOpen);	
		}

		Scanner fileToRead = new Scanner(fileOpened);

		while(fileToRead.hasNext())
		{
			System.out.println(lineNumber + ": " + fileToRead.nextLine());
			lineNumber++;
		}
	}
}