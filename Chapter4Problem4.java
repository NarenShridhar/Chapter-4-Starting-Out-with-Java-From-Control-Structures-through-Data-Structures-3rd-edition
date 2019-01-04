import java.util.Scanner;

public class Chapter4Problem4
{
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		double userDaysWorked;
		double penniesForDay;
		double totalPennies = 0;
		final int PENNIES_IN_A_DOLLAR = 100;
		double totalSalary;

		System.out.println("Enter the number of days worked: ");
		userDaysWorked = keyboard.nextInt();

		System.out.println("Day\tPennies for the day\n----\t---------------\n");
		for (int day = 1; day <+ userDaysWorked; day++)
		{
			penniesForDay = Math.pow(2.0 , day - 1);
			System.out.println(day + "\t" + penniesForDay);
			totalPennies = totalPennies + penniesForDay;
		}

		totalSalary = totalPennies/PENNIES_IN_A_DOLLAR;
		System.out.println("Total Salary: " + totalSalary);
	}
}