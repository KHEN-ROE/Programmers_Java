package Programmers_Java.lv0;

import java.util.HashMap;
import java.util.Map;

//해시맵 연습
public class HashMapPR {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("kim", 010123123);
        map.put("lee", 010123222);

        System.out.println(map.keySet());
        System.out.println(map.entrySet());

    }
}
