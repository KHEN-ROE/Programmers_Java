package Programmers_Java.lv0;

public class 개미군단 {

	public static void main(String[] args) {
		int hp = 23;
		int answer = 0;
		
		int a=5;
		int b=3;
		int c=1;
		
		while(true) {
		int a1 = hp / a;
		answer += a1;
		int a2 = hp % a;
		if (a2==0) break;
		
		int b1 = a2 / b;
		answer += b1;
		int b2 = a2 % b;
		if (b2==0) break;
	
		int c1 = b2 / c;
		answer += c1;
		int c2 = b2 % c;
		if (c2==0) break;
		
		}	
		System.out.println(answer);

	}

}
