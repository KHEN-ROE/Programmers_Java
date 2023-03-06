package lv0;

public class 배열뒤집기 {
	public static void main(String[] args) {
		int[] num_list = {1, 2, 3, 4, 5};
		  int[] answer = new int[num_list.length];
		  
		 		  
		for(int i = 0; i<num_list.length; i++) {
			answer[i] = num_list[num_list.length-1-i];
		}
		
		for(int i=0; i<answer.length; i++) {
			System.out.println(answer[i]);
		}
		
		//내가 하고 싶었던 풀이
		 int index = 0;
	     for(int i = num_list.length-1; i>=0; i--){
	         answer[index] = num_list[i];
	         index++;
	        }
	     
	     for(int i=0; i<answer.length; i++) {
				System.out.print(answer[i]);
			}
		
		
	}
}
