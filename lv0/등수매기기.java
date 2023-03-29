package Programmers_Java.lv0;

import java.util.Arrays;
import java.util.Collections;

public class 등수매기기 {
    public static void main(String[] args) {
        int[][] score = {{80, 70}, {90, 50}, {40, 70}, {50, 80}};
        int[]answer = new int[score.length];
        int[]arr = new int[score.length];
        int max = 0;
        int min = 201;
        int rank = 0;

        //점수의 합계
        for(int i = 0; i < score.length; i++){
            arr[i] = score[i][0] + score[i][1];
        }

        //원본 배열과 정렬된 배열을 비교할 예정
        int arr1[] = arr.clone(); // 원본 배열 복제
        Arrays.sort(arr, Collections.reverseOrder()); // 원본 배열을 내림차순으로 정렬

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if(arr[i] == arr1[j]){
                    arr1[j] = arr[i].indexOf();
                }
            }
        }


        //일단 최대값을 구해본다
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max) {
                max = arr[i];
                answer[i] = max;
                answer[i] = 1;
            }
        }
        System.out.println(max + "," + min);

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < max){

            }
        }

    }
}
