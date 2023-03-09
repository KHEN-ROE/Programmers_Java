package Programmers_Java.lv0;

public class 모음제거 {

	public static void main(String[] args) { // 실패...
		String my_string = "nice  to meet you";
		
		String [] str = {"a","e","i","o","u"};
		String answer ="";
		
		for(int i=0; i<str.length; i++) {
			if(my_string.contains(str[i])) {
				answer = my_string.replaceAll(str[i], "");
				my_string = answer;	
			}
			else {
				answer = my_string;
			}
			
		}
		System.out.println(answer);

		//아주 간단한 방법
		answer = my_string.replaceAll("[a,e,i,o,u]", "");
		System.out.println(answer);
		
		

	}

}
