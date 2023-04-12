package Programmers_Java.lv1;

public class 없는숫자더하기 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 6, 7, 8, 0};
        int answer = 0;

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        int sum1 = 0;
        for (int i = 0; i < 10; i++) {
            sum1 += i;
        }

        answer = sum1 - sum;

        System.out.println(answer);
    }
}