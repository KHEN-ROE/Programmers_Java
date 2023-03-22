package Programmers_Java.lv0;



public class 숨어있는숫자의덧셈2 {

	public static void main(String[] args) {
		String my_string = "1a2b3c4d123Z";
//		int answer = 0;
//		//소문자로 변환
//		String myString2 = my_string.toLowerCase();
//		
//		//정수가 아닌 문자 모두 0으로 바꿈
//		myString2 = myString2.replaceAll("[abcdefghijklmnopqrstuvwxyz]", "0");
//		
//		//문자열을 자름
//		String[]str = myString2.split("");
//		
//		//붙어있는 숫자를 하나로 만들어줌. 문제 : 3개 이상 붙어있으면?
//		for(int i=0; i<str.length; i++) {
//			if(!str[i].equals("0") && !str[i+1].equals("0")) {
//				str[i] = str[i]+str[i+1];
//				str[i+1]=str[i+1].replace(str[i+1], "0");
//			}
//		}
//		//정수로 변환해서 더해준다
//		for(int i=0; i<str.length; i++) {
//			answer += Integer.parseInt(str[i]);
//		}
//		
//		System.out.println(answer);
		
		int answer = 0;
		String[] parts = my_string.split("[^\\d]+"); // split string by non-digits. 정규표현식
		for (String part : parts) {
			if (!part.isEmpty()) {
				int num = Integer.parseInt(part);
				if (num >= 1 && num <= 1000) { // check if natural number
					answer += num;
				}
			}
		}
			    System.out.println(answer);
	}
}
		
		

