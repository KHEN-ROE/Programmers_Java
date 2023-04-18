package Programmers_Java.lv1;

import java.util.ArrayList;

public class 삼진법뒤집기 {
    public static void main(String[] args) {
        int n = 1;
        int answer = 0;

        ArrayList<Integer> list = new ArrayList<Integer>();

        int r = 0;
        int c = 0;

        //n이 1이면 answer 1인 코드 추가
        if (n != 1) {
            while (true) {
                list.add(n % 3);
                n = n / 3;
                if (n < 3) {
                    list.add(n);
                    break;
                }
            }
        }
        String s = "";
        if (list.size() > 0) {
            for (int i = 0; i < list.size(); i++) {
                s += Integer.toString(list.get(i));
            }
        }
        if (!s.equals("")) {
            answer = Integer.parseInt(s, 3);
        } else {
            answer = 1;
        }
        System.out.println(answer);


    }
}
