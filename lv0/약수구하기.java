package Programmers_Java.lv0;


import java.util.ArrayList;
import java.util.List;


public class 약수구하기 {

	public static void main(String[] args) {
		int n = 24;

		
		int index =0;
		int count = 0;
		
		//약수를 담을 배열의 크기를 구하는 반복문. 이렇게 안하면 정수를 문자열로 바꿨다가 다시 정수로 바꿨다가 해야함...
		for(int i=1; i<n+1; i++) {
			if(n % i==0) {
				count++;
			}
		}
		int[] answer = new int[count];
		
		for(int i=1; i<n+1; i++) {
			if(n % i == 0) {
				answer[index] = i;
				index++;
				
			}
		}
//		for(int a : answer) {
//			System.out.println(a);
//		}
		
		//ArrayList 사용한 풀이
		List<Integer> answer1 = new ArrayList<>();
        for(int i=1; i<=n; i++){
            if(n % i == 0){
                answer1.add(i);
            }
        }
        //아래코드는 리스트를 배열로 바꺼준 것. 안바꾸고 그냥 리스트 바로 출력가능
        int [] arr;
        arr = answer1.stream().mapToInt(x -> x).toArray();
		for(int a : arr) {
			System.out.println(a);
		}


	}

}