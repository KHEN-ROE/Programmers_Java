package Programmers_Java.lv0;

import java.util.Arrays;

public class 진료순서정하기 {

	public static void main(String[] args) {
		int[] emergency = {3, 76, 24};
		int[] asc = emergency.clone();
		int[] answer = new int[emergency.length];
		
		Arrays.sort(asc);
		
		for(int i=0; i<asc.length; i++) {
			for(int j=0; j<emergency.length; j++) {
				if(asc[i] == emergency[j]) {
					answer[j] = emergency.length-i;
				}
			}
		}
		
		// 다른풀이 - 나보다 크면 count ++
//		 int[] answer = new int[emergency.length];
//	        int s = 1;
//	        for(int i=0; i<emergency.length; i++){
//	            s = 1;
//	            for(int j=0; j<emergency.length; j++){
//	                if(emergency[i] < emergency[j]){
//	                    s++;
//	                }
//	            }
//	            answer[i] = s;
//	        }

	}
}
