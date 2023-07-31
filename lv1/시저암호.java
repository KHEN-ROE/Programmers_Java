package Programmers_Java.lv1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class 시저암호 {

    public static void main(String[] args) {

        String s = "x Y z";
        int n = 2;

        solution(s, n);
    }

    public static String solution(String s, int n) {

        StringBuilder answer = new StringBuilder();

        // map 사용 해보자

        // 대문자
        char[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

        // 소문자
        char[] alphabet2 = new char[alphabet.length];

        for (int i = 0; i < alphabet.length; i++) {
            alphabet2[i] = Character.toLowerCase(alphabet[i]);
        }

        // 빈 리스트
        List<Character> list = new ArrayList<>();

        // 키 값이 서로 reverse인 map 2개 선언
        // 대문자 맵
        Map<Integer, Character> uMap = new HashMap<>();
        Map<Character, Integer> uMap2 = new HashMap<>();

        // 소문자맵
        Map<Integer, Character> lMap = new HashMap<>();
        Map<Character, Integer> lMap2 = new HashMap<>();


        // map에 값 저장
        for (int i = 0; i < alphabet.length; i++) {
            uMap.put(i, alphabet[i]);
            lMap.put(i, alphabet2[i]);
        }
        for (int i = 0; i < alphabet.length; i++) {
            uMap2.put(alphabet[i], i);
            lMap2.put(alphabet2[i], i);
        }

        // 붙어있는 문자열을 다 자른다.
        char[] chars = s.toCharArray();


        // 규칙대로 문자를 이동시키고 리스트에 저장
        for (int i = 0; i < chars.length; i++) {
            // 대문자인 경우
            if (Character.isUpperCase(chars[i])) {
                extracted(n, list, uMap, uMap2, chars, i);
            }

            // 소문자인 경우
            if (Character.isLowerCase(chars[i])) {
                extracted(n, list, lMap, lMap2, chars, i);
            }

            // 공백도 리스트에 추가
            if (chars[i] == ' ') {
                list.add(chars[i]);
            }
        }

        // 리스트를 문자열로 변환
        for (Character character : list) {
            answer.append(character);
        }

        System.out.println("answer = " + answer);

        return answer.toString();
    }

    private static void extracted(int n, List<Character> list, Map<Integer, Character> map, Map<Character, Integer> map2, char[] chars, int i) {
        if (map.containsValue(chars[i])) {
            Integer integer = map2.get(chars[i]);
            if ((integer + n) > 25) {
                list.add(map.get((integer + n - 25) - 1));
            } else {
                list.add(map.get(integer + n));
            }
        }
    }
}
