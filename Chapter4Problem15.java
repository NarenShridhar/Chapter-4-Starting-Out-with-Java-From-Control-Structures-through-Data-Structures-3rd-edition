import java.io.*;
import java.util.Scanner;

public class Chapter4Problem15
{
	public static void main(String[] args) throws IOException
	{
		Scanner keyboard = new Scanner(System.in);

		String fileToRead;
		String fileToWrite;

		System.out.println("What is the name of the first file to be opened?");
		fileToRead = keyboard.nextLine();

		System.out.println("What is the name of the second file to be written to?");
		fileToWrite =  keyboard.nextLine();

		File file = new File(fileToRead);

		File fileTwo = new File(fileToWrite);

		while(!file.exists())
		{
			System.out.println("The filename you entered does not exist. \nPlease enter another filename. ");
			fileToRead = keyboard.nextLine();
			file = new File(fileToRead);	
		}

		while(!fileTwo.exists())
		{
			System.out.println("The filename you entered does not exist. \nPlease enter another filename. ");
			fileToRead = keyboard.nextLine();
			file = new File(fileToRead);	
		}

		Scanner fileToScan = new Scanner(file);

		PrintWriter fileToWriteTwo = new PrintWriter(fileTwo);

		while (fileToScan.hasNext())
		{
			fileToWriteTwo.println(fileToScan.nextLine().toUpperCase());
		}

		fileToWriteTwo.close();
		fileToScan.close();
	}
}