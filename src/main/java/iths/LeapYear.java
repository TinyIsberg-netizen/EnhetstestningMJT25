package iths;

public class LeapYear {
    public static boolean isLeapYear(int year) {
        if (year < 0) throw new IllegalArgumentException("Year cannot be negative");
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}