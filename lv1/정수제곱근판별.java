package Programmers_Java.lv1;

public class 정수제곱근판별 {
    public static void main(String[] args) {
        long n = 11;
        long answer = 0;
        for (long i = 1; i <= n; i++) {
            if(n / i == i && n % i == 0){
                answer = (i+1) * (i+1);
                break;
            }
            else {
                answer = -1;

            }
        }
        System.out.println(answer);
    }
}
