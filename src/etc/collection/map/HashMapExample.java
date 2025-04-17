package etc.collection.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {

        /*
        # Map
        - Key / Value가 한 세트를 이루는 자료구조
        - Key값을 통해 Value를 참조하는 방식 (인덱스 x)
        - Key는 중복 저장을 허용하지 않음.
         */

        // Map 은 Key, Value 쌍을 이루기 때문에 멀티 제네릭을 선언
        Map<String , String> map = new HashMap<>();

        // Map 에 데이터를 추가 : put(key, value)
        map.put("멍멍이", "홍길동");
        map.put("야옹이", "김철수");
        map.put("쨱짹이", "박영희");
        System.out.println("map = " + map);

        // Key 를 중복 사용하는 경우
        // 기존 Key 에 맵핑된 value 가 수정됩니다.
        map.put("멍멍이", "김춘식");  // Key 중복
        map.put("어흥이", "김철수");  // value 중복
        System.out.println("map = " + map);

        // key의 존재 유무를 확인 : containsKey(Key)
        // value 얻기 : get(Key)
        String  nick = "메롱이";
        if (map.containsKey("메롱이")) {
            System.out.printf("별명이 %s인 학생의 이름은 %s입니다.\n", nick, map.get(nick));
        } else {
            System.out.println("그런 별명은 없습니다.");
        }

        // Map 에서 Key 들만 추출하는 메서드 KeySet()
        // 모든 Key 들을 Set 에 담아서 반환합니다 -> forEach 사용이 가능
        for (String k : map.keySet()) {
            System.out.printf("key: %s, value: %s\n", k, map.get(k));
        }

        // Map 의 객체를 삭제: remove(key)
        // key 를 주면 value 도 함께 제거
        map.remove("야옹이");
        System.out.println("map = " + map);

        map.clear();

        // Collection 의 메서드는 Collection 인터페이스 타입을 전달받기 때문에
        // Map은 사용이 힘들다
//        Collections.addAll(map, 1, 2, 3, 4);  (x)
    }
}
