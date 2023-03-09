package Programmers_Java.lv0;

public class 문자반복출력하기 {

	public static void main(String[] args) { //다시 풀 것... 못 풀었다.
		String my_string = "hello";
		int n = 3;
		String []answer = my_string.split(""); //split은 문자열 잘라서 배열로 리턴
		StringBuilder sb = new StringBuilder(); // append 메소드 쓰려고 객체 생성
		
		for(int i=0; i<my_string.length();i++) {
			sb.append(answer[i].repeat(n));//배열의 각원소 n만큼 반복하고, append로 각각 붙인 다음에 문자열로 리턴
		}
		System.out.println(sb.toString());
		
		
		//내가 하고 싶었던 풀이. 거의 다 왔는데...
		 String answer1 = "";

	        for(int i=0; i<my_string.length(); i++){
	            for(int j=0; j<n; j++){
	                answer1+=my_string.charAt(i);
	            }
	        }
	        System.out.println(answer1);
	        
//	        for(int i=0; i<my_string.length();i++) { //총 5글자 반복
//	        	for(int j=0; j<n; j++) { // 한 글자당 3번씩
//	        		answer1 += my_string.charAt(i);
//	        	}
//	        }
//	        System.out.println(answer1);
	}

}
