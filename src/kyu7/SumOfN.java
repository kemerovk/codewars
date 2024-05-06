package kyu7;

import java.text.DecimalFormat;
public class SumOfN {
    public static void main(String[] args) {

    }
}




 class NthSeries {

    public static String seriesSum(int n) {

        float divided = 1f;
        float sum = 0f;
        float now = 1f;
        for (int i = 1; i <= n; i++){
            sum += now;
            divided += 3;
            now = 1 / divided;
        }
        return String.format("%.2f", sum);
    }
}