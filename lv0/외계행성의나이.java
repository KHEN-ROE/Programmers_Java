package Programmers_Java.lv0;

public class 외계행성의나이 {

	public static void main(String[] args) { //해결은 했는데 코드가 거지 같네...
		int age = 100;
		String answer = "";
		
		String alpha = "abcdefghij";
		
		String []ap = alpha.split("");
				
		String s ="";
		s = Integer.toString(age);
	
		String ag[] = s.split("");
		
		int arr[] = new int[ag.length];
		
		String [] num = {"0","1","2","3","4","5","6","7","8","9"};
		
		String str[] = new String[ag.length];
		
		for(int i=0; i<ag.length; i++) {
			for(int j=0; j<num.length; j++) {
				if(ag[i].equals(num[j])) {
					arr[i] = Integer.parseInt(num[j]);
					str[i] = ap[arr[i]];
					answer += str[i];
					System.out.println(answer);
				}
			}
		}
			 
		
	}

}
