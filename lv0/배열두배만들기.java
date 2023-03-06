package Programmers_Java.lv0;

public class 배열두배만들기 {

	
	
	public static void main(String[] args) {
		
		int  numbers[] = {1,2,3,4,5};
		int numbers1[]=new int[numbers.length];
		
		for(int i=0; i<numbers.length; i++) {
			numbers1[i] = numbers[i]*2;
			System.out.println(numbers1[i]);
		}
		
		
		
	}

}
