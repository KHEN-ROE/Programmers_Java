package lv0;

public class 분수의덧셈 {

	public static int[]solution(int numer1, int denom1, int numer2, int denom2) {
		
		
		int n= denom1 * numer2 + denom2 * numer1;
		int d = denom1 * denom2;
		int n1=0;
		int n2=0;
		for(int i=1; i<n; i++) {
			if(n % i ==0 && d % i ==0) {
				n1 = n / i;
				n2 = d / i;
			}
		}

		int[]answer = {n1,n2};
	
		for(int num : answer) {
			System.out.println(num);
		}
		
		
		
		
		return answer;
	}
	
	public static void main(String[] args) {
		int a=9, b=2,c=1,d=3;
		
		
		
		solution(a,b,c,d);
	}

}
