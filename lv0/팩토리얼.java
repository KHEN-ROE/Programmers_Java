package Programmers_Java.lv0;

public class 팩토리얼 {

	public static void main(String[] args) {
		int n = 3628800;
		int a = 1;
		int answer=0;
		
		for(int i=1; i<=n; i++) {
			a *= i;
			if(a > n) {
				answer = i-1; //디버깅 해보면 왜 if-else가 이렇게 구성되는지 안다
				break;
			}
			else if (a==n) answer = i; 
		}
		System.out.println(answer);
	}

}
