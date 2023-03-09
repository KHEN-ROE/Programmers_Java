package Programmers_Java.lv0;

public class 제곱수판별하기 {

	public static void main(String[] args) {
		int n = 143;
		int answer = 0;
		
		for(int i=0; i<n; i++) {
			if(i*i==n) {
				answer=1;
				break;
			}
			else {
				answer=2;
			}
		}

		System.out.println(answer);
	}

}
