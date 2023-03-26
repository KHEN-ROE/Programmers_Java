package Programmers_Java.lv0;

public class 삼각형의완성조건2 {

	public static void main(String[] args) {
		int[]sides = {3,6};
		int answer = 0; // 나머지 한 변이 될 수 있는 개수
		int max = 0; 
		int min = 1001;
	
		
		
//		가장 긴 변의 길이는 다른 두 변의 길이의 합보다 작아야 함.
		
		//일단 최댓값을 구한다.
		for(int i=0; i<sides.length; i++) {
			if(sides[i] > max) {
				max = sides[i];
			}
		}
		//최솟값
		for(int i=0; i<sides.length; i++) {
			if(sides[i] < min) {
				min = sides[i];
			}
		}
//		System.out.println("max : " + max + " / min : " + min);
				
		//나머지 한 변이 되는 조건
		//1. 나머지 한 변이 가장 긴 변일 때 - 두 수의 합보다 작아야 함
		for(int i=0; i<max+min; i++) {
			if(i> max && i < min+max) {
				answer++;
			}
		}
		
		//2. max가 가장 긴 변일 때 - 아래의 if 조건 
		for(int i = 0; i<max+min; i++) {
			if((min + i) > max && i<=max) {
				answer++;
			}
		}
		
		System.out.println("정답의 개수 : " + answer);

	}

}
