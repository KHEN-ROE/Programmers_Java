package Programmers_Java.lv1;

public class 최소직사각형 {
    public static void main(String[] args) {
        int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        int answer = 0;

        int temp = 0;
        // 모든 명함을 가로로 눕힌다. 두 값 중 가로를 긴 값, 세로를 짧은 값으로 설정
        for (int i = 0; i < sizes.length; i++) {
            if (sizes[i][0] < sizes[i][1]) {
                temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;
            }
        }
        //이제 가로와 세로의 최댓값을 각각 구한다.
        int max1 = 0;
        int max2 = 0;
        for (int i = 0; i < sizes.length; i++) {
            if(sizes[i][0] > max1) max1 = sizes[i][0];
            if(sizes[i][1] > max2) max2 = sizes[i][1];
        }
        answer = max1 * max2;
        System.out.println(answer);






    }
}
