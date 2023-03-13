package Programmers_Java.lv0;

public class 주사위의개수 {

	public static void main(String[] args) {
		int[] box = {10, 8, 6};
		int n = 3;
		int answer = 1;

		
		//반복문 안 써도 간단하게 풀 수 있음...
		
		//직육면체의 각 변을 n으로 나눈 몫을 곱한 값이 답
		for(int i=0; i<box.length; i++) {
			
			answer = answer * (box[i]/n);
			
		}
		System.out.println(answer);



	}

}
