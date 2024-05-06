package kyu5.with_test.non_repeating;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;

public class Characteristic {
    public static void main(String[] args) {
        System.out.println(Char.firstNonRepeatingLetter("moon-men"));
    }
}

class Char{
    public static String firstNonRepeatingLetter(String s){
        String c = "";
        for (int i = 0; i < s.length(); i++){
            c = String.valueOf(s.charAt(i));
            s = s.replaceFirst(c, " ");
            if (!s.contains(c.toLowerCase()) && !s.contains(c.toUpperCase())) return c;
            s = s.replaceAll(c.toLowerCase(), " ").replaceAll(c.toUpperCase(), " ");
        }
        return "";
    }
}
