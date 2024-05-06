package kyu6.without_test;
import java.util.Date;

import java.util.Calendar;
import java.util.GregorianCalendar;
public class MinsToMid {
    public static void main(String[] args) {

    }
}




class Minute{

    public String countMinutes(Date d){
        long minutes = ((86_400_000 - d.getTime()%86_400_000) / 1000 / 60);
        return minutes == 1? "1 minute": Long.toString(minutes) + " minutes";
    }

}