package Programmers_Java.lv0;

public class 칠의개수 {

	public static void main(String[] args) {
		int[] array = {7, 77, 17};
		int answer = 0;
		
		String str[] = new String[array.length];
		
		for(int i=0; i<array.length; i++){
			str[i] = Integer.toString(array[i]);
		}
		
		String s ="";
		for(int i=0; i<str.length; i++) {
			s += str[i];
		}
		
		String[] s1 = s.split("");
		for(int i=0; i<s1.length; i++) {
			if(s1[i].equals("7")) answer ++;
		}
		
		System.out.println(answer);
	}

}
