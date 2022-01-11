package Classes.Utility;

import java.util.Scanner;

public class Calculator
{
	int a;
	int b;
	int curOper;
	public void Open()
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Input your first number: ");
		a = input.nextInt();

		System.out.print("\nInput your second number: ");
		b = input.nextInt();

		System.out.println("Select an operation:\n[1] Addition\n[2] Subtraction\n[3] Multiplication\n[4] Division");

		switch (curOper)
		{
			case 1:
				System.out.println(a+b);
				break;

			case 2:
				System.out.println(a-b);
				break;

			case 3:
				System.out.println(a*b);
				break;

			case 4:
				System.out.println(a/b);
				break;
		}
		input.close();
	}
}
