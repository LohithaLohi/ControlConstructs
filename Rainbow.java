package com.kn.selection;
import java.util.Scanner;

public class Rainbow {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the alphabet= ");
		char alphabet = scan.next().charAt(0);

		findRainbowColor(alphabet);
		scan.close();
	}

	public static void findRainbowColor(char alphabet) {
		if (alphabet == 'V' || alphabet == 'v') {
			System.out.println("The Violent color is in the Rainbow");
		} else if (alphabet == 'I' || alphabet == 'i') {
			System.out.println("The Indigo color is in the Rainbow");
		} else if (alphabet == 'B' || alphabet == 'b') {
			System.out.println("The Blue color is in the Rainbow");
		} else if (alphabet == 'G' || alphabet == 'g') {
			System.out.println("The Green color is in the Rainbow");
		} else if (alphabet == 'Y' || alphabet == 'y') {
			System.out.println("The Yellow color is in the Rainbow");
		} else if (alphabet == 'O' || alphabet == 'o') {
			System.out.println("The Orange color is in the Rainbow");
		} else if (alphabet == 'R' || alphabet == 'r') {
			System.out.println("The Red color is in the Rainbow");
		} else {
			System.out.println("The given color is not in the Rainbow");
		}
	}
}
