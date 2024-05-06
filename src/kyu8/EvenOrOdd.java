package kyu8;

public class EvenOrOdd {
    public static void main(String[] args) {
        System.out.println(Even.evenOrOdd(10));
    }
}


class Even{
    public static String evenOrOdd(int number){
        return number % 2 == 0? "Even": "Odd";
    }
}