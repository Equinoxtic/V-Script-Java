package Classes.Utility;

import java.util.Scanner;

public class InputOut
{
	public void InputStr()
	{
		Scanner input = new Scanner(System.in);

		var curString = "";

		System.out.print("Input some text for your String: ");
		curString = input.nextLine();
		System.out.println("String: " + curString);

		input.close();
	}

	public void InputInt()
	{
		Scanner input = new Scanner(System.in);

		var curInt = 0;

		System.out.print("Input some numbers for your Integer: ");
		curInt = input.nextInt();
		System.out.println("Integer: " + curInt);

		input.close();
	}

	public void InputFloat()
	{
		Scanner input = new Scanner(System.in);

		var curFloat = 0.0;

		System.out.print("Input some numbers for your Float: ");
		curFloat = input.nextFloat();
		System.out.println("Float: " + curFloat);

		input.close();
	}

	public void InputDouble()
	{
		Scanner input = new Scanner(System.in);

		var curDouble = 0.0;

		System.out.print("Input some numbers for your double: ");
		curDouble = input.nextDouble();
		System.out.println("Double: " + curDouble);

		input.close();
	}
}
