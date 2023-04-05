package Programmers_Java.lv1;

import java.util.Arrays;

public class 정수내림차순으로배치하기 { //답은 나오는데 코드가 너무 길다
    public static void main(String[] args) {
        long n = 118372;
        long answer = 0;
        //문자열로 변환
        String s = Long.toString(n);
        //잘라서 배열에 저장
        String [] str = s.split("");
        //정수 배열로 변환
        int arr [] = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        //정수 배열을 오름차순으로 정렬
        Arrays.sort(arr);
        //내림차순으로 정렬
        int index = 0;
        int [] arr1 = new int[arr.length];
        for(int i = arr.length - 1; i >= 0; i--){
            arr1[index] = arr[i];
            index++;
        }
        String result = "";
        for (int i = 0; i < arr1.length; i++) {
            result += Integer.toString(arr1[i]);
        }
        answer = Long.parseLong(result);
        System.out.println(answer);
        
        /* 이거 참고 - 짧은 코드
        String[] list = String.valueOf(n).split("");
        Arrays.sort(list);

        StringBuilder sb = new StringBuilder();
        for (String aList : list) sb.append(aList);

        return Long.parseLong(sb.reverse().toString());
         */
        
    }
}
