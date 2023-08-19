package com.kn.selection;
import java.util.Scanner;

public class EvenOrOdd {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Take the input from user
		System.out.println("Enter the number= ");
		int num = scan.nextInt();

		checkTheNumberIsEvenOrOdd(num);
		scan.close();
	}

	public static void checkTheNumberIsEvenOrOdd(int num) {
		//Checking the given number is even or odd
		if (num % 2 == 0) {
			//print Even number message
			System.out.println("The given number " + num + " is Even");
		} else {
			//print Odd number message
			System.out.println("The given number " + num + " is Odd");
		}
	}
}
