package kyu6.without_test;

public class RotateArray {
    public static void main(String[] args) {

    }
}


class Rotator {

    public Object[] rotate(Object[] data, int n) {
        if (n == 0) return data;
        Object[] elements = new Object[data.length];


        if (n < 0){
            while (n < 0){
                n += data.length;
            }
        }
        int positioning = n % data.length;

        int k;
        // новый индекс во втором массиве

        for (int i = 0; i < data.length; i++){
            k = (i + positioning) % data.length;
            elements[k] = data[i];
        }

        return elements;
    }

}