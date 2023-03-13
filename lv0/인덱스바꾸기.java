package Programmers_Java.lv0;

public class 인덱스바꾸기 {

	public static void main(String[] args) {
		String my_string = "hello";
		int num1 = 1;
		int num2 = 2;
		
		
		String answer="";
		String str[] = new String[my_string.length()];
		str = my_string.split("");
				
		String s ="";
		s = str[num1];
		
		str[num1] = str[num2];
		str[num2] = s;
		
		for(int i=0; i<str.length; i++) {
			answer += str[i];
//			System.out.println(answer);
		}
		
		//코드를 좀 줄여야할 것 같은데
		

	}

}
