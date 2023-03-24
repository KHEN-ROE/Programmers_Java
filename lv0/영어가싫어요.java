package Programmers_Java.lv0;

public class 영어가싫어요 {

	public static void main(String[] args) {

		String numbers = "onefourzerosixseven";
		long answer = 0;

		//좋은 풀이. replaceAll 기억할 것
		String [] str = {"zero","one","two","three","four","five","six","seven","eight","nine"};
		
		for(int i=0; i<str.length; i++) {
			numbers = numbers.replaceAll(str[i], Integer.toString(i));
		}
		
		answer = Long.parseLong(numbers);
		
		System.out.println(answer);
		
		
	}

}
