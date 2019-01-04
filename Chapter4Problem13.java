import java.util.Scanner;
import java.io.*;

public class Chapter4Problem13
{
	public static void main (String[] args) throws IOException
	{
		Scanner keyboard = new Scanner(System.in);
		PrintWriter fileName = new PrintWriter("/Users/NarenShridhar/Documents/JavaPrograms/ChapterFourProgrammingChallenges/contents.txt");
		char moreLines = 'y';
		String userLine;
		String fileToOpen;
		int numberOfLines = 1;

		while(moreLines == 	'y')
		{
			System.out.println("Please enter the first line: ");
			userLine = keyboard.nextLine();
			fileName.println(userLine);
			System.out.println("Do you want to enter more lines? Enter y for yes");
			moreLines = keyboard.nextLine().charAt(0);
		}

		fileName.close();

		System.out.println("Please enter the name of the file you want to open: ");
		fileToOpen = keyboard.nextLine();

		File fileOpened = new File(fileToOpen);

		while(!fileOpened.exists())
		{
			System.out.println("The filename you entered does not exist. \nPlease enter another filename. ");
			fileToOpen = keyboard.nextLine();
			fileOpened = new File(fileToOpen);	
		}

		Scanner fileToRead = new Scanner(fileOpened);

		while(fileToRead.hasNext() && numberOfLines <=5)
		{
			System.out.println(fileToRead.nextLine() + "\n");
			numberOfLines++;
		}

		fileToRead.close();

	}
}