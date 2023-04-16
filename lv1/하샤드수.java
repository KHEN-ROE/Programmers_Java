package Programmers_Java.lv1;

public class 하샤드수 {
    public static void main(String[] args) {
        int x = 11;
        boolean answer = true;
        String s = Integer.toString(x);
        String [] str = s.split("");
        int sum = 0;
        for (int i = 0; i < str.length; i++) {
            sum += Integer.parseInt(str[i]);
        }
        if(x % sum == 0){
            answer = true;
        }else {
            answer = false;
        }
    }
}
