package Programmers_Java.lv1;

import java.util.ArrayList;
import java.util.List;

public class 음양더하기 {
    public static void main(String[] args) {
        int[] absolutes = {1, 2, 3};
        boolean[] signs = {false, false, true};
        int answer = 0;

        for (int i = 0; i < absolutes.length; i++) {
            answer += absolutes[i];
        }
        List<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < signs.length; i++) {
            if (!signs[i]) {
                list.add(i);
            }
        }
        int[]arr = new int[list.size()];
        int sum=0;
        for (int i = 0; i < list.size(); i++) {
            arr[i] = absolutes[list.get(i)] * 2;
            sum += arr[i];
        }
        answer = answer - sum;

        System.out.println(answer);

    }
}
