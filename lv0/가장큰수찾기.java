package Programmers_Java.lv0;

public class 가장큰수찾기 {

	public static void main(String[] args) {
		int[] array = {1, 8, 3};
		int[] answer = new int[2];
		
		int max=0;
		
		for(int i=0; i<array.length; i++) {
			if (array[i] > max) {
				max = array[i];
				answer[0] = max;
				answer[1] = i;
				
			}
		}
		

	}

}
