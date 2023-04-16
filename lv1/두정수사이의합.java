package Programmers_Java.lv1;

public class 두정수사이의합 {
    public static void main(String[] args) {
        int a = 3;
        int b = 3;
        int max = 0;
        int min = 0;
        long answer = 0;
        if ( a > b ) {
            max = a;
            min = b;
        } else if (a < b) {
            max = b;
            min = a;
        }else {
            max = a;
            min = b;
        }
        for (int i = min; i <= max; i++) {
            answer += i;
        }
        System.out.println(answer);


    }
}