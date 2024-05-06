package kyu7;

import java.util.Arrays;


public class VowelCount {
}


class Vowel{
    public static int getCount(String str){
        return str.length() - str.replace("a", "").replace("i", "").replace("u", "").replace("o", "").replace("e", "").length();
    }
}