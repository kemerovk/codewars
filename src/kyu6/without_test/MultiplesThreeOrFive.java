package kyu6.without_test;

public class MultiplesThreeOrFive {
    public static void main(String[] args) {

    }
}



class Solution{
    public int solution(int number) {
        int summ = 0;
        if (number <= 0) return 0;
        else {
            for (int i = 1; i < number; i++){
                if (i % 15 == 0) summ += i;
                else if (i%5==0) summ += i;
                else if (i%3==0)summ += i;
            }
            return summ;

        }
    }
}