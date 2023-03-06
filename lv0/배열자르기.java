package lv0;

public class 배열자르기 {

	public static void main(String[] args) {
		int[]numbers = {1, 2, 3, 4, 5};
		
		int num1 = 1;
		int num2 = 3;
		int[] answer = new int[(num2 - num1)+1];
		
		int index=0;
		
		for(int i=num1; i<num2+1; i++) {
			answer[index] = numbers[i];
			index++;
		}
		
		for(int num : answer) {
			System.out.print(num);
		}
		
		

	}

}
