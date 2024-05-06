package kyu6.without_test;

import java.util.ArrayList;
import java.util.List;

public class RecToSquare {
    public static void main(String[] args) {

    }
}


class SqInRect{
    public static List<Integer> sqInRect(int lng, int wdth) {
        if (lng == wdth) return null;
        List<Integer> integers = new ArrayList<>();

        while (lng * wdth > 2)
        {
            integers.add(Math.min(lng, wdth));
            if (lng >= wdth) lng -= wdth;
            else wdth -= lng;
        }
        if (lng == 0 || wdth == 0) return integers;
        if (lng == 2 * wdth) {
            integers.add(wdth);
            integers.add(wdth);
        }
        else if (wdth == 2 * lng){
            integers.add(lng);
            integers.add(lng);
        }
        else {
            integers.add(1);
            integers.add(1);
        }
        return integers;
    }
}