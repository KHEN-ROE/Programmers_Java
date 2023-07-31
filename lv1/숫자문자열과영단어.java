package Programmers_Java.lv1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class 숫자문자열과영단어 {

    public static void main(String[] args) {
        String s = "one4seveneight";
        solution(s);
    }

    public static int solution(String s) {
        int answer = 0;

        // map을 이용하여 해결
        Map<String, Integer> map = new HashMap<>();
        map.put("zero", 0);
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        map.put("five", 5);
        map.put("six", 6);
        map.put("seven", 7);
        map.put("eight", 8);
        map.put("nine", 9);

        String[] str = s.split("");
        String temp = "";

        // 숫자를 포함하는 지 확인하는 정규식 - 이걸 그냥 isDigit 함수 써도 됨
        String pattern = "^[0-9]*$";

        List<Integer> list = new ArrayList<>();

        for (String s1 : str) {
            temp += s1;
            if (Pattern.matches(pattern, temp)) {
                list.add(Integer.parseInt(temp));
                temp = "";
            }
            if (map.containsKey(temp)) {
                list.add(map.get(temp));
                temp = "";
            }
        }

        // Integer 리스트를 하나의 int 필드로 변환하는 과정
        StringBuilder sb = new StringBuilder();

        // StringBuilder의 append 메서드는 다양한 타입의 매개변수 처리 가능
        // append에 Integer를 전달하면 Integer의 toString메서드가 호출되어 정수가 문자열로 변환된다.
        for (Integer integer : list) {
            sb.append(integer);
        }

        answer = Integer.parseInt(sb.toString());


        return answer;


// 모범답안
//        String[][] mapArr = {{"0", "zero"},
//                {"1", "one"},
//                {"2", "two"},
//                {"3", "three"},
//                {"4", "four"},
//                {"5", "five"},
//                {"6", "six"},
//                {"7", "seven"},
//                {"8", "eight"},
//                {"9", "nine"}};
//
//        for (String[] map : mapArr) {
//            s = s.replace(map[1], map[0]); // String은 불변인데 이게 어떻게 가능?
                                            // 이것은 변화시키는 것이 아니라 새로운 String 객체를 만들고 거기에 s를 할당하는 것임
//        }
//
//        int answer = Integer.parseInt(s);
//        return answer;
    }
}
