package kyu6.without_test;

public class Diamond {
    public static void main(String[] args) {

    }
}

class Diamondo {
    public static String print(int n) {
        if (n <= 0 || n % 2 == 0) return null;
        String str = "";
        int toOtstup;
        if (n > 1) toOtstup = n / 2;
        else toOtstup = 0;
        for (int i = 1; i <= n; i += 2){
            str += " ".repeat(toOtstup) + "*".repeat(i) + "\n";
            toOtstup -= 1;
        }
        toOtstup++;
        for (int j = n-2; j > 0; j-=2){
            toOtstup += 1;
            str += " ".repeat(toOtstup) + "*".repeat(j) + "\n";
        }
        return str;
    }
}