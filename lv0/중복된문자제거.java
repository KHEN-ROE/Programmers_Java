package Programmers_Java.lv0;

public class 중복된문자제거 {

	public static void main(String[] args) {
		String my_string = "people";
		String answer = "";
		
		String[]str = my_string.split("");

		for(int i=0; i<str.length; i++) {
			for(int j=i+1; j<str.length; j++) {
				if(str[i].compareTo(str[j])==0) {
					str[j] = str[j].replace(str[j], ""); //중복되는 거 ""로 대체

				}
			}
		}
		
		for(int i=0; i<str.length; i++) {
			answer += str[i];
		}
		System.out.println(answer);
		


	}

}
