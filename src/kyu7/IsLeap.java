package kyu7;

public class IsLeap {
    public static void main(String[] args) {

    }
}



class LeapYears {

    public static boolean isLeapYear(int year) {
        if (year % 400 == 0) return true;
        if (year % 100 == 0) return false;
        if (year % 4 == 0) return true;
        return false;
    }
}