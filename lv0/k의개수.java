package Programmers_Java.lv0;

public class k의개수 {

	public static void main(String[] args) {
		int i = 1;
		int j = 20;
		int k = 9;
		
		//1부터 13까지 담을 배열 선언
		int arr[]=new int [j];
		int answer = 0;
		int index=0;
		String str[] = new String[arr.length];
		String s1="";
		
		//k를 문자열로 변환
		String k1 = Integer.toString(k);
		
		//i부터 j까지의 정수 배열을 만든다. 
		//문자열로 변환하고 자름
		//k와 비교해서 개수 카운트
		
		//1부터 13까지 들어있는 배열 생성
		for(int a=i; a<=j; a++) {
			arr[index] = a;
			index++;
		}
		//비교를 위해 문자열로 변환
		for(int b=0; b<str.length; b++) {
			str[b] = Integer.toString(arr[b]);
			s1 += str[b];
		}
		
		//자름
		String str2[] = new String[100];
		str2 = s1.split("");

		//비교
		for(int c=0; c<str2.length; c++) {
			if(str2[c].equals(k1)) {
				answer++;
			}
		}
		System.out.println(answer);
		
	}

}
