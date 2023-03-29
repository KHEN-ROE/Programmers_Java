package Programmers_Java.lv0;

import java.util.ArrayList;

public class 유한소수판별하기 {
    public static void main(String[] args) {
        int a = 2;
        int b = 30;
        int answer = 0;
        int gcd = 0;

        ArrayList<Integer> list = new ArrayList<>(); // 공약수 담을 리스트

        //공약수를 구한다
        for (int i = 1; i < b; i++) {
            if (a % i == 0 && b % i == 0) {
                list.add(i);
            }
        }
        System.out.println("공약수 : " + list);

        //최대공약수 = 공약수 중 가장 큰 수
        for (int i = 0; i < list.size(); i++) {
            gcd = list.get(i);
            if (list.get(i) > gcd) {
                gcd = list.get(i);
            }
        }
        System.out.println("최대공약수 : " + gcd);

        int b1 = b / gcd; // 기약분수 형태로 바꾸는데, 분모만 필요하니까 분모만 최대공약수로 나눔
        //소인수 구하기
        //일단 약수를 구한다. 약수를 담을 리스트 하나 선언
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 2; i <= b1; i++) {
            if (b1 % i == 0) {
                list2.add(i);
            }
        }
        System.out.println("기약분수 분모의 약수 : " + list2);
        //약수 중 소수만 남기고 제거
        for (int i = 0; i < list2.size(); i++) {
            if (list2.get(i) == 2) continue;
            for (int j = 2; j < list2.get(i); j++) {
                if (list2.get(i) % j == 0) {
                    list2.remove(list2.get(i));
                    j = 2;

                    //반복문 중단 조건
                    if (i >= list2.size()) break;
                }
            }
        }
        System.out.println("소인수 : " + list2);

        //소인수가 2 or 5 이면 answer = 1
        for (int i = 0; i < list2.size(); i++) {
            if (list2.get(i) == 2 || list2.get(i) == 5) {
                answer = 1;
            } else {
                answer = 2;
                break;
            }
        }
        System.out.println("답 : " + answer);
    }
}
