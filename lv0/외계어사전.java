package Programmers_Java.lv0;

import java.util.Arrays;

public class 외계어사전 {

    public static void main(String[] args) {
        String[] spell = {"a", "a", "a"};
        String[] dic = {"aba", "dww", "dzx", "loveaw"};
        int answer = 0;

        //오름차순으로 정렬하여 비교
        Arrays.sort(spell);

        String sp = ""; // spell배열을 하나의 문자열로 만들기 위한 변수
        String s = ""; //dic배열의 원소를 저장할 문자열
        String s1 = ""; //dic원소를 오름차순으로 정렬하고 저장할 문자열

        //spell과 dic배열의 원소를 문자열로 만들어야 함. spell 먼저 문자열로 변환
        for (int i = 0; i < spell.length; i++) {
            sp += spell[i];
        }

        //단어 자르고 정렬해서 저장할 배열
        String[] str = new String[dic.length];

        for (int i = 0; i < dic.length; i++) {  //잘라서 배열에 저장하고 정렬
            s = dic[i]; //문자열에 일단 단어 저장
            str = s.split(""); // 잘라서 배열에 넣고
            Arrays.sort(str); // 정렬
            //하나의 문자열로 만들어야 함.
            for (int j = 0; j < str.length; j++) {
                s1 += str[j];
            }
            if (s1.contains(sp)) {
                answer = 1;
                break;
            } else {
                answer = 2;
                s1 = "";
            }
        }
        System.out.println("answer : " + answer);
    }

}
