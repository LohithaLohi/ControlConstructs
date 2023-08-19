package com.kn.selection;
import java.util.Scanner;

public class RainbowUsingSwitch {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the color= ");
		char color = scan.next().charAt(0);
		findRainbowColor(color);
		scan.close();
	}
		public static void findRainbowColor(char color)
		{
		switch(color) {
		case 'V':
		case 'v':
			System.out.println("The color is Violent");
			break;
		case 'I':
		case 'i':
			System.out.println("The color is Indigo");
			break;
		case 'G':
		case 'g':
			System.out.println("The color is Green");
			break;
		case 'Y':
		case 'y':
			System.out.println("The color is Yellow");
			break;
		case 'B':
			System.out.println("The color is Blue");
			break;
		case 'O':
		case 'o':
			System.out.println("The color is Orange");
			break;
		case 'R':
		case 'r':
			System.out.println("The color is Red");
			break;
		default:
			System.out.println("Invalid Option");
		}
	}
}
