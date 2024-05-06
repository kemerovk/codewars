package kyu5.with_test.readable_time;

public class HumanReadable {
    public static String makeReadable(int seconds){
        String time = "";

        if (seconds / 3600 < 10) time += "0";
        time += Integer.toString(seconds / 3600) + ":";

        if (seconds % 3600 / 60 < 10) time += "0";
        time += Integer.toString(seconds % 3600 / 60) + ":";

        if (seconds % 3600 % 60  < 10) time += "0";
        time += Integer.toString(seconds%3600%60);

        return time;
    }
}


