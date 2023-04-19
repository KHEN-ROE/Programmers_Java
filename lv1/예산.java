package Programmers_Java.lv1;

import java.util.Arrays;

public class 예산 {
    public static void main(String[] args) {
        int[] d = {1, 3, 2, 5, 4};
        int budget = 9;
        int answer = 0;

        //방법2
        Arrays.sort(d);
        for (int i = 0; i < d.length; i++) {
            budget -= d[i];
            if(budget < 0) {
                break;
            }
            answer++;
        }
        System.out.println(answer);






        //방법1
//        Arrays.sort(d);
//        int sum = 0;
//        for (int i = 0; i < d.length; i++) {
//            sum += d[i];
//            if (sum > budget) {
//                answer = i;
//                break;
//            }
//        }
//        if(sum <= budget){
//            answer = d.length;
//        }
//        System.out.println(answer);
    }
}
