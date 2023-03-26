package Programmers_Java.lv0;

import java.util.ArrayList;
import java.util.List;

public class 소인수분해 {

	public static void main(String[] args) {
		int n = 420;
		
		List<Integer> list = new ArrayList<>();
		
		for(int i=2; i<=n; i++) {
			if( n % i == 0 ) {
				list.add(i); // 일단 약수를 구한다. 
			}
		}
		//약수 중에서 소수만 남기고 다 제외
		for(int i=0; i<list.size(); i++) {
			//2가 있으면 남겨두고 넘어감
			if(list.get(i)==2) {
				continue;
			}
			
			for(int j = 2; j<list.get(i); j++) {
				//소수가 아니면 제거
				if( (list.get(i) % j) == 0) { //15일 때 여기를 아예 못들어옴. j증가 못시키는 이유?
											// 밑에 else가 있으면 여길 아예 못 들어옴.
											//그래서 정답을 추가하는 방법 대신 오답을 제거하는 방식으로 해결(else문 삭제)

					//리스트에서 삭제
					list.remove(list.get(i));
					j=2;

					//반복문 중단 조건
					int l = list.size();
					if(l<=i) break;
				}

			}	
		}	
		
		//프로그래머스 제출하려니 타입에러 떠서 Integer를 int로 변환. 근데 무슨 차이?
		int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
		// 반복문으로 변환해도 됨
		int[] intArray = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
		    intArray[i] = list.get(i);
		}
		
//		int[]arr = list.toArray(new int[list.size()]); 이 방식은 정수일 땐 안되고 스트링일 때 됨
		
		System.out.println("list : " + list);	
	}

}
