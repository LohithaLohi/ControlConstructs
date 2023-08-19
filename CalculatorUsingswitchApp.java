package com.kn.selection;
import java.util.Scanner;

public class CalculatorUsingswitchApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		CalculatorUsingSwitch c1 = new CalculatorUsingSwitch();
		System.out.println("Enter the num1= ");
		int num1 = scan.nextInt();
		System.out.println("Enter the num2= ");
		int num2 = scan.nextInt();
		System.out.println("Enter your Choice= ");
		System.out.println("+ -->Addition - -->Substraction * -->Multiplication / -->Division % -->Modulo division");
		char choice = scan.next().charAt(0);
		c1.arthmeticOperator(choice, num1, num2);
		scan.close();
	}

}
