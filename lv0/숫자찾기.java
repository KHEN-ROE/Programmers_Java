package Programmers_Java.lv0;

public class 숫자찾기 {

	public static void main(String[] args) {
		int num = 21412;
		int k = 4;
		int answer = 0;
		
		 	String s = Integer.toString(num);
		    String s2 = Integer.toString(k);
			
			
			String st1[] = s.split(""); 
			String st2[] = s2.split("");
			
			
			for(int i=0; i<st2.length; i++) {
				for(int j=0; j<st1.length; j++) {
					if(st1[j].equals(st2[i])) {
						answer = j+1;
						break;
					}
					else {
						answer = -1;		
					}
					
				}
			}
		System.out.println(answer);
		
		//이클립스에서는 되는데 프로그래머스에서는 안돼서 다른 풀이
		if(s.indexOf(s2)== -1) {
			answer = -1;
		}
		else {
			answer = s.indexOf(s2) + 1;
		}
		System.out.println(answer);
		
	}

}
