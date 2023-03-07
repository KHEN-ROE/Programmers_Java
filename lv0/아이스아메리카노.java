package Programmers_Java.lv0;

public class 아이스아메리카노 {
	
	public static void main(String[] args) {
		int[] answer = new int[2];
		int money = 5800;
		int c = 5500;
		
		int d = money / c ; // 몫
		int r = money % c; // 잔돈
		
		answer[0]=d;
		answer[1]=r;
		
		System.out.println(answer[1]);
	}
}
