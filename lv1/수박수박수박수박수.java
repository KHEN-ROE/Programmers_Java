package Programmers_Java.lv1;

public class 수박수박수박수박수 {
    public static void main(String[] args) {
        int n = 7;
        String answer = "";

        String s = "수박";
        String s1 = "수";

        if(n%2 == 0){
            answer = s.repeat(n/2);
        }else if (n % 2 != 0) {
            answer = s.repeat(n/2) + s1;
        }
        System.out.println(answer);

    }
}
