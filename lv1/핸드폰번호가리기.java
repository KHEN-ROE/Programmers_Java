package Programmers_Java.lv1;

public class 핸드폰번호가리기 {
    public static void main(String[] args) {
        String phone_number = "027778888";
        StringBuilder answer = new StringBuilder();
        String[]str = phone_number.split("");

        for(int i = 0; i < str.length-4; i++){
            str[i] = str[i].replaceAll(str[i], "*");
        }
        for (String s : str) {
            answer.append(s);
        }
        System.out.println(answer);
    }
}
