package Programmers_Java.lv0;

import java.util.Arrays;

public class a로b만들기 {

	public static void main(String[] args) {
		String before = "olleh";
		String after = 	"hello";	
		int answer = 0;
		String[]str1 = before.split("");
		String[]str2 = after.split("");
		
		Arrays.sort(str1);
		Arrays.sort(str2);
		
		String s1 = "";
		String s2 = "";
		
		for(int i=0; i<str1.length; i++) {
			s1 += str1[i];
			s2 += str2[i];
		}
		
		if (s1.equals(s2)) {
			answer = 1;
		}
		else answer = 0;
		
		System.out.println(answer);

	}

}
