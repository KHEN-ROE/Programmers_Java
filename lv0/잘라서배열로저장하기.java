package Programmers_Java.lv0;

import java.util.ArrayList;
import java.util.List;

public class 잘라서배열로저장하기 {

	public static void main(String[] args) {
		String my_str = "abc1Addfggg4556b";
		int n = 6;
		//정답을 담을 배열
		String []str1 = new String[(my_str.length()/n) + 1];
		
		
		String[]str = my_str.split("");
		String []str2 = new String[str.length+10]; // 나중에 list로 바꿀 것
		String[] answer = {};
		String s="";
		
		List<String> list = new ArrayList<>();
		
		for(int i=0; i<n; i++) {
				s+=str[i];
				str[i] = str[i].replaceAll(str[i], "");
		}
		
		list.add(s);
		
		
		for(int i=0; i<(my_str.length()/n) + 1; i++) {
			
		}
		

	}

}
