package Programmers_Java.lv1;

import java.util.ArrayList;

public class 같은숫자는싫어 {
    public static void main(String[] args) {
        int[] arr = {4,4,4,3,3};
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(arr[0]);
        int index = 0;
        for (int i = 1; i < arr.length; i++) {
            if(list.get(index) == arr[i]){
                continue;
            }else {
                list.add(arr[i]);
                index++;
            }
        }
        System.out.println(list);
    }
}
