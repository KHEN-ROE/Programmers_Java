package Programmers_Java.lv1;

public class 콜라츠추측 {
    public static void main(String[] args) {
        int answer = 0;
        int num = 1;

        for (int i = 0; i < 500; i++) {
            if (num == 1) {
                answer = 0;
                break;
            }
            else if (num > 0) {
                if (num % 2 == 0) {
                    num = num / 2;
                    answer++;
                } else {
                    num = num * 3 + 1;
                    answer++;
                }
                if (num == 1) {
                    break;
                }
            }
        }
        if (num != 1) {
            answer = -1;
        }
        System.out.println(answer);
    }
}