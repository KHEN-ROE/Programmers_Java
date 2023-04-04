package Programmers_Java.lv1;

public class 자릿수더하기 {
    public static void main(String[] args) {
        int n = 987;
        int answer = 0;
        String s = Integer.toString(n);
        String[]str = s.split("");
        for (int i = 0; i < str.length; i++) {
            answer += Integer.parseInt(str[i]);
        }
        System.out.println(answer);
    }
}
