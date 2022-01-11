import Classes.States.*;
import Classes.Utility.*;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		InputOutSelectionState IoSelect = new InputOutSelectionState();
		CalculatorOptions CalcOptions = new CalculatorOptions();
		Out wrln = new Out();

		var curAction = 0;

		wrln.lnStr("Select an action:\n[1] Basic Input | [2] Calculator\n");
		curAction = input.nextInt();

		switch (curAction)
		{
			case 1:
				IoSelect.IOSelection();
				break;

			case 2:
				CalcOptions.CalcOpts();
				break;
		}
		input.close();
	}
}
