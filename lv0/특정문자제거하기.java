package Programmers_Java.lv0;

public class 특정문자제거하기 {

	public static void main(String[] args) {
		
		String my_string = "abcdef";
		String letter = "f";
		String m1="";
		
		if(my_string.contains(letter)) {
			m1 = my_string.replaceAll(letter, "");
		}
		
//		m1 = my_string.replaceAll(letter, ""); // 이게 맞는 정답
		
		System.out.println(m1);
		
	}

}
