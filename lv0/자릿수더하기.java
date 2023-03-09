package Programmers_Java.lv0;

public class 자릿수더하기 {

	public static void main(String[] args) {
		int n = 1234;
		int answer = 0;
		
		//정수를 문자열로 타입변환
		String str = Integer.toString(n);
		
		//문자열을 잘라서 배열에 저장
		String[] st = str.split("");
		
		//정수 배열 선언. 문자열의 원소들을 타입변환해서 정수 배열에 넣을 예정
		int [] d = new int[st.length];	
		
		//반복문 통해 문자열 원소들을 타입변경 해가면서 정수 배열에 저장
		for(int i=0; i<st.length; i++) {
			d[i] = Integer.parseInt(st[i]);
		}
		
		//정수 배열의 원소들을 하나씩 더함
		for(int i=0; i<d.length; i++) {
			answer += d[i];
		}
		
		System.out.println(answer);
		
		
	}

}
