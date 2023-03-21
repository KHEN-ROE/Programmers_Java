package Programmers_Java.lv0;

import java.util.Arrays;

public class 가까운수 {

	public static void main(String[] args) {
		int[] array = {79, 81, 80,82,88,99};
		int n = 80;
		int answer = 0;
	    int a =0;    
		  int min=100;
			
			int arr[] = new int [array.length];
			
			//차가 같다면 작은 수를 리턴해야 한다. 따라서 오름차순으로 정렬.
			Arrays.sort(array);
			
			//차를 새로운 배열에 저장
			for(int i=0 ; i<array.length; i++) {
				arr[i] = Math.abs(array[i]-n);
			}
			
			//최소 값을 구한다
			for(int i=0; i<array.length; i++) {
				if(arr[i] < min) {
					min = arr[i];
					a = i; // 최솟값의 위치 반환
				}
			}
			
			
			answer = array[a]; // 최솟값의 인덱스 리턴
			
			System.out.println(answer);
		
			
			
		}	
	

}
