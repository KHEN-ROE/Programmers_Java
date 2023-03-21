package Programmers_Java.lv0;

public class 모스부호1 {
	public static void main(String[] args) {

		String[][]morse = {{".-","a"},
				{"-...","b"},
				{"-.-.","c"},
				{"-..","d"},
				{".","e"},
				{"..-.","f"},
				{"--.","g"},
				{"....","h"},
				{"..","i"},
				{".---","j"},
				{"-.-","k"},
				{".-..","l"},
				{"--","m"},
				{"-.","n"},
				{"---","o"},
				{".--.","p"},
				{"--.-","q"},
				{".-.","r"},
				{"...","s"},
				{"-","t"},
				{"..-","u"},
				{"...-","v"},
				{".--","w"},
				{"-..-","x"},
				{"-.--","y"},
				{"--..","z"}};
		
		
		String letter = ".... . .-.. .-.. ---";
		String answer = "";
		String str[]= letter.split(" ");
		
		for(int i=0; i<str.length; i++) {
			for(int j=0; j<morse.length; j++) {
				if( str[i].compareTo(morse[j][0])==0) {
					answer += morse[j][1];
				}
			}
		}
		System.out.println(answer);	
	}
}
