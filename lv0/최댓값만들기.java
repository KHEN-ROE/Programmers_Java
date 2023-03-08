package Programmers_Java.lv0;

import java.util.Arrays;

public class 최댓값만들기 {

	public static void main(String[] args) {
		int[] numbers = {2,2,2,2};
       
        int max = 0;
        int secmax = 0;
        
        for(int i=0; i<numbers.length; i++) {
        	if(numbers[i] > max) {
        		max = numbers[i];
        	}
        }
        
        //secmax를 못찾았을 때, 그걸 알 수 있는 경우는 for문 끝났을 때 
        for(int i=0; i<numbers.length; i++) {
        	if(numbers[i] > secmax && numbers[i] < max ) { //최댓값이 같은 경우?
        		secmax = numbers[i];
        	}
       
        }
        if(secmax == 0) {
        	secmax = max;
        }

        int answer = max * secmax;
        
        System.out.println(max);
        System.out.println(secmax);        
        System.out.println(answer);

        //아주 간단한 방법	
        Arrays.sort(numbers);
        int answer1 = numbers[numbers.length-1] * numbers[numbers.length-2];
        System.out.println(answer1);

	}

}
