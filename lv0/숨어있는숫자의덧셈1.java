package Programmers_Java.lv0;

import java.util.Arrays;

public class 숨어있는숫자의덧셈1 {

	public static void main(String[] args) {
		String my_string = "aAb1B2cC34oOp";
        int answer = 0;
        
        String[] str = my_string.split("");
       
        Arrays.sort(str);
        
        for(int i =0; i<str.length; i++) {
        	System.out.print(str[i]);
        }
        
        
        
        
  

		

	}

}
