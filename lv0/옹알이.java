package Programmers_Java.lv0;

public class 옹알이 {
	
	static String[]babbling1 = {"aya", "yee", "u", "maa", "wyeoo"};
	static String[]babbling2 = {"ayaye", "uuuma", "ye", "yemawoo", "ayaa"};
	
	public static int solution(String[]babbling) {
		int count=0;
		
		for(int i=0; i<babbling1.length-1; i++) {
			if(babbling1[i]==babbling[i]) {
				count++;
				}	
		}
		
		System.out.println(count);
		
		for(int i=0; i<babbling2.length-1; i++) {
			if(babbling2[i].contains(babbling[i])) {
				count++;
			}
		}
		
		System.out.println(count);
		return count;
	}
	
	public static void main(String[] args) {
		String[]babbling = {"aya", "ye", "woo", "ma" };
		
		solution(babbling);
		
	}

}
