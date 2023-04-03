package Programmers_Java.lv0;

public class 문자열밀기 {
    public static void main(String[] args) {
        String A = "abc";
        String B = "abc";
        int answer = 0;
        //맨 마지막 인덱스 문자 맨 앞으로 옮긴다. 각 인덱스는 오른쪽으로 한 칸 씩 이동시킨다(i+1)
        //그렇게 나온 결과가 b와 같으면 밀어야하는 최소 횟수 리턴 b가 안되면 -1

        if (!A.equals(B)) {
            String[] str = A.split("");
            String s = str[0];
            str[0] = str[str.length - 1];

            for (int i = 1; i < A.length(); i++) {
                str[str.length - i] = str[str.length - (i + 1)];
                if (i == str.length - 1) {
                    str[str.length - i] = s;
                    break;
                }
            }
            String s1 = "";
            for (int i = 0; i < str.length; i++) {
                s1 += str[i];
            }
            if (s1.equals(B)) {
                answer = 1;
            } else answer = -1;
        } else {
            answer = 0;
        }
        System.out.println(answer);


    }
}
