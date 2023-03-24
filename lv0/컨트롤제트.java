package Programmers_Java.lv0;

public class 컨트롤제트 {

	public static void main(String[] args) {
		String s = "10 Z 20 Z 1";
		int answer = 0;
		
		
		//먼저 자른다음에 공백 제거 해야함
		String str[] = s.split(" ");
		
		String s1 = s.replaceAll(" ", "");
		
		
		
		
		for(int i=0; i<str.length; i++) {
			if(str[i].equals("Z")) {
				answer = answer - (Integer.parseInt(str[i-1]));
				continue;
			}
			answer += Integer.parseInt(str[i]);
		}
		System.out.println(answer);
	}

}
