package Programmers_Java.lv0;

public class 암호해독 {

	public static void main(String[] args) {
		String cipher = "dfjardstddetckdaccccdegk";
		int code = 4;
<<<<<<< HEAD
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
=======
		String answer = "";
		
		String [] str = cipher.split("");
		

		for(int i=0; i<str.length; i++) {
			if(((i+1) % code )== 0) { //거의 다 풀었는데 마무리를 못함... 왜 i+1인가? 0부터 시작하니까...
				answer += str[i];
			}
		}
		
		

>>>>>>> 9e003636b9e6b8d5c9520633f78d5ac99055cecf
	}

}
