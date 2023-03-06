package lv0;

import java.util.Arrays;

public class 중앙값구하기 {

	public static void main(String[] args) {
		int[]array = {1, 2, 5, 7, 10, 11};
		
		Arrays.sort(array);
		
		int answer=0;
		
		for(int i=0; i<((array.length)/2)+1; i++) {
			if(array[i]>answer) {
				answer=array[i];
			}
		}
		System.out.println(answer);
		
		int answer1 = array[array.length/2];
		System.out.println(answer1);

	}

}
