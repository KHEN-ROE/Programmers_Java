package Programmers_Java.lv1;

public class 자연수뒤집어배열로만들기 {
    public static void main(String[] args) {
        long n = 12345;

        String s = Long.toString(n);
        String[] str = s.split("");
        int[] answer = new int[str.length];

        int index = 0;
        for (int i = str.length - 1; i >= 0; i--) {
            answer[index] = Integer.parseInt(str[i]);
            index++;
        }
        for (int a:
             answer) {
            System.out.println(a);
        }

    }
}
