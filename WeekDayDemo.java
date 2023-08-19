package com.kn.selection;
import java.util.Scanner;

public class WeekDayDemo {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		WeekDay weekday=new WeekDay();
		System.out.println("Enter the num= ");
		int num=scan.nextInt();
		
		weekday.findDay(num);
		scan.close();
	}

}
