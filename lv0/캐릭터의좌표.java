package Programmers_Java.lv0;

public class 캐릭터의좌표 {

	public static void main(String[] args) {
		String[] keyinput = {"up", "up", "up", "down"};
		int[] board = { 3, 3 };
		int[] answer = new int[2];
		int x = 0;
		int y = 0;
		for (int i = 0; i < keyinput.length; i++) {
			
			
			if (keyinput[i].equals("left")) {
				x = x - 1;
				if (Math.abs(x) > board[0] / 2) {
					x = x + 1;
					continue;
				}
			} else if (keyinput[i].equals("right")) {
				x = x + 1;
				if (Math.abs(x) > board[0] / 2) {
					x = x - 1;
					continue;
				}

			} else if (keyinput[i].equals("up")) {
				y = y + 1;
				if (Math.abs(y) > board[1] / 2) {
					y = y - 1;
					continue;
				}
			} else if (keyinput[i].equals("down")) {
				y = y - 1;
				if (Math.abs(y) > board[1] / 2) {
					y = y + 1;
					continue;
				}
			}
		}
		answer[0] = x;
		answer[1] = y;

		for (int a : answer) {
			System.out.println(a);
		}

	}

}
