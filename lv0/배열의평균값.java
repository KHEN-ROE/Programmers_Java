package lv0;

public class 배열의평균값 {

	public static void main(String[] args) {
		int[]numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int sum=0;
		int count=0;
		
		for(int i=0; i<numbers.length; i++) {
			sum += numbers[i];
			count++;
		}
		double avg = (double) sum/count;
		
		System.out.println(sum);
		System.out.println(count);
		System.out.println(avg);
	}

}
