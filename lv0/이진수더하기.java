package Programmers_Java.lv0;

public class 이진수더하기 {

	public static void main(String[] args) {
		String bin1 = "10";
		String bin2 = "11";
		String answer = "";

		//binary를 decimal로 변환
		int d1 = Integer.parseInt(bin1, 2);
		int d2 = Integer.parseInt(bin2, 2);
		
		//둘을 더해주고
		int d3 = d1 + d2;
		
		//다시 이진수로 변환
//		answer = Integer.toBinaryString(d3); // 이게 편하긴 한데 반복문으로 짜보면?
		
		while(d3>0) {
			int remainder = d3 % 2;
			answer = Integer.toString(remainder) + answer;
			d3 = d3/2;
			
		}
		
		System.out.println(answer);
		
		

	}

}
