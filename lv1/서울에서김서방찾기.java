package Programmers_Java.lv1;

public class 서울에서김서방찾기 {
    public static void main(String[] args) {
        String[] seoul = {"Jane", "Kim"};
        String answer = "";
        int idx = 0;
        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                idx=i;
            }
        }
        answer = "김서방은 "+idx+"에 있다";
        System.out.println(answer);

    }
}
