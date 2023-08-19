package com.kn.selection;
import java.util.Scanner;

public class CheckcharacterCase {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your alphabet= ");
		char alphabet = scan.next().charAt(0);

		checkCharacterCaseValues(alphabet);
		scan.close();
	}

	public static void checkCharacterCaseValues(char alphabet) {
		if (alphabet >= 65 && alphabet <= 90) {
			System.out.println("The given " + alphabet + " is in UpperCase");
		} else if (alphabet >= 97 && alphabet <= 122) {
			System.out.println("The given " + alphabet + " is in LowerCase");
		} else if (alphabet >= 48 && alphabet <= 57) {
			System.out.println("The given " + alphabet + " is in digit");
		} else {
			System.out.println("It's a Special Charcter");
		}
	}

}
