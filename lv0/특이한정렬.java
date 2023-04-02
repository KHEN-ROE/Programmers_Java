package Programmers_Java.lv0;

import java.util.Arrays;

public class 특이한정렬 {
    public static void main(String[] args) {
//        int[] numlist = {600, 400, 300, 200, 700, 800, 100, 900};
//        int n = 500;
        int[] numlist = {10,9,8,7,6,5,4,3,2,1,11};
        int n = 6;

        int answer[] = new int[numlist.length];
        int arr[] = new int[numlist.length];
        for (int i = 0; i < numlist.length; i++) {
            arr[i] = Math.abs(numlist[i] - n);
        }

        Arrays.sort(arr);
        //arr은 numlist[i]에서 n뺀 배열

        int index = 1;
        for (int i = 0; i < numlist.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(Math.abs(numlist[i]-n) == arr[j]) {
                    if( j != arr.length-1){
                        if(arr[j]==arr[j+1]){
                            answer[j+1] = answer[j];
                            answer[j] = numlist[i];
                            break;
                        }else {
                            answer[j] = numlist[i];
                            break;
                        }
                    }
                    else {
                        answer[j] = numlist[i];
                    }
                }
            }
        }
        for(int a : answer){
            System.out.print(" "+a);
        }

//        int[] numlist = {10000,20,36,47,40,6,10,7000};
//        int n = 30;
//
//        String num = "";
//        //numlist를 문자열 배열로 변환
//        for(int i=0; i < numlist.length; i++){
//            num = num + Integer.toString(numlist[i]);
//            num += " ";
//        }
//        String[]num1 = num.split(" ");
//
//
//        //정답을 담을 배열
//        String answer[] = new String[numlist.length];
//
//        //원소와 n의 차를 담을 배열
//        int arr[] = new int[numlist.length];
//
//        //오름차순으로 정렬 안 된 배열
//        int arr1[] = new int[numlist.length];
//
//
//        //원소와 n의 차를 구하고 절대값 씌운 후 배열에 저장
//        for (int i = 0; i < numlist.length; i++) {
//            arr[i] = Math.abs(numlist[i] - n);
//        }
//
//        //마찬가지로 차를 구해서 저장하는데, 정렬을 안 할 거임
//        for (int i = 0; i < numlist.length; i++) {
//            arr1[i] = Math.abs(numlist[i] - n);
//        }
//
//        //배열을 오름차순으로 저장
//        Arrays.sort(arr);
//
//        //arr 배열을 문자열로 변환
//        String s = "";
//        String s1 = "";
//
//        for (int i = 0; i < arr.length; i++) {
//            s += Integer.toString(arr[i]);
//            s1 += Integer.toString(arr1[i]);
//        }
//        String[] str = s.split(""); // 정렬된 배열
//        String[] str1 = s1.split(""); // 정렬 안 된 배열
//
//
//        //원소 - n 을 해서 저장된 배열 중에, 정렬된 배열과 정렬 안 된 배열을 비교할 거임
//        for (int i = 0; i < str.length; i++) {
//            for (int j = 0; j < str1.length; j++) {
//                if(str[i].equals(str1[j])){
//                    if( j < str1.length-1){
//                        if(str1[j].equals(str1[j+1])){
//                            answer[i+1] = num1[j];
//                            answer[i] = num1[j+1];
//                            break;
//                        }
//                    }
//                    answer[i] = num1[j];
//                    str1[j] = str1[j].replace(str1[j], "");
//                    break;
//                }
//            }
//            //answer가 다 채워졌을 때 중단 조건
//            if(answer[answer.length - 1] != null) break;
//        }

        //문자열

    }

}
