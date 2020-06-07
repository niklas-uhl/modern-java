package edu.kit.informatik;

import java.util.List;

public class WeekdayUtil {
	private static List<String> weekdays 
		= List.of("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday");
	
	/**
	 * 
	 * @return the highest number of the letters in a weekday name
	 */
	public static int getHighestNumberOfLetters() {
		//TODO: implement
		return 0;
	}
	
	public static void addEuropaDay() {
		weekdays.add("Europe-Day");
	}
	
	/**
	 * Opens a dialog with a motivation for the given day.
	 * Prints "Have a large cup of coffee!" for Monday, "Stay focused!" for any other day.
	 * If the given weekday is invalid, prints "You can do it!".
	 * @param weekday the weekday name
	 */
	public static void getMotivation(String weekday) {
		//TODO: implement
	}
}
