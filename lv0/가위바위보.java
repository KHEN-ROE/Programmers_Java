package Programmers_Java.lv0;

public class 가위바위보 {

	public static void main(String[] args) {
		String rsp = "2052";
		
		String s = "2";
		String r = "0";
		String p = "5";
		
		String st [] =rsp.split("");
		
		String answer = "";
		

		for(int i=0; i<st.length; i++) {
			if(st[i].equals(s)) {
				answer += r;
				
			}
			if(st[i].equals(r)) {
				answer += p;
			}
			if(st[i].equals(p)) {
				answer += s;
			}
		}
			
		
		
		System.out.println(answer);
	}

}
