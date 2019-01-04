import javax.swing.JOptionPane;

public class Chapter4Problem12
{
	public static void main (String[] args)
	{
		int numberOfStores = 5;
		String userStringInput;
		double storeSales;
		int numberOfHundredDollarDivisions;
		String outputString = "SALES BAR CHART\n";

		for(int store = 1; store <= numberOfStores; store++)
		{
			userStringInput = JOptionPane.showInputDialog("Enter today's sales for store: " + store);
			storeSales = Double.parseDouble(userStringInput);
			numberOfHundredDollarDivisions = (int)(storeSales/100);
			outputString += "Store " + store + ": ";
			for(int printAsterisk = 1; printAsterisk <= numberOfHundredDollarDivisions; printAsterisk++)
			{
				outputString += "*";
			}
			outputString += "\n";

		}

		JOptionPane.showMessageDialog(null, outputString);
		System.exit(0);
	}
}