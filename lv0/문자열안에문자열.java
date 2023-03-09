package Programmers_Java.lv0;

public class 문자열안에문자열 {

	public static void main(String[] args) {
		String str1 = "ppprrrogrammers";
		String str2 = "pppp";
		int answer=0;
		
		//배열로 쪼갤필요가 없다
		
		for(int i=0; i<str2.length(); i++) {
			if(str1.contains(str2)) {
				answer = 1;
			}
			else answer = 2;
			
		}
	
		
		System.out.println(answer);
	}

}
