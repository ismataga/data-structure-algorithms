package org.mastercode.datastructurealgoritms;

public class TimeConversion {
    public static void main(String[] args) {
        System.out.println(timeConversion("07:05:45PM")); // Output: 19:05:45
        System.out.println(timeConversion("12:05:45PM")); // Output: 19:05:45
        System.out.println(timeConversion("19:05:45PM")); // Output: 19:05:45
        System.out.println(timeConversion("12:00:00AM")); // Output: 00:00:00
        System.out.println(timeConversion("03:00:00AM")); // Output: 00:00:00
        System.out.println(timeConversion("19:00:00AM")); // Output: 00:00:00
    }

    public static String timeConversion(String s) {
        int hour = Integer.parseInt(s.substring(0, 2));

        if (s.contains("AM")) {
            return hour == 12 ? String.format("%s%s", "00", s.substring(2, 8)) : s.substring(0, 8);
        } else {
            return hour == 12 ? String.format("%s%s", "12", s.substring(2, 8)) : String.format("%s%s", hour < 12 ? hour + 12 : hour, s.substring(2, 8));

        }
    }
}
