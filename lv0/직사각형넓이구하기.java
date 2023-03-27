package Programmers_Java.lv0;

public class 직사각형넓이구하기 {

	public static void main(String[] args) {
		int[][] dots = {{-1, -2}, {-1, 2}, {-3, -2}, {-3,2}};
		int answer = 0;

		int max=0;
		int min=513;
		
		int max2=0;
		int min2=513;
		
		
		for(int i=0; i<dots.length; i++) {
			if(Math.abs(dots[i][0]) > max) {
				max = dots[i][0];
			}
			if(Math.abs(dots[i][0]) <min) {
				min = dots[i][0];
			}
		}
		int v = max-min;
		
		for(int i=0; i<dots.length; i++) {
			if(Math.abs(dots[i][1]) > max2) {
				max2 = dots[i][1];
			}
			if(Math.abs(dots[i][1]) <min2) {
				min2 = dots[i][1];
			}
		}
		int h = max2-min2;
		
		answer = Math.abs(v * h);
		
		System.out.println(answer);
		
		
		
		
		
//		int max_x = dots[0][0];
//        int min_x = dots[0][0];
//        int max_y = dots[0][1];
//        int min_y = dots[0][1];
//        
//        for (int i = 1; i < dots.length; i++) {
//            int x = dots[i][0];
//            int y = dots[i][1];
//            
//            if (x > max_x) {
//                max_x = x;
//            } else if (x < min_x) {
//                min_x = x;
//            }
//            
//            if (y > max_y) {
//                max_y = y;
//            } else if (y < min_y) {
//                min_y = y;
//            }
//        }
//        
//        int width = max_x - min_x;
//        int height = max_y - min_y;
//        int area = width * height;
	}

}
