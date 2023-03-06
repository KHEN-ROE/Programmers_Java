package Programmers_Java.lv0;

public class 문자열뒤집기 {
	

	public static void main(String[] args) {
		String answer = "";
		String my_string = "jaron";
	
//		방법1. substring 사용	
//		for(int i=my_string.length()-1; i>=0; i--) {
//			answer += my_string.substring(i, i+1); // 1. 0 부터 0까지
//													//2. 1부터 1까지 .... 이런식으로 하나씩만 자름.
//			
//		}
//		System.out.println(answer);
		
		//방법2.
		//내가 하고 싶었던 풀이
		for(int i=my_string.length()-1; i>=0; i--) {
			answer += my_string.charAt(i);
		}
		System.out.println(answer);
		
		//방법 3
		StringBuilder sb = new StringBuilder();
		sb.append(my_string);
		sb.reverse();
		System.out.println(sb);
		
	}

}
