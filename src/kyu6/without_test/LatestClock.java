package kyu6.without_test;

public class LatestClock {
    public static void main(String[] args) {

    }
}



class Kata {
    public static String latestClock(int a, int b, int c, int d) {
        String nowString = "";
        String maxString = "";
        int[] array = {a, b, c, d};
        for (int i = 0; i < 4; i++){
            nowString = "";
            if (array[i] > 2) continue;
            nowString += array[i];
            for (int j = 0; j < 4; j++){
                if (i == j || (array[i] == 2 && array[j] > 3)) continue;
                nowString = Integer.toString(array[i]);
                nowString += array[j];
                nowString += ":";
                for (int k = 0; k < 4; k++){
                    if (i == k || k == j || array[k] > 5) continue;
                    nowString = Integer.toString(array[i]) + array[j]  + ":";
                    nowString += array[k];
                    for (int z = 0; z < 4; z++){
                        if (i == z || z == j || z == k) continue;
                        nowString = Integer.toString(array[i]) + array[j] + ":" + array[k];
                        nowString += array[z];
                        if (nowString.compareTo(maxString) > 0) maxString = nowString;
                    }
                }
            }
        }
        return maxString;
    }
}
