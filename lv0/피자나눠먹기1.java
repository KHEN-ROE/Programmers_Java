package Programmers_Java.lv0;

public class 피자나눠먹기1 {

	public static void main(String[] args) {
		int n = 15; // 사람 수
		int p = 0; // 피자 한 판
		
	
		for(int i=0; i<n; i++) {
			if(i%7==0) {
				p++;
			}
		}
		System.out.println(p);

	}

}
