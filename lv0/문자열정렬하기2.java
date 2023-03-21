package Programmers_Java.lv0;

import java.util.Arrays;

public class 문자열정렬하기2 {

	public static void main(String[] args) {
		String my_string = "Bcad";
		String answer = "";
<<<<<<< HEAD
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

=======
		String s = "";
		
		s = my_string.toLowerCase();
		String [] str = s.split("");
		Arrays.sort(str);
		
		for(int i=0; i<str.length; i++) {
			answer += str[i];
		}
		System.out.println(answer);
				
		
		
		
		
		
		
>>>>>>> 134c62f2eb9eb429d800d78b1641d2e29eadd027
	}

}
