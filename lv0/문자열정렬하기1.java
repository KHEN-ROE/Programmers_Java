package Programmers_Java.lv0;

import java.util.Arrays;

public class 문자열정렬하기1 {

	public static void main(String[] args) {
		String my_string = "hi12392";
		
		
		String s = my_string.replaceAll("[abcdefghijklmnopqrstuvwxyz]", "");

		
		String[]st = s.split("");

		
		int[] answer = new int[st.length];
		
		
	
		
		for(int i=0; i<answer.length; i++) {
			answer[i] = Integer.parseInt(st[i]);
		}
	
		Arrays.sort(answer);
		
		
	}

}
