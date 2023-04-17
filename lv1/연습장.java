package Programmers_Java.lv1;

public class 연습장 {
    public static void main(String[] args) {

//        try {
//            Scanner sc = new Scanner(System.in);
//            System.out.println("양의 정수만 입력");
//            int n = sc.nextInt();
//            System.out.println("you input : " + n);
//        }catch (Exception e) {
//            System.out.println("정수만 입력하세요");
//        }

        int answer[][] = {{1, 1}, {2, 2}, {3, 3}, {4, 4}};
        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < answer[i].length; j++) {
                System.out.println(answer[i][j]);
            }
        }

    }
}
