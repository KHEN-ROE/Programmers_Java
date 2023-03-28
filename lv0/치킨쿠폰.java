package Programmers_Java.lv0;

public class 치킨쿠폰 {
    public static void main(String[] args) {
        int chicken = 1081; // 쿠폰수
        int answer = 0; // 쿠폰으로 바꿀 수 있는 치킨 수
        int coupon = chicken;

        for(int i = 0; i <chicken; i++){

            answer += coupon / 10;
            coupon = coupon - ((coupon / 10) * 10)  + coupon / 10;

            if(coupon <=10 ) {
                answer += coupon / 10;
                break;
            }
        }
        System.out.println(answer);






//        answer = chicken / 10;
//        coupon = coupon - (answer * 10)  + answer;
//
//        answer += coupon / 10;
//        coupon = coupon - ((coupon / 10) * 10)  + coupon / 10;
//
//        answer += coupon / 10;
//        coupon = coupon - ((coupon / 10) * 10)  + coupon / 10;
//
//        answer += coupon / 10;



    }
}
