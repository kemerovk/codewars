package kyu8;

public class RemoveMarks {
    public static void main(String[] args) {

    }
}



class Solution {
    static String removeExclamationMarks(String s) {
        s = s.replaceAll("!", "");
        return s;
    }
}
