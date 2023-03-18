package Programmers_Java.lv0;

import java.util.Arrays;

public class 한번등장한문자 {

	public static void main(String[] args) {
		String s = "helloworld";
		String answer = "";
		int index=0;
		
		//일단 문자열을 쪼갠다
		String []str = s.split("");
		//미리 오름차순으로 정렬. 나중에 할려니까 null 때메 에러남
		Arrays.sort(str);
		//정답을 저장할 배열 선언
		String[]str1 = new String[str.length];
		
		//비교를 한다. 
		for(int i=0; i<str.length; i++) {
			//마지막 하나 남으면 배열에 삽입
			if(i >= str.length-1) { // 여기가 문제 일 수도
				str1[index] = str[i];
				break;
			}
			
			for(int j=i+1; j<str.length; j++) {
				if(str[i].compareTo(str[j])<0) {
					str1[index] = str[i];
					index++;
					break;
				}
				else if (str[i].compareTo(str[j])==0) {
					if (j<str.length-1) {
						if(str[j].compareTo(str[j+1])==0) { // 여기가 문제네. 범위초과하는경우? j가 마지막 인덱스 가리킬 때 이 if문 못들어 오도록 설정
							str[j+1] = str[j+1].replace(str[j+1], ""); //세 개의 문자가 같은 경우 다음 문자도 제거
						}
					}
					str[j] = str[j].replace(str[j], ""); //중복되는 문자 제거
					str[i] = str[i].replace(str[i], ""); //중복되는 문자 제거
					break;
				}
			}
		}
	
		for(int i=0; i<str1.length; i++) {
			if(str1[i] != null) { //null 을 제거할 수는 없으므로 null이 아닌 값만 출력
				answer += str1[i];
			}	
		}
		
		System.out.println(answer);
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		int flag=0;
//		String str[] = s.split("");
//		
//		for(int i=0; i<str.length; i++) {
//			for(int j=i+1; j<str.length; j++) {
//				if(str[i].equals(str[j])) {
//					str[j] = str[j].replace(str[j], "");
//					flag++;
//				}
//			}
//			//모든 문자가 한번 씩만 등장하면 이하의 코드가 필요 없어진다
//			str[i] = str[i].replace(str[i], "");
//			flag++;
//			if(flag >= str.length-1) break;
//			
//		}
//		
//		Arrays.sort(str);
//		
//		for(int i=0; i<str.length; i++) {
//			answer += str[i];
//		}
//		
//		
//		System.out.println(answer);
//		

	}

}
