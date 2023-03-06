package lv0;

public class 배열원소의길이 {

	public static void main(String[] args) {
		String[] strlist = {"We", "are", "the", "world!"};
		int[]answer = new int[strlist.length];
	
		
		for(int i=0; i<strlist.length; i++) {
			answer[i] = strlist[i].length();
		}


	}

}
