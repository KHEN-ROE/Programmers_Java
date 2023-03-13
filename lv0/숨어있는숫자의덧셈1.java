package Programmers_Java.lv0;

import java.util.Arrays;

public class 숨어있는숫자의덧셈1 {

	public static void main(String[] args) {
		String my_string = "aAb1B2cC34oOp";
        int answer = 0;
        
        String s = my_string.toLowerCase();
        s = s.replaceAll("[abcdefghijklmnopqrstuvwxyz]", ""); // 문자열을 소문자로 바꾸고 replaceAll 메소드 사용하여 알파벳을 다 날려버림
        String[]str = s.split("");
        
<<<<<<< HEAD
        for(int i =0; i<str.length; i++) {
        	System.out.print(str[i]);	
=======
        for(int i=0; i<s.length(); i++) {
        	answer += Integer.parseInt(str[i]);
>>>>>>> 9e003636b9e6b8d5c9520633f78d5ac99055cecf
        }
        
        System.out.println(answer);
       
        
       
        
        
        
  

		

	}

}
