package Programmers_Java.lv1;

public class 가운데글자가져오기 {
    public static void main(String[] args) {
        String s = "qwer";
        String answer = "";

        String[] str = s.split("");
        if (str.length % 2 != 0) {
            answer = str[str.length/2];
        }else if (str.length % 2 == 0) {
            answer = str[(str.length / 2) - 1];
            answer += str[(str.length / 2)];
        }

        System.out.println(answer);

    }
}
