package com.kn.selection;
import java.util.Scanner;

public class VotingEligibilityCheck {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Take input from user
		System.out.println("Enter your age= ");
		int age = scan.nextInt();
		checkEligibilityForVotingOrNot(age);
		scan.close();
	}

	public static void checkEligibilityForVotingOrNot(int age)
	{
		//Checking eligibility for voting
		if(age>=18)
		{
			//print eligibility message
			System.out.println("Eligible for voting");
		}else {
			//print Non-Eligibility message
			System.out.println("NotEligibilty for voting");
		}
		
	}
}
