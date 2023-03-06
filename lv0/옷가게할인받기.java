package Programmers_Java.lv0;

public class 옷가게할인받기 {

	public static void main(String[] args) {
		int price = 580;
		int answer=0;
		
		if(price >= 100000 && price < 300000) {
			answer = (int) (price * 0.95);
		}
		else if (price >= 300000 && price < 500000) {
			answer = (int) (price * 0.9);
		}
		else if (price >= 500000) {
			answer = (int) (price * 0.8);
		}
		else answer = price;
		
		System.out.println(answer);

	}

}
