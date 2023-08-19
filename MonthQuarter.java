package com.kn.selection;
import java.util.Scanner;

public class MonthQuarter {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Month= ");
		String month = scan.next();
		switch (month) {
		case "January":
		case "Febuary":
		case "March":

			System.out.println("Quarter-4");
			break;

		case "April":
		case "May":
		case "June":

			System.out.println("Quarter-1");
			break;

		case "July":
		case "August":
		case "September":

			System.out.println("Quarter-2");
			break;

		case "October":
		case "November":
		case "December":

			System.out.println("Quarter-3");
			break;

		default:
			System.out.println("Invalid Month");
			scan.close();

		}
	}

}
