package com.kn.selection;
import java.util.Scanner;

public class ArthmeticoperationsDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArthmeticOperations operators = new ArthmeticOperations();
		System.out.println("Enter the first number= ");
		int num1 = scan.nextInt();
		System.out.println("Enter the second number= ");
		int num2 = scan.nextInt();
		System.out.println("Enter your Choice= ");
		System.out.println("+ -->Addition - -->Substraction * -->Multiplication / -->Division % -->Modulo division");
	    char choice = scan.next().charAt(0);
		operators.arthmeticOperators(choice, num1, num2);
		scan.close();
	}
}
