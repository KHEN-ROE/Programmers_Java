package Programmers_Java.lv0;

public class 피자나눠먹기2 { //코드가 너무 길고 거지같다...

	public static void main(String[] args) { //3개의 케이스로 나눠풀었다. 몫이 0인 경우, 나머지가 0인 경우, 나머지가 있는 경우
		int n = 10;
		int p = 6;
		
		int answer=0;
		
		if(p/n == 0) {
			while(true) {
				if(p%n==0) {
					answer = p/6;
					break;
				}
				p+=6;
				
			}
		}
		
		if (p%n ==0) {
			answer = p/6;
		}
		else {
			while(true) {
				if(p%n ==0) {
					answer = p/6;
					break;
				}
				p+=6;			
			}
		}
		System.out.println(answer);

	}

}
