package Programmers_Java.lv0;

public class 이차원으로만들기 {

	public static void main(String[] args) {
		int[] num_list = {100, 95, 2, 4, 5, 6, 18, 33, 948};
		int n = 3;
		int[][] answer = new int[num_list.length/n][n];
		int index = 0;
//		int index1 = 0;
//		
//		for(int i=0; i<num_list.length; i+=n) { //행열 따로 넣어야 할듯
//			answer[index][0] = num_list[i];
//			index++;
//		}
//		for(int i=1; i<num_list.length; i+=n) { //행열 따로 넣어야 할듯
//			answer[index1][1] = num_list[i];
//			index1++;
//		}
	
//		for(int a[] : answer) {
//		for(int b : a) {
//			System.out.println(b);
//		}
//	}
//	
		
		//그게 아니라 걍 한 번에 넣어야 함
		for(int i=0; i<num_list.length/n; i++) {
			for(int j=0; j<n; j++) {
				answer[i][j] = num_list[index];
				index++;
			}
		}
		
		

		

	}

}
