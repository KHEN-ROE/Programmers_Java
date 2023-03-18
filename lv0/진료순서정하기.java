package Programmers_Java.lv0;

public class 진료순서정하기 {

	public static void main(String[] args) {
		int[] emergency = {3, 76, 24};
		int[] answer = new int[emergency.length];
		int index = 0;
		int max = 0;
		
		for(int i=0; i<emergency.length; i++) {
			if(emergency[i] > max) {
				max = emergency[i];
				answer[i]=1;
			}
		}
		
	}

}
