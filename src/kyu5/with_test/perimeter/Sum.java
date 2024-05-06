package kyu5.with_test.perimeter;

import java.math.BigInteger;

public class Sum {
    public static void main(String[] args) {
        System.out.println(SumFct.fibonacci(BigInteger.valueOf(7)));
    }
}




class SumFct{

    public static BigInteger fibonacci(BigInteger n){
        BigInteger perimeter = BigInteger.valueOf(8);
        BigInteger cur = BigInteger.valueOf(1);
        BigInteger prev = BigInteger.valueOf(1);
        for (long i = 2; i<=n.longValue(); i++){
            cur = cur.add(prev);
            prev = cur.subtract(prev);
            perimeter = perimeter.add(cur.multiply(BigInteger.valueOf(4)));
        }
        return perimeter;
    }
}