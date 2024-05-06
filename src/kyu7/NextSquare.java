package kyu7;

public class NextSquare {
    public static void main(String[] args) {

    }
}




 class NumberFun {
    public static long findNextSquare(long x) {
        long floor = (long) (Math.sqrt(x) - 0.1);
        if ((floor + 1) * (floor + 1) == x){
            return (floor+2) * (floor+2);
        } return -1;
    }
}