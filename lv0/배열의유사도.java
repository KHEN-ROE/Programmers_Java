package Programmers_Java.lv0;

public class 배열의유사도 {

	public static void main(String[] args) {
		String[] s1 = {"a", "b", "c"};
		String[] s2 = {"com", "b", "d", "p", "c"};
		
		int answer = 0;

		//문자열에서 ==를 이용하면 같은 객체인지 비교하고 문자열을 비교하지 않는다 .equals함수를 사용.
		//이클립스에서는 자동으로 변환해주지만 프로그래머스에서 그렇지 않으므로 실행하면 다른 결과나옴
		for(int i=0; i<s1.length; i++) {
			for(int j=0; j<s2.length; j++) {
				if(s1[i].equals(s2[j])) answer ++;
			}
		}

		System.out.println(answer);
	}

}
