package com.kn.selection;

public class WeekDay {
	void findDay(int num) {
		if (num == 1) {
			System.out.println("The day is Sunday");
		} else if (num == 2) {
			System.out.println("The day is Monday");
		} else if (num == 3) {
			System.out.println("The day is Tuesday");
		} else if (num == 4) {
			System.out.println("The day is Wednesday");
		} else if (num == 5) {
			System.out.println("The day is Thursday");
		} else if (num == 6) {
			System.out.println("The day is Friday");
		} else if (num == 7) {
			System.out.println("The day is Saturday");
		} else {
			System.out.println("The day is not in the week");
		}
	}
}
