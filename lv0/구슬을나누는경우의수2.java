package Programmers_Java.lv0;

import java.math.BigInteger;

public class 구슬을나누는경우의수2 {
    public static void main(String[] args) {
        //다른 방법
        int balls = 5;
        int share = 3;
        BigInteger top = BigInteger.ONE;
        BigInteger bom = BigInteger.ONE;
        for(int i=0; i<share; i++){
            top = top.multiply(BigInteger.valueOf(balls-i));
            bom = bom.multiply(BigInteger.valueOf(share-i));
        }
        System.out.println(top.divide(bom));
    }
}
