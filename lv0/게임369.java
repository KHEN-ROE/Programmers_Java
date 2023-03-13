package Programmers_Java.lv0;

public class 게임369 {

	public static void main(String[] args) {
		int order = 30;
		int answer = 0;
		
		//정수를 문자열로 변환
		String s = Integer.toString(order);
		
		//문자열을 잘라서 배열에 저장
		String[]str = s.split("");
		
		//빈 정수 배열 생성
		int[]arr = new int[str.length];
		
		//문자열 배열을 다시 정수 배열로 변환
		for(int i=0; i<str.length; i++) {
			arr[i] = Integer.parseInt(str[i]);
		}
		
		//배열의 각 원소를 3으로 나눈 나머지가 0이면 +1
		for(int i=0; i<arr.length; i++) {
			if(arr[i] % 3 ==0) {
				answer += 1;
			}
			if(arr[i] == 0 ) { // order에 0이 포함되는 경우
				answer = answer -1;
			}
		}
		System.out.println(answer);
		

	}

}
