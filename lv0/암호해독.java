package Programmers_Java.lv0;

public class 암호해독 {

	public static void main(String[] args) {
		String cipher = "dfjardstddetckdaccccdegk";
		int code = 4;
		int index=0;
		String []str = cipher.split("");
		int a = 0;
		
		String answer = "";
		
//		System.out.println(str[3]);
		
		for(int i=0; i<str.length; i++) {
			a= i%code;
			System.out.println(a);
		}

//		System.out.println(answer);
	}

}
