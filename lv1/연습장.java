package Programmers_Java.lv1;

import java.util.Scanner;

public class 연습장 {
    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("양의 정수만 입력");
            int n = sc.nextInt();
            System.out.println("you input : " + n);
        }catch (Exception e) {
            System.out.println("정수만 입력하세요");
        }
    }
}
