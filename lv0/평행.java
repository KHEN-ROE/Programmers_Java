package Programmers_Java.lv0;

public class 평행 { //틀림... 기울기를 구해야함

	static int dots1[][] = {{1, 4}, {9, 2}, {3, 8}, {11, 6}};
	static int dots2[][] = {{3, 5}, {4, 1}, {2, 4}, {5, 10}};
	
	public static int solution(int[][]dots) {
		int answer=0;
		for(int i =0; i<dots.length; i++) {
			for (int j=0; j<dots[0].length; j++){
				dots[i][j] = dots1[i][j];
//				System.out.print(dots[i][j]);
			}
		}
		if((dots[1][0]-dots[0][0] == 8 && dots[0][1]-dots[1][1]==2) && (dots[3][0]-dots[2][0]==8 && dots[2][1]- dots[3][1]==2)) {
			answer = 1;
			System.out.println("두 선분은 평행");
			
		}
		else {
			answer = 0;
			System.out.println("평행하지 않음");
		}

		for(int i =0; i<dots.length; i++) {
			for (int j=0; j<dots[0].length; j++){
				dots[i][j] = dots2[i][j];
			}
		}
		if((dots[1][0]-dots[0][0] == 8 && dots[0][1]-dots[1][1]==2) && (dots[3][0]-dots[2][0]==8 && dots[2][1]- dots[3][1]==2)) {
			answer = 1;
			System.out.println("두 선분은 평행");
			
		}
		else {
			answer = 0;
			System.out.println("평행하지 않음");
		}
		
		
		return answer;
	}
	
	public static void main(String[] args) {
		int x1 = 0,y1 =0;
		int x2 = 0,y2 =0;
		int x3 = 0,y3 =0;
		int x4 = 0,y4 =0;
		
		int dots[][]= {{x1,y1},{x2,y2},{x3,y3},{x4,y4}};
		
		solution(dots);

	}

}
