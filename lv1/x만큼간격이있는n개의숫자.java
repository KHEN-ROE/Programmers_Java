package Programmers_Java.lv1;

public class x만큼간격이있는n개의숫자 {
    public static void main(String[] args) {
        long x = -4;
        int n = 2;
        int index = 0;
        long[] answer = new long[n];
        for(int i = x; i <= Math.abs(n*x); i+=x){
            answer[index] = (long)i;
            index++;
            if (index == n) {
                break;
            }
        }
        for (long a:
             answer) {
            System.out.println(a);
        }
    }
}
