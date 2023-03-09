package Programmers_Java.lv0;

import java.util.Arrays;

public class 삼각형의완성조건1 {

	public static void main(String[] args) {
		int[] sides = {1,2,2};
		int answer = 0;
		int max=0;
		int sum=0;
		int count=0;
		
		for(int i=0; i<sides.length; i++) {
			if(sides[i] > max) {
				max = sides[i];
			}
		}
		
		//가장 긴 변이 중복 될 때
		for(int i=0; i<sides.length; i++) {
			if(sides[i]==max) {
				count++;
				
			}
		}
		System.out.println("cnt"+count);
		
		for(int i=0; i<sides.length; i++) {
			if(sides[i]<max) {
				sum += sides[i];
			}
		}
		
		if(sum>max) {
			answer = 1;
		}
		else if (sum<=max) {
			answer = 2;
		}
		
		//긴 변이 중복될 때
		if(count==2) {
			answer=1;
		}
		
		//정삼각형일 경우?
		if(sides[0] == sides [1] &&sides [1]== sides[2] && sides[0] == sides[2]) {
			answer=1;
		}
		
		
		System.out.println(answer);
		
		//아주 간단한 방법
		int answer1 =0;
		Arrays.sort(sides);
		if(sides[2] < (sides[0] + sides[1])) {
			answer1 = 1;
		}
		else answer1 =2;
		System.out.println(answer1);
		
		
	}

}
