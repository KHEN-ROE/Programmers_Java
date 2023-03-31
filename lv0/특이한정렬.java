package Programmers_Java.lv0;

import java.util.Arrays;

public class 특이한정렬 {
    public static void main(String[] args) {
        int[] numlist = {1, 2, 3, 4, 5, 6};
        int n = 4;
        int answer[] = new int[numlist.length];
        int arr[] = new int[numlist.length];
        for (int i = 0; i < numlist.length; i++) {
            arr[i] = Math.abs(numlist[i] - n);
        }

        Arrays.sort(arr);
        //arr은 numlist[i]에서 n뺀 배열

        int index = 1;
        for (int i = 0; i < numlist.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(Math.abs(numlist[i]-n) == arr[j]) {
                    if( j != arr.length-1){
                        if(arr[j]==arr[j+1]){
                            answer[j] = numlist[i+n];
                            break;
                        }else {
                            answer[j] = numlist[i];
                            break;
                        }
                    }
                    else {
                        answer[j] = numlist[i];
                    }



                }
            }
        }
        for(int a : answer){
            System.out.println(a);
        }

    }

}
