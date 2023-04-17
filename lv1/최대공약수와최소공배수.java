package Programmers_Java.lv1;

import java.util.ArrayList;
import java.util.Arrays;

public class 최대공약수와최소공배수 {
    public static void main(String[] args) {
        int n = 3;
        int m = 20;
        int[] answer = new int[2];

        int max = 0;
        int min = 0;
        if (n < m) {
            min = n;
            max = m;
        } else {
            min = m;
            max = n;
        }
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 1; i <= min; i++) {
            if (min % i == 0 && max % i == 0) {
                list.add(i);
            }
        }
        int gcd = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > gcd) {
                gcd = list.get(i); // 최대공약수 구함
            }
        }
        int least = 0;
        least = (min * max) / gcd; // 최소공배수


        answer[0] = gcd;
        answer[1] = least;
        System.out.println(Arrays.toString(answer));

    }
}
