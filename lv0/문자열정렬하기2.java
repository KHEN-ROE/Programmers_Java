package Programmers_Java.lv0;

import java.util.Arrays;

public class 문자열정렬하기2 {

	public static void main(String[] args) {
		String my_string = "Caad";
		String answer = "";
		answer = my_string.toLowerCase();
		String str [] = answer.split("");
		
		String alpha = "abcdefghijkelmopqurtuvwxyz";
		String str2[] = alpha.split("");
		
		for(int i=0; i<str.length; i++) {
			for(int j=0; j<str2.length; j++) {
				if(str[i].compareTo(str2[j]) >= 0) {
					answer += str[i];
					System.out.println(answer);
				}
			}
		}

	}

}
