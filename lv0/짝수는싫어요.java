package Programmers_Java.lv0;

public class 짝수는싫어요 {

	public static void main(String[] args) {
		int n = 15;
		int[] answer = new int[n/2 + n%2];
		int index=0;
		for(int i=0; i<n+1; i++) {
			if((i%2) != 0) {
				answer[index]=i;
				index++;
			}
		}
		
		for(int n1 : answer) {
			System.out.println(n1);
		}
		
		System.out.println(n/2 + n%2);
	}

}