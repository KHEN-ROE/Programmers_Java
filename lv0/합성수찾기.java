package Programmers_Java.lv0;

public class 합성수찾기 {

	public static void main(String[] args) {
		int n = 10;
		int answer = 0;
		int count = 0;
		
	
		
		for(int i=4; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				if(i % j==0) {//약수 개수 찾기 - 나머지가 0이면
					count ++; // count 추가. 근데 합성수가 아닐 때도 카운트됨
				}
				if (count == 3) {//약수가 3개면 합성수이므로 answer ++ 
					answer ++;
					break; //약수가 3개가 되면 반복문 중단하고 다음 i로 넘어감
				}
			}
			count=0; //i가 한 싸이클 끝나면 카운트 초기화
		}
		System.out.println(answer);
		
		
		
		

	}

}
