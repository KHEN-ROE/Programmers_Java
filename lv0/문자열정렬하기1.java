package Programmers_Java.lv0;

import java.util.Arrays;

public class 문자열정렬하기1 {

	public static void main(String[] args) {
		String my_string = "hi12392";
		
		
		String s = my_string.replaceAll("[a-z]", ""); //알파벳 제거

		
		String[]st = s.split(""); // 문자열을 잘라서 배열에 저장

		
		int[] answer = new int[st.length]; // 정답을 담을 배열
		
		for(int i=0; i<answer.length; i++) {
			answer[i] = Integer.parseInt(st[i]); // 정수형으로 변환하여 저장
			System.out.println(answer[i]);
		}
	
		Arrays.sort(answer);
		
		
	}

}
