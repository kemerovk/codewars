package kyu6.without_test;

public class Bouncing {
    public static void main(String[] args) {
        System.out.println(BouncingBall.bouncingBall(3.0, 0.66, 1.5));
    }
}


class BouncingBall{
    public static int bouncingBall(double h, double bounce, double window){
        if (h <= 0 || (bounce <= 0 || bounce >= 1) || window >= h) return -1;
        int count = 0;
        while (h > window){
            count++;
            h *= bounce;
            if (h > window) count++;
        }

        return count;
    }
    
}