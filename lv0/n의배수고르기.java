package Programmers_Java.lv0;

public class n의배수고르기 {

	public static void main(String[] args) {
		int n = 3;
		int[] numlist = {2, 100, 120, 600, 12, 12};
		
		
		int index=0;
		int cnt=0;
		
		//정답을 담을 배열의 길이 구하기 위한 반복문.
		for(int i=0; i<numlist.length; i++) {
			if(numlist[i]%n ==0) {
				cnt++;
			}
		}
		//n의 배수의 개수와 같은 길이를 갖는 배열
		int[] answer = new int[cnt];
		
		for(int i=0; i<numlist.length; i++) {
			if(numlist[i]%n ==0) {
				answer[index] = numlist[i];
				index++;
				
			}
		}
		
		for(int n1 : answer) {
			System.out.println(n1);
		}

	}

}
