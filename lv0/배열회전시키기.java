package Programmers_Java.lv0;

public class 배열회전시키기 {

	public static int[] solution(int[] numbers, String direction) {
		
		int[] answer = new int[numbers.length];
		int index=0;
		
		//기억할 것 !! : 문자열 비교는 equals로 해야함. 자바에서는 ==해도 통과인데, 다른데선 자동으로 안바꿔줌.
		if(direction.equals("right")) {
			for(int i=1; i<numbers.length; i++) {
				answer[0] = numbers[numbers.length-1];
				answer[i] += numbers[index];
				index++;
			}
		}
	
		if(direction.equals("left")) {
			for(int i=1; i<numbers.length; i++) {
				answer[numbers.length-1] = numbers[0];
				answer[index] = numbers[i];
				index++;
			}
		}
		
		for(int a : answer) {
			System.out.println(a);
		}
		
		return answer;
	}
	
	
	public static void main(String[] args) {
		int[] numbers = {4, 455, 6, 4, -1, 45, 6};
		String direction = "left";
		
		solution(numbers, direction);
		
		
	
		

	}

}
