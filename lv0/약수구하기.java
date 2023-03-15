package Programmers_Java.lv0;

public class 약수구하기 {

	public static void main(String[] args) {
		int n = 24;
		int[] answer = new int[n];
		int index=0;
		
		for(int i=1; i<answer.length+1; i++) {
			if (n % i == 0) {
				answer[index] = i;
				index++;
			}
		}
		for(int a : answer) {
			System.out.println(a);
		}
		
		

	}

}
