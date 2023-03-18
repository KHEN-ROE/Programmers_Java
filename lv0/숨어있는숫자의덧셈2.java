package Programmers_Java.lv0;

public class 숨어있는숫자의덧셈2 {

	public static void main(String[] args) {
		String my_string = "aAb1B2cC34oOp";
		int answer = 0;
		String myString2 = my_string.toLowerCase();
		
		myString2 = myString2.replaceAll("[abcdefghijklmnopqrstuvwxyz]", "");
		
		my_string.split("");
		String a = "a";
		String b = "A";
		String c = a+b;
		System.out.println(c);
		
	}

}
