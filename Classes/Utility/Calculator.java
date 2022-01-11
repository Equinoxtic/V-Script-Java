package Classes.Utility;

import java.util.Scanner;

public class Calculator
{
	public void Open()
	{
		Scanner input = new Scanner(System.in);

		var a = 0;
		var b = 0;
		var curOper = "";

		System.out.print("Input your first number: ");
		a = input.nextInt();

		System.out.print("\nInput your second number: ");
		b = input.nextInt();

		System.out.println("Select an operation:\n[add] Addition\n[subtract] Subtraction\n[multiply] Multiplication\n[divide] Division");

		switch (curOper)
		{
			case "add":
				System.out.println(a+b);
				break;

			case "subtract":
				System.out.println(a-b);
				break;

			case "multiply":
				System.out.println(a*b);
				break;

			case "divide":
				System.out.println(a/b);
				break;
		}
		input.close();
	}
}
