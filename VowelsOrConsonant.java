package com.kn.selection;
import java.util.Scanner;

public class VowelsOrConsonant {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Take the input from the user
		System.out.println("Enter the alphabet= ");
		char alphabet = scan.next().charAt(0);
		checkTheCharIsVowelOrConsonant(alphabet);
		scan.close();
	}

	public static void checkTheCharIsVowelOrConsonant(char alphabet) {
		// Checking the given alphabets are vowels or consonants
		if (alphabet == 'a' || alphabet == 'e' || alphabet == 'i' || alphabet == 'o' || alphabet == 'u'
				|| alphabet == 'A' || alphabet == 'E' || alphabet == 'I' || alphabet == 'O' || alphabet == 'U') {
			// print vowels message
			System.out.println("This characters are vowels");
		} else {
			// print consonants message
			System.out.println("This characters are Consonants");
		}
	}
}
