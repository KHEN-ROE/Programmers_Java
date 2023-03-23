package Programmers_Java.lv0;

import java.util.ArrayList;
import java.util.List;

public class 잘라서배열로저장하기 {

	public static void main(String[] args) {
		String my_str = "abc1Addfggg4556b";
		int n = 6;

		List<String> list = new ArrayList<String>();

	
		
		for(int i=0; i<my_str.length(); i+=n) {
			if(my_str.length()-i < n) {
				list.add(my_str.substring(i));
				break;
			}
			list.add(my_str.substring(i, n+i));
		}
		
		//리스트를 배열로 변환
		
		String answer[] = list.toArray(new String[list.size()]);
//		String[] arr = list.toArray(new String[0]); 이렇게 해도 됨
		

	}

}
