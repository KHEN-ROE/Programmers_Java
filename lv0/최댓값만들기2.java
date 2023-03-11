package Programmers_Java.lv0;

import java.util.Arrays;

public class 최댓값만들기2 {

	public static void main(String[] args) {
		int[] numbers = {0, -31, 24, 10, 1, 9};
		int answer = 0;
		int index=0;
		
		//0을 제외하는 배열 생성
		int [] num = new int[numbers.length];
		
		//0 제외 시키고 새로운 배열에 담음
		for(int i=0; i<numbers.length; i++) {
			if(numbers[i] != 0) {
				num[index] = numbers[i];
				index++;
			}
		}
		//오름차순으로 정렬
		Arrays.sort(num);
		
		//음수 값이 존재하므로, 앞에 두 값을 곱한 값과 뒤에 두 값을 곱한 결과 비교
		int front = num[0] * num[1];
		int behind = num[num.length-1] * num[num.length-2];
		
		if(front > behind) {
			answer = front;
		}
		else answer = behind;
		
		System.out.println(answer);
		
		//아주 간단한 풀이
//		 int len = numbers.length;
//	        Arrays.sort(numbers);
//	        return Math.max(numbers[0] * numbers[1], numbers[len - 2] * numbers[len - 1]);

	}

}
