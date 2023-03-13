package Programmers_Java.lv0;

import java.util.Scanner;

public class 직각삼각형출력하기 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        System.out.println("정수 n 입력"); 
        int n = sc.nextInt();
        
        String s="*";
        String str="";
        int a=n;
        
        for(int i=n-1; i>=0; i--) { //맨처음에 * 하나만 찍어야 하므로 i가 n-1부터 시작
        	if(a==n) {
        		str = s.repeat(n-i); // 맨 첨에 하나만 찍는다
        		System.out.print(str);
        	}
        	System.out.println();	
        }	
        
        
        
        //간단한 풀이법
        for(int i=1; i<=n; i++){
            System.out.println("*".repeat(i));
        }
        
        //풀이3
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
       
        
      

	}

}
