package Programmers_Java.lv1;

import java.util.ArrayList;
import java.util.Collections;

public class 나누어떨어지는숫자배열 {
    public static void main(String[] args) {
        int[] arr = {2, 36, 1, 3};
        int divisor = 1;

        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % divisor == 0) {
                list.add(arr[i]);
            }
        }
        if(list.size() == 0) {
            list.add(-1);
        }
        Collections.sort(list);
        System.out.println(list);
    }
}
