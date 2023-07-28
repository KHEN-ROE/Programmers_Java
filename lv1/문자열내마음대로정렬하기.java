package Programmers_Java.lv1;

import java.util.Arrays;

public class 문자열내마음대로정렬하기 {
    public static void main(String[] args) {
        String[] strings = {"sun", "bed", "car"};
        int n = 1;
        // n번 째 값을 추출하고 sort 시킴
        // sort된 인덱스 순으로 strings 배열 재정렬
        // 정렬해서 같으면 -> 사전 순 정렬
        
        //n번째 인덱스 값 추출할 배열
        String[]str = new String[strings.length];
        //strings 배열을 split해서 저장할 2차원 배열
        String strings2 = "";

        for (int i = 0; i < strings.length; i++) {
            strings2 += Arrays.toString(strings[i].split(""));

        }
        System.out.println(strings2);
        
    }
}
