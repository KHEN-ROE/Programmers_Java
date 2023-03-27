//package Programmers_Java.lv0;
//
//import java.math.BigInteger;
//
//public class 구슬을나누는경우의수 {
//
//	public static void main(String[] args) {
//		
//		//큰수는 정수 범위 값 초과한다. Integer객체로 만들면 되지 않을까
//		String balls = "30"; //16넘어 가면 - 됨 
//		int share = 15;
//		BigInteger answer = new BigInteger("0");
//		
//		BigInteger b1 = new BigInteger("1");
//		BigInteger c1 = new BigInteger("1");
//		BigInteger bs = new BigInteger("1");
//		
//		BigInteger index = new BigInteger("1");
//		
//		//일단 팩토리얼 구한다
//		for(int i=1; i<=balls.length(); i++) {
//			b1 = b1.multiply(index);
//			int a = index.intValue();
//			a++;
//			Integer.valueOf(a);
//			
//			index = new BigInteger(a);
//		}
//		
//		//share의 팩토리얼
//		for(int i=1; i<=share; i++) {
//			 s1 = s1 *  i;
//		}
//		
//		//b-s의 팩토리얼
//		for(int i=1; i<balls-share+1; i++) {
//			bs = bs * i;
//		}
//		//정답을 구하는 공식
//		answer = b1 / (bs * s1);
//		
//		System.out.println(answer);
//		
//	}
//
//}
