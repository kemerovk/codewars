package kyu5;

import java.math.BigInteger;


public class LastDigit{
    public static void main(String[] args) {

    }
}



class Solution{
    public static int lastDigit(BigInteger n1, BigInteger n2) {
        int first = n1.mod(new BigInteger("10")).intValue();
        int second = n2.mod(new BigInteger("1000")).intValue();
        if (second == 0 && n2.intValue() == 0) return 1;
        switch (first){
            case 1:
                return 1;
            case 2:
                while (second > 4){
                    second -= 4;
                }
                switch (second) {
                    case 1 -> {
                        return 2;
                    }
                    case 2 -> {
                        return 4;
                    }
                    case 3 -> {
                        return 8;
                    }
                    case 4 -> {
                        return 6;
                    }
                }
            case 3:
                while (second > 4){
                    second -= 4;
                }
                switch (second) {
                    case 1 -> {
                        return 3;
                    }
                    case 2 -> {
                        return 9;
                    }
                    case 3 -> {
                        return 7;
                    }
                    case 4 -> {
                        return 1;
                    }
                }
            case 4:
                if (second % 2 == 0) return 6;
                else return 4;
            case 5: return 5;
            case 6: return 6;
            case 7:
                while (second > 4){
                    second -= 4;
                }
                switch (second) {
                    case 1 -> {
                        return 7;
                    }
                    case 2 -> {
                        return 9;
                    }
                    case 3 -> {
                        return 3;
                    }
                    case 4 -> {
                        return 1;
                    }
                }
            case 8:
                while (second > 4){
                    second -= 4;
                }
                switch (second) {
                    case 1 -> {
                        return 8;
                    }
                    case 2 -> {
                        return 4;
                    }
                    case 3 -> {
                        return 2;
                    }
                    case 4 -> {
                        return 6;
                    }
                }
            case 9:
                if (second % 2 == 0) return 1;
                else return 9;
        }
        return 0;
    }
}