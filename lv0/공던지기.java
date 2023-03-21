package Programmers_Java.lv0;

public class 공던지기 { //실패...

	public static void main(String[] args) {
		int[] numbers = {1, 2, 3};
		int k = 3;
		int answer = 0;
			
		answer = numbers[2*(k-1) % numbers.length];
		
		System.out.println(answer);
		
		
		
	}

}
