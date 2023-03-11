package Programmers_Java.lv0;


public class 대문자와소문자 {

	public static void main(String[] args) { //아스키 코드 사용하여 비교
		/*
		a~z = 97~122
		A~Z = 65~90
		*/
		
//		String my_string = "abCdEfghIJ";
//		String answer = "";
//		
//		//아스키 코드값 비교 위해 스트링을 char 타입으로 변환
//		char [] ch = my_string.toCharArray();
//		
//		String temp="";
//		
//		for(int i=0; i<ch.length; i++) {
//			if(ch[i] >= 97 && ch[i] <= 122) { //소문자 추출
//				temp = ch[i] + ""; // 그냥 temp = ch[i]는 안되는데 + "" 하니까 되네?
//				answer += temp.toUpperCase();
//			}
//			else if(ch[i] >= 65 && ch[i] <= 90) {
//				temp = ch[i] + "";
//				answer += temp.toLowerCase();
//			}
//		}
//		System.out.println(answer);
		
		
		//내가 만든 버전 - split으로 잘라서 all대문자 vs 원본 , all소문자 vs 원본 비교해서 바꿔줌. 
//						다 풀었는 데 if-else if 안쓰고 if if 써서 마무리 못함
		 String answer = "";
		 String my_string = "abCdEfghIJ";
		 
	        String s = my_string.toUpperCase();
			String s1 = my_string.toLowerCase();
			
			
			String st[] = s.split(""); //다 대문자
			String st1[] = s1.split(""); //다 소문자
			
			
			String str[] = my_string.split(""); // 섞인 것
			
			for(int i=0; i<str.length; i++) { 
				if(!str[i].equals(st[i])) {//대문자와 비교
					answer += str[i].toUpperCase(); //소문자들을 대문자로 변환
				}
				else if(!str[i].equals(st1[i])) { // 소문자와 비교
						answer += str[i].toLowerCase(); // 대문자들을 소문자로 변환
				}
				
			}

			System.out.println(answer);
		
	}

}
