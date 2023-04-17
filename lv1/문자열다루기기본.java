package Programmers_Java.lv1;

public class 문자열다루기기본 {
    public static void main(String[] args) {
        String s = "1234";
        boolean answer = true;

        boolean isDigit = true;

        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) {
                isDigit = false;
                break;
            }
        }

        if ((s.length() == 4 || s.length() == 6) && isDigit){
            answer = true;
        }else {
            answer = false;
        }
        System.out.println(answer);

    }
}
