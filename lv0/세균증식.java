package Programmers_Java.lv0;

public class 세균증식 {

	public static void main(String[] args) {
		int n = 7;
		int t = 15;
		

		int answer = n;
		
		answer  = answer * 2;
		
		for(int i=0; i<t-1; i++) {
			answer = answer *2;
		}
		
		System.out.println(answer);
	}

}
