package edu.kit.informatik;

import javax.swing.*;
import java.util.List;

public class WeekdayUtil {
    private static List<String> weekdays
            = List.of("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday");

    /**
     * @return the highest number of the letters in a weekday name
     */
    public static int getHighestNumberOfLetters() {
        return weekdays.stream()
                .mapToInt(String::length)
                .max()
                .orElse(0);  // getAsInt() would be possible too, but not robust against reflection
    }

    public static void addEuropaDay() {
        weekdays.add("Europe-Day");
    }

    /**
     * Opens a dialog with a motivation for the given day.
     * Prints "Have a large cup of coffee!" for Monday, "Stay focused!" for any other day.
     * If the given weekday is invalid, prints "You can do it!".
     *
     * @param weekday the weekday name
     */
    public static void getMotivation(String weekday) {
        JOptionPane.showMessageDialog(null, switch (weekday) {
            case "Monday" -> "Have a large cup of coffee!";
            case "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" -> "Stay focused!";
            default -> {
                String defaultOutput = "You can do ";
                defaultOutput += "it!";
                yield defaultOutput;
            }
        });
    }
}
