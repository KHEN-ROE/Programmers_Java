package Programmers_Java.lv0;

import java.util.Arrays;

public class 숨어있는숫자의덧셈1 {

	public static void main(String[] args) {
		String my_string = "aAb1B2cC34oOp";
        int answer = 0;
        
        String s = my_string.toLowerCase();
        s = s.replaceAll("[abcdefghijklmnopqrstuvwxyz]", ""); // 문자열을 소문자로 바꾸고 replaceAll 메소드 사용하여 알파벳을 다 날려버림
        String[]str = s.split("");
        

        for(int i =0; i<str.length; i++) {
        	System.out.print(str[i]);	
        }
        for(int j=0; j<s.length(); j++) {
        	answer += Integer.parseInt(str[j]);

        }
        
        System.out.println(answer);
       
        
       
        
        
        
  

		

	}

}
