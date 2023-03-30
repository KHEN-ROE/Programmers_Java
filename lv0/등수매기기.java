package Programmers_Java.lv0;

import java.util.Arrays;
import java.util.Collections;

public class 등수매기기 {
    public static void main(String[] args) {
        int[][] score = {{1, 3}, {3, 1}, {2, 3}, {3, 2}, {1, 2}, {0, 0}};
        int[]arr = new int[score.length];

        //점수의 합계
        for(int i = 0; i < score.length; i++){
            arr[i] = score[i][0] + score[i][1];
        }
        //arr에 점수의 합계 저장된 상태다. arr이 원본임
        
        //원본 배열과 정렬된 배열을 비교할 예정
        Integer[] arr2 = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(arr2, Collections.reverseOrder());
        //arr2는 내림차순으로 정렬된 배열
        
        //원본 배열과 내림차순 정렬된 배열의 원소가 같으면 내림차순 정렬된 배열의 인덱스를 원본 배열의 원소에 대입
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if(arr[i] == arr2[j]){
                    arr[i] = (Arrays.asList(arr2).indexOf(arr2[j]))+1;
                    break;
                }
            }
        }
        for(int a : arr){
            System.out.println("index : " +     a);
        }

    }
}
