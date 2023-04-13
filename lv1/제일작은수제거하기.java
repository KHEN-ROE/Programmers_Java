package Programmers_Java.lv1;

import java.util.ArrayList;

public class 제일작은수제거하기 {
    public static void main(String[] args) {
        int[] arr = {4,1,2,3};
        ArrayList<Integer> list = new ArrayList<>();

        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            min = Math.min(arr[i], min);
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != min){
                list.add(arr[i]);
            }
        }

        System.out.println(list);

    }
}
