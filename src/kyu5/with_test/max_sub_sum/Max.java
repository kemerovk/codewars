package kyu5.with_test.max_sub_sum;

public class Max {
    public static void main(String[] args) {

    }
}


class Helper{
    public static int sequence(int[] arr){
        boolean atLeastOnePositive = false;
        int maxSum = 0;
        int sum;
        if (arr.length != 0) {
            for (int i = 0; i < arr.length - 1; i++){
                sum = arr[i];
                for (int j = i + 1; j < arr.length; j++){
                    sum += arr[j];
                    if (arr[j] > 0 && arr[i] > 0) atLeastOnePositive = true;
                    if (sum > maxSum) maxSum = sum;
                }
            }
            if (atLeastOnePositive) return maxSum;
            return 0;
        }
        return 0;
    }


}