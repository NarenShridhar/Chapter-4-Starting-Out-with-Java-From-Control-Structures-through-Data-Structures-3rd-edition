import java.util.Scanner;

public class Chapter4Problem16
{
	public static void main(String [] args)
	{
		Scanner keyboard = new Scanner(System.in);

		double amountBudgeted = 0;
		double expense = 0;
		char moreExpenses = 'y';
		double totalExpenses = 0;

		System.out.println("How much was your budget for the month?");
		amountBudgeted = keyboard.nextDouble();

		while(moreExpenses == 'y')
		{
			System.out.println("Enter your expense: ");
			expense = keyboard.nextDouble();
			totalExpenses = totalExpenses + expense;
			System.out.println("Do you have more expenses? If so enter y, otherwise enter n");
			keyboard.nextLine();
			moreExpenses = keyboard.nextLine().charAt(0);
		}

		if(totalExpenses < amountBudgeted)
		{
			System.out.println("You were under budget by: $" + (amountBudgeted - totalExpenses));
		}

		else if(totalExpenses > amountBudgeted)
		{
			System.out.println("You were over budget by: $" + (amountBudgeted - totalExpenses));
		}

		else
		{
			System.out.println("You were exactly on budget");
		}
	}
}