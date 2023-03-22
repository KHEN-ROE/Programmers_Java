package Programmers_Java.lv0;

public class 영어가싫어요 {

	public static void main(String[] args) {
		String numbers = "onefourzerosixseven";
		long answer = 0;
		String s="";
	
		s = numbers.replaceAll("[onefourzerosixseven]+", "123456789");
		
		
		System.out.println(s);
		
		
		
	}

}
