package Programmers_Java.lv0;

import java.util.Arrays;

public class 문자열정렬하기2 {

	public static void main(String[] args) {
		String my_string = "Bcad";
		
		String answer = "";
        String s = "";
		
		s = my_string.toLowerCase();
		String [] str = s.split("");
		Arrays.sort(str);
		
		for(int i=0; i<str.length; i++) {
			answer += str[i];
		}
	}

}