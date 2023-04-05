package Programmers_Java.lv1;

public class 문자열내p와y의개수 {
    public static void main(String[] args) {
        String s = "pPoooyY";
        boolean answer = true;
        s = s.toLowerCase();
        int cnt1 = 0;
        int cnt2 = 0;
        String[] str = s.split("");
        for (int i = 0; i < str.length; i++) {
            if (str[i].equals("p")) {
                cnt1++;
            }else if (str[i].equals("y")){
                cnt2++;
            }
        }
        if(cnt1==cnt2){
            answer = true;
        }else answer = false;

        System.out.println(answer);

    }
}
