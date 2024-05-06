package kyu6.without_test;

public class Tribonacci {
    public static void main(String[] args) {
            TriSequence.printArray(TriSequence.tribonacci(new double []{1,1,1},10));
        }
}



class TriSequence{
    public static double[] tribonacci(double[] s, int n){
        if (n == 0) return new double[0];
        double[] array = new double[n];

        for (int i = 0; n < s.length? i < n: i < s.length; i++) array[i] = s[i];
        for (int i = s.length; i < n; i++){
            array[i] = array[i-1] + array[i-2] + array[i-3];
        }

        return array;
    }

    static void printArray(double[] array){
        for (double db: array){
            System.out.print(db + " ");
        }
    }
}
