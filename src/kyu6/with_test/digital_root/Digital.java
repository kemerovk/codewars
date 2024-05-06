package kyu6.with_test.digital_root;

public class Digital {
    public static void main(String[] args) {
        
    }
}


class DigitalRoot{
    public static int digital_root(int n){
        if (n < 10) return n;
        int sum = 0;
        while (n > 0){
            sum += n % 10;
            n /= 10;
        }
        return digital_root(sum);
    }
}