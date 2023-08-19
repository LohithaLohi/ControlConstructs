package com.kn.selection;

public class CalculatorUsingSwitch {
	void arthmeticOperator(char choice, int num1, int num2) {
		switch (choice) {
		case '+':
			System.out.println("The Addition of two numbers= " + (num1 + num2));
			break;
		case '-':
			System.out.println("The Substraction of two numbers= " + (num1 - num2));
			break;
		case '*':
			System.out.println("The Multiplication of two numbers= " + (num1 * num2));
			break;
		case '/':
			System.out.println("The Division of two numbers= " + (num1 / num2));
			break;
		case '%':
			System.out.println("The Modulo of two numbers= " + (num1 % num2));
			break;
		default:
			System.out.println("Invalid Option");
		}
	}
}
