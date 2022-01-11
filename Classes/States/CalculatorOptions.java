package Classes.States;

import java.util.Scanner;
import Classes.Utility.*;

public class CalculatorOptions
{
	public void CalcOpts()
	{
		Scanner input = new Scanner(System.in);
		Calculator Calc = new Calculator();

		var option = 0;

		System.out.print("Open calculator?\n[1] Yes | [2] No\n");
		option = input.nextInt();

		switch (option)
		{
			case 1:
				Calc.Open();
				break;

			case 2:
				System.out.println("Operation Cancelled.");
				break;
		}
		input.close();
	}
}
