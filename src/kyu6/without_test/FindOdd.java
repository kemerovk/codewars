package kyu6.without_test;

import java.util.HashMap;

public class FindOdd {
    public static void main(String[] args) {
        System.out.println(Odd.findIt(new int[]{20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5}));
    }
}

class Odd{
    public static int findIt(int[] a){
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < a.length; i++){
            if (!map.containsKey(a[i])){
                map.put(a[i], 1);
            }
            else {
                count = map.get(a[i]);
                count++;
                map.replace(a[i], count);
            }
        }
        int cur = 0;
        for (Integer integer: map.keySet()){
            if (map.get(integer) % 2 == 1)
                cur = integer;
        }
        return cur;
    }


}