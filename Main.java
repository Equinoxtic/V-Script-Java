import Classes.States.*;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		InputOutSelectionState IoSelect = new InputOutSelectionState();

		var curAction = 0;

		System.out.print("Select an action:\n[1] Basic Input\n");
		curAction = input.nextInt();

		switch (curAction)
		{
			case 1:
				IoSelect.IOSelection();
				break;
		}
		input.close();
	}
}