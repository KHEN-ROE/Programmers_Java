package Programmers_Java.lv0;

public class 문자열계산하기 {

	public static void main(String[] args) {
		// 연산자는 여러개일 수 있다
		// 공백을 기준으로 자른다
		
		String my_string = "10 + 20 + 10 + 10";
		int answer = 0;
//		String[]str = my_string.split("[^\\d]+");
		String[]str1 = my_string.split(" ");
		
		for(int i=0; i<str1.length; i++) {
			if(str1[i].equals("+")) {
				if(str1[i-1].equals("")) {
					answer += Integer.parseInt(str1[i+1]);
				}else {
				answer = Integer.parseInt(str1[i-1]) + Integer.parseInt(str1[i+1]);
				}
				//더한 다음에 replace해서 지운다. n번째 연산자를 만났을 때, 
				//i-1이 ""이면 answer + (i+1)    혹은 빼기 연산.
				str1[i] = str1[i].replace(str1[i], "");
				str1[i-1] = str1[i-1].replace(str1[i-1], "");
				str1[i+1] = str1[i+1].replace(str1[i+1], "");
				
				
			} // 빼기 연산은 내일 구현
			if(str1[i].equals("-")) {
				answer = Integer.parseInt(str1[i-1]) - answer - Integer.parseInt(str1[i+1]);
				
			}
		}
		
		System.out.println(answer);
	}

}
