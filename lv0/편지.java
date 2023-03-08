package Programmers_Java.lv0;

public class 편지 {

	public static void main(String[] args) {
		String message = "happy birthday!";
		int answer = 0;
		String []str = new String[message.length()];
		
		for(int i=0; i<message.length(); i++) {
			str = message.split("");
		}
		answer = str.length*2;
		
		System.out.println(answer);
		

	}

}
