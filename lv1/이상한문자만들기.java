package Programmers_Java.lv1;

public class 이상한문자만들기 {
    public static void main(String[] args) {
        String s = "   try   hello   world   ";
        String answer = "";

        String[] str = s.split(" ", -1);

        // 공백이 여러개면 공백이 있는 그 형태로 리턴해야함??
        for (int i = 0; i < str.length; i++) {
            if( i == str.length-1){
                if(str[i].equals("")){
                    break;
                }
            }
            if (str[i].equals("")) {
                answer += " ";
                continue;
            }
            String s2 = "";
            String head = "";
            String body = "";
            s2 = str[i];
            head = String.valueOf(s2.charAt(0)).toUpperCase();
            String[] str2 = s2.split("");
            for (int j = 1; j < str2.length; j++) {
                if (j % 2 == 0) { // 짝수 인덱스
                    body += str2[j].toUpperCase();
                } else {
                    body += str2[j].toLowerCase();
                }
            }
            answer += head + body;
            if (i != str.length - 1) {
                answer += " ";
            }
        }
        System.out.println(answer); //
    }

}
