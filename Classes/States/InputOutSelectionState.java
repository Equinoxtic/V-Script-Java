package Classes.States;

import Classes.Utility.*;
import java.util.Scanner;

public class InputOutSelectionState
{
	public void IOSelection()
	{
		Scanner input = new Scanner(System.in);
		InputOut IO = new InputOut();

		var curSelected = 0;

		System.out.print("Select an option:\n[1] Input String | [2] Input Integer | [3] Input Float | [4] Input Double\n");
		curSelected = input.nextInt();

		switch (curSelected)
		{
			case 1:
				IO.InputStr();
				break;

			case 2:
				IO.InputInt();
				break;

			case 3:
				IO.InputFloat();
				break;

			case 4:
				IO.InputDouble();
				break;
		}
		input.close();
	}
}
