package com.kn.selection;

public class ArthmeticOperations {
	void arthmeticOperators(char choice, int num1, int num2) {
		if (choice == '+') {
			System.out.println("The addition of two numbers=" + (num1+num2));
		} else if (choice == '-') {
			System.out.println("The substraction of two numbers=" + (num1-num2));
		} else if (choice == '*') {
			System.out.println("The multiplication of two numbers=" + (num1*num2));
		} else if (choice == '/') {
			System.out.println("The division of two numbers=" + (num1/num2));
		} else if (choice == '%') {
			System.out.println("The modulo of two numbers=" + (num1%num2));
		} else {
			System.out.println("Invalid result");
		}
	}
}
