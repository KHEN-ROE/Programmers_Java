package Programmers_Java.lv1;

public class 부족한금액계산하기 {
    public static void main(String[] args) {
        int price = 3;
        int money = 20;
        int count = 4;
        long answer = 0;

        long sum = 0;

        for (int i = 0; i <= count; i++) {
            sum += price * i;
        }
        if(money - sum >= 0){
            answer = 0;
        }else {
            answer = Math.abs(money - sum);
        }


        System.out.println(answer);
    }
}
